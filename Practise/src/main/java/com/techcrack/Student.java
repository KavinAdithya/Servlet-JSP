package com.techcrack;
public class Student{
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private int age=0;
	private String name=null;
	public Student(String name,int age) {
		this.age=age;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Name = "+name+" Age ="+age;
	}
	
}