package com.fdmgroup.comparison;

public class Trainee implements Comparable<Trainee> {
	
	private int id;
	private String name;
	private String phone;
	private int age;
	
	public Trainee(int id, String name, String phone, int age) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Trainee [id=" + id + ", name=" + name + ", phone=" + phone + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Trainee t) {
		
		if(this.id > t.id) {
			return 1;			
		}else if(this.id < t.id) {
			return -1;
		}else {
			return 0;
		}
		
		//return this.name.compareTo(t.name);//compareTo already implemented in String class
	}
	
	
	
	

}
