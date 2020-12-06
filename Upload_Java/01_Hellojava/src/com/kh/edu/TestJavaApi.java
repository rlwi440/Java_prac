package com.kh.edu;

import java.util.Date;

public class TestJavaApi {
	/**
	 * @author 깔끔한청년
	 * @date 2020.12.07
	 */
	public static void main(String[] args) {
		/**
		 * @param Test1,Test2
		 * 
		 */
		TestJavaApi abc= new TestJavaApi();
		abc.Test1();
		abc.Test2();
	}
	public void Test1() {
		Date now =new Date();
		System.out.println(now);
	}
	public void Test2() {
		Date time= new Date();
		System.out.println(time);
	}
}
