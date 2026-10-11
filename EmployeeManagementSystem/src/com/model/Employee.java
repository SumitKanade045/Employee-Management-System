package com.model;

public class Employee {

	private int eid;
	private String name;
	private double salary;
	private long mNo;
	private int age;
	
	//Getter-Setter
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public long getmNo() {
		return mNo;
	}
	public void setmNo(long mNo) {
		this.mNo = mNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Employee [Employee ID=" + eid + ", Employee Name=" + name + ", Employee Salary=" + salary + ", Employee Mobile Number=" + mNo + ", Employee Age=" + age + "]";
	}
	
}
