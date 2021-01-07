package com.oop.emp.model.Employee.controller;		

import com.oop.employee.model.vo.Employee;

public class RUN {

	public static void main(String[] args) {
		 Employee ki =new  Employee( );			//null 값 
			Employee ki2 = new Employee(1, "홍길동", '남', "010-7777-7777");
			Employee ki3 = new Employee(2, "유관순", '여', "010-3131-3131", "영업부", 3000000, 0.15);
			ki.printEmployee();
			ki2.printEmployee();
			ki3.printEmployee();
	}

}
