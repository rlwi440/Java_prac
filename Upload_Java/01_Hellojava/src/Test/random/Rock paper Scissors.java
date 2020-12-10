package com.kh.test.random.RandomTest.test;

import java.util.Scanner;

public class Test6 {
	/**
	 * @author 깔끔한청년
	 * @date 2020.12.20
	 * 
	 */
	public static void main (String [] args) {
		/**
		 * @param user,computer
		 *	
		 */
		
		Test6 ki =new Test6();
		ki.Test();
	}
	public void Test() {
		int user; int computer;
		Scanner sc =new Scanner(System.in);
		System.out.println("## 가위 바위 보 게임##");
		System.out.println("숫자를선택하세요(1.가위,2.바위,3.보) : ");
		user=sc.nextInt();
		computer=(int)(Math.random()*3)+1;
		
		
		if(user==1&&3==computer) {
			System.out.println("========결과=======");
			System.out.println("당신은 가위를냈습니다");
			System.out.println("컴퓨터는 보를 냈습니다.");
			System.out.println("==================");
			System.out.println("당신이 이겼습니다 ㅠ_ㅠ");
		}

	}

}	

