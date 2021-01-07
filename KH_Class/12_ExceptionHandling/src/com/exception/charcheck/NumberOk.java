package com.exception.charcheck;

import java.util.Scanner;

import com.exception.number.NumberRangeException;

public class NumberOk {
	public static void main(String[] args) {
		NumberOk  n =new NumberOk ();
		n.number();
	}
	public int number() {
		int num=0;
		Scanner sc =new Scanner(System.in);
		while(true) {			
			try {
				System.out.println("1부터 100 사이의 정수 입력 : ");
				num = sc.nextInt();
				if (!(num > 100) || (num < 1)) {
					return num;
				}else {
					System.out.println("1부터 100 사이 정수가 아닙니다.");
					System.out.println("재입력 하십시오");
					throw new NumberRangeException();				
				}
			}catch(Exception e) {
				e.printStackTrace();
				continue;
			}
		}
	}
	public int checkNumber(int num) {
		int rnd = (int)(Math.random()*100)+1;
		System.out.println(rnd);
		return 0;
	}

}
