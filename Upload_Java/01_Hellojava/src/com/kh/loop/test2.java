package com.kh.test.loop;

import java.util.Scanner;

public class Test2 {
	/**
	 * @author 깔끔한청년
	 * @date 2020.12.11
	 * 
	 */
	public static void main(String[] args) {
		int num;
		Scanner sc= new Scanner(System.in);
		System.out.println("정수를 입력해주세요");
		num=sc.nextInt();
		for(int i=1; i<num; i++) {			//int 수정
			if(i%2==0) {
				System.out.println("박");
			}else {
				System.out.println("수");
			}
		}

	}

}
