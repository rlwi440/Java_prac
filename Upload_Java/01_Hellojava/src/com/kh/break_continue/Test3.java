package com.kh.test.break_continue;

import java.util.Scanner;

public class Test3 {
    /**
     * 2보다 큰정수를 입력받고, 입력 받은 정수가 소수이면"소수이다" 소수가 아니면 소수가아니다." 출력 
     * @author 깔끔한청년
     * @date 2020.12.12 
     */
	public static void main(String[]args) {
		Test3 ki=new Test3();
		ki.test();
	}
	public void test() {
		int a=0;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		
		int n =sc.nextInt();
		if(n<2) {
            /**
             * 2보다 큰정수 입력 받는구간 
             */
			System.out.println("잘못입력하셨습니다.");
		}
		int i=2;
		while(++i<n) {
            /**
             * 전위연산자: 증감 연산자를 변수 앞에 사용한 것을 전위 연산자라고 한다.
             */

			if(n % i !=0) {
				i++;		
		}
	if(n==i) {
		System.out.println(n+": 은 소수가 입니다");
		}
		System.out.println(n+": 소수가 아닙니다.");
		
	}

	}
}
