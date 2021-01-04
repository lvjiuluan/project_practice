package edu.cqjtu.model;

public class CustomerInfo {
	private String name;
	private int age;
	private char gender;
	private String email;
	
	
	
	
	@Override
	public String toString() {
		return name + "\t"+ age +"\t"+ gender +"\t"+ email;
	}
	public CustomerInfo(String name, int age, char gender, String email) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
