package com.method.prac;
/**
 *메소드 선언부
 *리턴값이 없는 메소드 :void  return 문 예
 *
 *
 *@author 깔끔한청년
 *@Date 2020.12.20
 */

public class Car {
	int gas;		// 필드 
	
	void setGas(int gas) {
		this.gas=gas;
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("달립니다.(gas잔량:" +gas+ ")");
				gas-=1;
			}else {
				System.out.println("멈춥니다.(gas잔량:" +gas+ ")");
				return;
			}
		}
	}
}

