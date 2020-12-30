package com.exception.charcheck;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Run r =new Run();
		r.test1();
	}
	public void test1() {
		Scanner sc =new Scanner(System.in);
	System.out.println("사용할 문자열을 하나 입력하세요 : ");
		try {
			//에러가 발생할수있는코드 
			CharacterProcess ki =new CharacterProcess(); 		//  실행결과 받아 출력 메소드
			int a= ki.countAlpha(sc.nextLine());
			System.out.println("알파벳 의 갯수 :" +a);		
	}catch(Exception s) {
		//에러시 수행 
		s.printStackTrace(); //오류 출력 
		}
	}
}// 줄맞춤 정리 
