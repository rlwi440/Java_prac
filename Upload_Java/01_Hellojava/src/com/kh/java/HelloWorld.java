package com.kh.java;

import com.kh.java.other.Otherjava;	// import문 중요 
//java.lang 패키지의 모든 클래스는 import 문 없이 사용가능
import java.lang.*;
import java.util.Date;


/** 
 * 
 * @javadoc //주석(클래스,메소드 레벨에작성)
 * @author 깔끔한청년
 * @param 
 */
public class HelloWorld {
	/**
	 * 프로그램의 첫 실행 메소드 
	 * 
	 * @param args
	 */
	
	public static void main(String[]args) {

		/**
		 *  
		 * 
		 */
		
		// 	System.out.print(7);
		//System.out.print11(8);
		//System.out.print(9);
		//System.out.print(3.14);	// 실수 출력문 가능하다 
		//System.out.println("Hello world~");
		//System.out.println("Hello java~");
		//System.out.println("숫자"+3+" 과 문자열");
		//System.out.println("숫자와"+" 과 문자열"); 
		
		HelloWorld  baeki= new HelloWorld();		// 객체생성 		  
		baeki.test1();		//메소드 호출부
		baeki.test2();
		baeki.test3();
		KHJava baeki2 = new KHJava();
		baeki2.welcome();
		Otherjava baeki3 = new Otherjava();		//다른 패키지의 클래스 가져다쓰는경우 import문
		baeki3.callme();
		
		//jdk 제공 클래스 사용하기 
		Date now = new Date();			// import
		System.out.println(now);
		Date time = new Date();
		System.out.println(time);
		
		//java.sql.Date , java.until.Date
	
		
			}
			//메소드 선언부
			public void test1() {
				//java.lang.System
				System.out.println("test1 호출!");
			}
			public void test2() {
				System.out.println("test2 호출!");
			}
			public void test3() {
				System.out.println("test3 호출 test 시험 !");
			}
		}
