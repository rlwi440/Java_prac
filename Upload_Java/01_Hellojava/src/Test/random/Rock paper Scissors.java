package com.kh.test.random.RandomTest.test;

import java.util.Scanner;

public class Test6 {
    /**
     * @author 깔끔한청년
     * @date 20.12.10
     */
	public static void main (String [] args) {
		
		Test6 ki =new Test6();
		ki.Test();
	}
	public void Test() {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("## 가위 바위 보 게임##");
		System.out.println("숫자를선택하세요(1.가위,2.바위,3.보) : ");
		 int com =0;
		 int user =sc.nextInt();
		 int  r =(int)(Math.random()*3)+1;
		 
		if(user==1 &&r==3) {
			System.out.println("-=====결과======");
			System.out.println("당신은 가위 입니다.");
			System.out.println("컴퓨터 는 보입니다.");
			System.out.println("===============");
			System.out.println("당신이 이겼습니다ㅠ.ㅠ.");
		}
		 
	}

}
