package com.kh.function;

import java.util.Scanner;

public class Example {
	public void opSample1() {
		int kor,eng,math,sum; 		//국어 ,영어,수학
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		kor= sc.nextInt();
		
		System.out.print("영어점수 : ");
		eng= sc.nextInt();
		
		System.out.print("수학점수 : ");
		math= sc.nextInt();
		
		sum= kor+eng+math; 
		double avg =sum/3.0;
		System.out.println("평균 :"+avg);
		System.out.println(sum>= 40 && avg >=60 ?  "합격":"불합격");
	}
	public void opSample2() {
		Scanner vc= new Scanner(System.in);
		System.out.print("학생이름 : ");
		String name= vc.nextLine();
		
		System.out.print("학년 : ");
		int grade= vc.nextInt();
		
		System.out.print("반 : ");
		int clss = vc.nextInt();
		
		System.out.print("번호 : ");
		int num = vc.nextInt();
		
		System.out.print("성별:(M/F) ");
		char sex = vc.next().charAt(0);
		
		System.out.print( "성적:");
		double point = vc.nextDouble();
		
		System.out.printf("%d학년 %d반 %D번 %S학생 %S은 성적이 %.2f이다", grade,clss,num,name,sex,point);
	}

}
