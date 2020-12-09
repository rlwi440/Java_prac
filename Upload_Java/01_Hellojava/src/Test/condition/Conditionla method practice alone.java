package kh.java.condition.Test3;

import java.util.Scanner;

public class Test3 {
    /**
     * @author 깔끔한 청년
     * @date 2020.12.10
     */
	public static void main (String[]args) {
		
		Test3 ki =new Test3 ();
		ki.test3();
	}
	public void test3() {
		Scanner sc= new Scanner(System.in);
			System.out.println("정수를 입력하세요.");
			int num1 =sc.nextInt();
		
			System.out.println("정수를 입력하세요.");
			int num2 =sc.nextInt();
			 
			System.out.println("연산자를 입력");
			char ch =sc.next().charAt(0);
	
	if (ch== '+') {
		System.out.println(num1+  "+"+num2 +"="  +(num1+num2));
	}
	else if(ch == '-') {
		System.out.println(num1+  "-"+num2 +"="  +(num1-num2));
	}
	else if(ch == '*') {
		System.out.println(num1+  "*"+num2 +"="  +(num1*num2));
	}
	else {
		System.out.println("잘못입력하셨습니다.프로그렘 종료");
		}
	}
}
