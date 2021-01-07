package com.oop.employee.model.vo;

public class Employee {		//접근제어자 
	private int empNo;
	private String name;
	private char gender;
	private String phone;
	private String dept;
	private int salay;
	private double bonusPet;
	public Employee() {		//기본생성자
	}
	public Employee(int empNo, String name,		//파라미터 생성자 
			char gender, String phone){
		 this.empNo = empNo;
		 this.name = name;
		 this.gender = gender;
		 this.phone = phone;
	}
	public Employee(int empNo, String name, 
			char gender, String phone, 
			String dept, int salay, 
			double bonusPet){
		 this(empNo, name, gender, phone);
		 this.dept = dept;
		 this.salay = salay;
		 this.bonusPet = bonusPet;
	}
	public void printEmployee() {
		System.out.println(empNo+", "+name+", "+gender+", "+phone+
				", "+dept+", "+salay+", "+bonusPet);
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalay() {
		return salay;
	}
	public void setSalay(int salay) {
		this.salay = salay;
	}
	public double getBonusPet() {
		return bonusPet;
	}
	public void setBonusPet(double bonusPet) {
		this.bonusPet = bonusPet;
	}


}
	