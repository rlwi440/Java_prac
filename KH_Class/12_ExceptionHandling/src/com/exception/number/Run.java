package com.exception.number;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Run r =new Run();
		r.test1();
	}
	private void test1()  {
		int a; int b;
		System.out.println("2개의 정수 입력구간: ");
		try {
			//에러가 발생할수있는 코드 
			Scanner sc =new Scanner(System.in);
			a= sc.nextInt();
			b=sc.nextInt();
			NumberProcess ki= new  NumberProcess();			
			Boolean flag=ki.checkDouble(a, b); // checkDouble 메소드로 전달하면서실행한다.
			if(flag) {
				System.out.println("첫번째 수는 두번째의수가 맞다 .");
			}else {
				System.out.println("첫번째 수는 두번째의수가 아닙니다.");
			}
		}catch(Exception e) {	
			//에러시 수행
			e.printStackTrace();	//오류출력 
		}
	}
}
