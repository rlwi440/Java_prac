package com.kh.test.loop;

import java.util.Scanner;

public class Test4 {
	public static void main(String[]args) {
		Test4 ki= new Test4();
		ki.test();
	}
	public void test() {
		int sum; 
		 Scanner sc=new Scanner(System.in);
		System.out.println("문자열 입력: ");
		String a=sc.next();
		System.out.println("검색할 문자열 입력: ");
		char ch =sc.next().charAt(0);
		
		if(ch>='A'&&ch<='Z')(ch>='a'&&ch<='z'){		//오류 
			sum=0;
			for(int i=0; i<a();i++) {
				char ch=a(i);
				if(a==ch) {
					sum+=1;
				}
			}
			System.out.println("%d기 포함된갯수 :%d",ch,sum);
		}
		else {
			System.out.println("영문자가 아닙니다.");
		}
		
	}

}
