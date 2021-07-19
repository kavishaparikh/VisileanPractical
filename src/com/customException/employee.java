package com.customException;

public class employee {
	
	
	private int ID;
	private String name;
	
	public employee(int iD, String name) {
		super();
		ID = iD;
		this.name = name;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "employee [ID=" + ID + ", name=" + name + "]";
	}
   
}
