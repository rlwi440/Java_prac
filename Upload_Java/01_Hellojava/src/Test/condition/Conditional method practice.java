package kh.java.condition.Test2;

import java.util.Scanner;

public class Test2 {
	
public static void main(String[] args) {
	/**
	 * @author 깔끔한청년
	 * @Date 2020.12.10 
	 * 
	 */
	Test2 ki= new Test2();
	/**
	 * @param int kor,math,eng sum ,double avg 
	 * @throws 합계계산 
	 */  
	ki.test();	
}
public void test() {
	
	
	Scanner sc=new Scanner(System.in);
	int kor; int math; int eng; int sum; double avg;
	
	System.out.printf("국어 점수는 : ");
		 kor=sc.nextInt();
		
		System.out.printf("영어 점수는 : ");
		 eng=sc.nextInt();
	
		System.out.printf("수학 점수는 : ");
		 math =sc.nextInt();
		
		 sum=kor+eng+math;	// 합계점수
		
		 avg=sum/3.0;
		System.out.println(kor>=40&&eng>=40&&math>=40&&avg>=60);{	
			System.out.println("합격입니다.");
		}		//if문 형식 사용만 
			System.out.println("불합격입니다.");
		}	
	}

		
		
		

	 
	
