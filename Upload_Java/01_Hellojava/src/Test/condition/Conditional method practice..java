package kh.java.condition.Test2;

import java.util.Scanner;

public class Test2 {
    /**
     * @author 깔끔한청년
     * @date 2020.12.10
     */
	
public static void main(String[] args) {
    /**
     * @param Scanner,  
     */
	Test2 ki= new Test2(); 
	
	
	ki.test();	
}
public void test() {
Scanner sc= new Scanner(System.in);
	System.out.println("국어점수 :");
	int kor =sc.nextInt();
	
	System.out.println("영어점수 :");
	int eng  =sc.nextInt();
	
	System.out.println("수학점수 :");
	int math =sc.nextInt();
	
	int sum = kor+eng+math;
	
	double avg =sum/3.0;
	System.out.println(kor>= 40 && eng >=40&& math>=40&&avg>=60);{
		System.out.println("합격입니다.");
		} if {	//
			System.out.println("불합격입니다.");
		}
	}
}
	
	 
	
