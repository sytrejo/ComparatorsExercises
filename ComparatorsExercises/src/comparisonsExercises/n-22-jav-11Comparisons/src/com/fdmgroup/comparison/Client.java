package com.fdmgroup.comparison;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Client {
	
	public static void main(String[] args) {
		
		Trainee t1 = new Trainee(1,"Lisa", "111111", 31 );
		Trainee t2 = new Trainee(22,"Kerry", "2222222", 42 );
		Trainee t3 = new Trainee(3,"Kim", "313131", 33 );
		Trainee t4 = new Trainee(4,"Mark", "6666666", 16 );
		
		
		
		
		List<Trainee> trainees = new ArrayList<>();
		trainees.add(t1);
		trainees.add(t2);
		trainees.add(t3);
		trainees.add(t4);		
		System.out.println(trainees);
		
		for(int i = 0; i < trainees.size(); i++) {
			System.out.println(trainees.get(i));
		}
		System.out.println("---------------");
		printList(trainees);
		
		Collections.sort(trainees);
		
		System.out.println(trainees);
		printList(trainees);
		
		System.out.println("****** Sorted by name****");
		Collections.sort(trainees, new NameComparator());
		printList(trainees);
	
		
		System.out.println("****** Sorted by Age****");
		Collections.sort(trainees, new AgeComparator());
		printList(trainees);
		
		
		TreeSet<Trainee> traineeSet = new TreeSet<>();
		traineeSet.add(t1);
		traineeSet.add(t2);
		traineeSet.add(t3);
		traineeSet.add(t4);
		System.out.println(traineeSet);
		
		TreeSet<Trainee> traineeSet1 = new TreeSet<>(new NameComparator());
		
	
	}
	
	public static void printList(List<Trainee> trainees) {
		for(Trainee t : trainees) {
			System.out.println(t);			
		}
		
		
	}
	
	

	
	

}
