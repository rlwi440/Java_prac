package kh.java.exception;

import java.util.Scanner;

public class ThrowException {

	public static void main(String[] args) {
		ThrowException ki =new ThrowException();
//		ki.test1();
	
		
		
		
		
		ki.test2();
		System.out.println("---정상종료----");
	}
	/**
	 * 예외를 통한 프로그램 흐름 분기
	 */
	public void test2() {
		try {
		 checkAgeAndThrowException();
	}catch(Exception e) {
		e.printStackTrace();
		return;
	}
		 System.out.println("성인 고스톱 게임을 시작합니다. 후방주의 ");	
		}
	/**
	 * 나이를 입력받고 ,
	 * 미성년자인 경우에는 예외를 던지는 메소드 
	 */
	public void checkAgeAndThrowException() throws UnderAgeException{
		int age;
		Scanner sc =new Scanner (System.in);
		System.out.println("나이 입력구간 :");
		age=sc.nextInt();
		if(age<20)
			throw new UnderAgeException(String.valueOf(age)); 
		
		}
	
	/**
	 *성인인증해야 가능한게임
	 *	1. 성인인증
	 *	2.게임시작 
	 **/
	public void test1() {
	
		boolean isAdult = checkAge();
	;
		if (!isAdult) {
			System.out.println("성인이 아닙니다. 게임을 종료합니다");
			return;
		}
		System.out.println("성인 고스톱 게임을 시작합니다. 후방주의 ");
	}
	public boolean checkAge() {
		int age;
		Scanner sc =new Scanner (System.in);
		System.out.println("나이 입력구간 :");
		 age = sc.nextInt();
		if(age<=18) {
			return false;
		}
			return true;
		
	}

}
