package com.method.prac;
/**
 * 메소드 선언 : 메소드 를 실행할때 필요한 데이터 
 * @author 깔끔한청년
 * @Date 2020.12.20
 *
 */
public class Calculator {	
	void Powerup() {		//메소드 
		System.out.println("전원을 킵니다.");
	}
	int plus(int x, int y) {		//메소드{ }
		int result= x +y;
		return result;
	}
	double divide(int x,int y) 	{		//메소드 { } 
		double result =(double)x/(double)y;
		return result;
	}
	void PowerOff() {
		System.out.println("전원을 끕니다 ");
	}
	}

