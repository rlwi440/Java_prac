package com.method.prac;
/**
 * 메서드 호출부  
 * 메소드 선언 부에서 메소드 호출  import  의개념
 * @author 깔끔한청년
 * @Date 2020.12.20
 *
 */
public class CalcuclatorExample {
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();	//메소드 선언부 에서 메소드 호출  이해 완료
		myCalc.Powerup();
		
		int result1 =myCalc.plus(5,6);		//result 메소드 호출 
		System.out.println("result : "+ result1);	
		
		byte x=10;
		byte y=4; 
		double result2 = myCalc.divide(x, y);
		System.out.println("result2 :" +result2);
		
		myCalc.PowerOff();
		
		}
	} 

