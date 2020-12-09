package kh.java.condition.Test3;

import java.util.Scanner;

public class Test3 {
	/**
	 * @author 깔끔한청년
	 * @date 2020.12.10
	 */
	public static void main (String[]args) {
		/**
		 * @param num1,num2,ch
		 * @thtrow Scanner 매서드
		 */
		
		Test3 ki =new Test3 ();
		ki.test3();
	}
	public void test3() {
		int num1;	// 첫번째 연산자
		int num2;
		char ch;	//연산자 
		
		Scanner sc=new Scanner(System.in);
		
		System.out.printf("오른쪽 정수 입력구간: ");
		num1=sc.nextInt();
		System.out.printf("왼쪽 정수 입력구간:");
		num2=sc.nextInt();
		System.out.printf("연산자 입력");
		ch= sc.next().charAt(0);		// char 형식은  sc.next.charAt(0)
		
		if(ch=='+') {
			System.out.println(num1+ "+" +num2 +"=" +(num1+num2));
		}else if(ch== '-') {
		System.out.println(num1+ "-" +num2 +"=" +(num1-num2));
			}else if(ch=='*') {
				System.out.println(num1+ "*" +num2 +"=" +(num1*num2));
		}else if(ch=='/') {
			System.out.println(num1+ "/" +num2 +"=" +(num1/num2));
		}else {
			System.out.println("잘못 입력을 하셨습니다. 프로그램 종료 합니다.");
		
		}
		
	}
}