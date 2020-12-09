package kh.java.condition.Test3;

import java.util.Scanner;

public class Test5 {
    /**
     * @author 깔끔한청년
     * @date 2020.12.10
     */
	public static void main (String[]args) {
		Test5 ki= new Test5();
		ki.Test();
	}
	
	public void Test() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("키(cm)을 입력");
		int cm =sc.nextInt();
		
		System.out.println("몸무게(kg)을 입력");
		double kg =sc.nextDouble()
		
		
		double bmi= kg/((cm/100.0)*(cm/100.0));	
	}
	if(bmi>=30) {
		System.out.println("고도비만");
	}else if(bmi>= 25&& bmi <30 ) {
		System.out.println("비만");
	}else if(bmi>= 23&& bmi <25 ) {
		System.out.println("과체중");
	}else if(bmi>= 18.5&& bmi <23 ) {
		System.out.println("정상체중");{
		else {
			System.out.println("저체중");  
			}
		}
	}

		

