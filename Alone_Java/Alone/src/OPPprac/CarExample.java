package com.method.prac;
/**
 *  메소드 호출부
 * 
 *@author 깔끔한청년
 *@Date  2020.12.20
 */

public class CarExample {
	public static void main(String[] args) {
		Car my=new Car();
		 
		my.setGas(5);
		
		boolean gasState =my.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다 : ");
			my.run();
		}
		if(my.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		}else {
			System.out.println("gas를 주입하세요");
		}
	}

}
