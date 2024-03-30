package com.techcrack;

public class Student {
	private String name=null;
	private int ID=0;
	Student(String name,int ID){
		this.name=name;
		this.ID=ID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
}
