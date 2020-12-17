package com.oop.emp.model.Employee;

import java.util.Scanner;

/**
 * 사원정보 관리용 클래스 Field 작성 :캡슐화 반득시 적용
 *1. 키보드입력용 메소드 : empInput() 2. emp객체 모든 필드 출력용 메소드 : empOutput() 3.
 * getter/setter메소드
 * 
 * @author 깔끔한청년
 * @Date 2020.12.18
 */
public class Employee {


	private int empNo;
	private int age;
	private int salary;
	private String empName;
	private String dept;
	private String job;
	private String phone;
	private String address;
	private char gender;
	private double bonusPoint;
	
	
	public void empInput(){
		Scanner sc=new Scanner(System.in);
		System.out.println("사번: ");
		setempNo(sc.nextInt());
		sc.nextLine();
		
		System.out.println("나이: ");
		setage (sc.nextInt());
		sc.nextLine();
		
		System.out.println("급여: ");
		setsalary(sc.nextInt());
		sc.nextLine();
		
		System.out.println("이름: ");
		setempName(sc.nextLine());
		
		System.out.println("소속정보: ");
		setdept(sc.nextLine());
		
		System.out.println("직급: ");
		setjob(sc.nextLine());
		
		System.out.println("핸드폰: ");
		setphone(sc.nextLine());
		
		System.out.println("주소: ");
		setaddress(sc.nextLine());
		
		System.out.println("성별:");
		setgender(sc.next().charAt(0));
		
		System.out.println("보너스포인트:");
		setbonusPoiunt(sc.nextDouble());
		sc.nextLine();
	}
	

	
	public void setempNo(int empNo) {	//setter
		this.empNo = empNo;
	}
	public void setage(int age) {
		this.age= age;
}
	public void setsalary(int salary) {
		this.salary= salary;
}
	public void setempName(String empName) {
		this.empName= empName;
}
	public void setdept(String dept) {
		this.dept= dept;
}
	public void setjob(String job) {
		this.job= job;
}
	public void setphone(String phone) {
		this.phone= phone;
}
	public void setaddress(String address) {
	this.address= address;

	}public void setgender(char gender) {
		this.gender= gender;
	}
	
	public void setbonusPoiunt(double bonusPoint) {
	this.bonusPoint=bonusPoint;
	}
	/**
	 * empInput 구간시작후  settter 구간종료 
	 */
	public void  empOutput() { 
		System.out.println("시번:"+getempNo()+"나이 :"+getage()+"급여:" +getsalary()+ "이름: " +getempName()+ "소속부서 :" + 
	getdept()+ "직급 :"+getjob() +"핸드폰:" +getphone()+ "주소 :"+getaddreess()+ "성별" +getgneder()+"보너스포인트 :"+bonusPoint());
	}
	public int getempNo() {
		return empNo;
	}
	public int getage() {
		return age;
	}
	public int getsalary() {
		return salary;
	}
	public String getempName() {
		return empName;
	}public String getdept() {
		return dept;
	}public String getjob() {
		return job;	
	}public String getphone() {
		return phone;
	}public String getaddreess() {
		return address;
	}public char getgneder() {
		return gender;
	}public double bonusPoint() {	
	return bonusPoint;
	}
	/**
	 * empOutput 구간시작흐 getter 구간종료
	 */
}
