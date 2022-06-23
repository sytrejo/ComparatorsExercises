package com.fdmgroup.lambdasandstream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import com.fdmgroup.comparison.Trainee;

public class Client {

	public static void main(String[] args) {
		
		//Pre- Java 7 - created the class the impl the interface
		IMathOperation addition = new MathOperationAddition();
		int result = addition.operation(5, 3);
		System.out.println(result);
		
		//Java 7 - Annonymous Inner class
		IMathOperation addition2 = new IMathOperation() {
			public int operation(int a, int b) {
				return a + b;
			}
		};		
		result = addition2.operation(10, 10);
		System.out.println(result);
		

		//Java 8 - Lambda Expression - replaces Annonymous Inner class
		// new IMathOperation() { } is replaced with ->
		IMathOperation addition3 =  (a,b) -> a + b; 
		//No need for the return keyword
		//no need for {} if the body is one line
		//no need for the argument types
		result = addition3.operation(15, 15);
		System.out.println(result);
		
		
		
		Person p1 = new Person(1,"Lisa", "Brown", 31 );
		Person p2 = new Person(22,"Kerry", "Black", 42 );
		Person p3 = new Person(3,"Kim", "Green", 33 );
		Person p4 = new Person(4,"Mark", "Whyte", 16 );
		
		Function<Person, String> getFullName = person -> person.getFirstName()+" "+person.getLastName();
		
		System.out.println(getFullName.apply(p1));
		System.out.println(getFullName.apply(p2));
		System.out.println(getFullName.apply(p3));
		System.out.println(getFullName.apply(p4));
		
		//Predicate
		Predicate<Person> oldEnoughToVote = person -> person.getAge() >=18;
		boolean canVote = oldEnoughToVote.test(p1);
		System.out.println("p1 can vote "+canVote);
		canVote = oldEnoughToVote.test(p2);
		System.out.println("p2 can vote "+canVote);
		p2.setAge(14);
		canVote = oldEnoughToVote.test(p2);
		System.out.println("p2 can vote "+canVote);
		
		//Consumer
		Consumer<Person> printFirstName = person -> System.out.println(person.getFirstName());
		printFirstName.accept(p1);
		printFirstName.accept(p2);
		printFirstName.accept(p3);
		
		
		//ForEach
		List<Person> persons = new ArrayList<>();
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);
		
		for(Person p : persons) {
			System.out.println(p);
		}
		
		persons.forEach(person -> System.out.println(person.getFirstName()));
		
		//Sort method - List.sort()
		persons.forEach(person -> System.out.println(person));
		Comparator<Person> sortByFirstName = (s1, s2) -> s1.getFirstName().compareTo(s2.getFirstName());
		//Collections.sort(persons, sortByFirstName );
		persons.sort(sortByFirstName);
		persons.forEach(person -> System.out.println(person));
		
		
		Predicate<Person> over30 = person -> person.getAge() >= 30;
		System.out.println(over30.test(p1));
		System.out.println(over30.test(p2));
		System.out.println(over30.test(p3));
		System.out.println(over30.test(p3));
		System.out.println("----------------");
		Predicate<Person> lName = (person) -> person.getFirstName().charAt(0) =='L';
		System.out.println(lName.test(p1));
		System.out.println(lName.test(p2));
		System.out.println(lName.test(p3));
		System.out.println(lName.test(p4));
		System.out.println("----------------");
		Predicate<Person> over30AndlName = over30.and(lName);
		System.out.println(over30AndlName.test(p1));
		System.out.println(over30AndlName.test(p2));
		System.out.println(over30AndlName.test(p3));
		System.out.println(over30AndlName.test(p4));
		
	}

}
