package com.kh.edu;

import java.util.Date;

public class TestJavaApi {
	public static void main(String[] args) {
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
