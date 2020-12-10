package com.kh.test.loop;

import java.util.Scanner;

public class Test1 {
 public static void main(String[]args) {
	 int temp,sum=0;
	 
	 Scanner sc=new Scanner(System.in);
	 temp=sc.nextInt();
	 
	 for(int i=1; i<temp; i++) {
		 if(i%2==0)
			 sum+=i;
	 	}
	 System.out.println("1부터"+temp+"까지존재하는 짝수의합= "+sum);
 }
 
}
