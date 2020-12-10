package com.kh.test.loop;

import java.util.Scanner;

public class Test3 {
	public static void main(String[]args) {
		Test3 ki=new Test3();
		ki.test();
	}
	public void test() {
		int dan ; 
		Scanner sc= new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		if(dan>=1 && dan<= 9) {
			for(int i=1;i<9;i++) {
				System.out.printf("%dx%d=%d",dan i dan*i);
			}
		}
		else {
			System.out.println("잘못입력하셨습니다. 프로그렘종료");
		}
	}

}
