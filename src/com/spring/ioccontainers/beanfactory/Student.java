package com.spring.ioccontainers.beanfactory;

public class Student {
	private int rollNo;
	private String name;
	private String branch;

	public void getStudentDetails() {
		System.out.println(
				"student Name::" + this.name + "\n" + "Roll Number::" + this.rollNo + "\n" + "Branch::" + this.branch);
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public String getBranch() {
		return branch;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

}
