package com.studentapp.beans;

public class Student {
	
	private int rollNo;
	private String name;
	private String fatherName;
	private String email;
	private long contactNo;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	
	public void getDetails() {
		System.out.println("Student Details");
		System.out.println("--------------------------------------");
		System.out.println("Roll No : "+rollNo);
		System.out.println("Name : "+name);
		System.out.println("Father Name : "+fatherName);
		System.out.println("Email : "+email);
		System.out.println("Contact No : "+contactNo);
	}

}
