package com.kh.test.break_continue;

import java.util.Scanner;

public class Test1 {
    /**
     * 정수 한개 를 입력받아,1부터 입력받은 정수까지의 홀수의 곱을 출력문
     * @author 깔끔한청년
     * @Date  2020 .12.12
     * 
     */
	public static void main(String[]args) {
        /**
         *사용자의 입력을 받아 그에 맞는 메소드를 불러와 출력하는 메소드 
         * @param args
         */
		Test1 ki=new Test1();
		/**
         * ki.test()
         */
		ki.test2();
	}
	public void test1() {
		int num = 0;
		int oddsum=2;
		Scanner sc=new Scanner(System.in);		
        System.out.println("정수를 한개 출력 : ");
         /**
          *  if 정수 출력이 아니라면 for(int i= 1; i<100 ; i++ ) 로 선정
          */
	
	
		for(int i=1; i<num; i++) {
			if(i%2==0){
                /**
                 * if(i%2==0)가 맞다면 바로 종료 .아니면 다시 출력  
                 */
				continue;		
			
			}
			oddsum*=i;	

		}
		System.out.println("1~"+num+"홀수들의곱: " +oddsum );
	}
	public void test2() {
        /**
         * 사용자로부터 정수를 두개 입력 받아서, 작은 정수에서 큰 정수까지 홀수의 합
         */
        int num,num2,i,oddsum=0;
        /**
         * 작은정수와 큰정수 홀수 입력
         * @param num, num2,oddsum
         */
		Scanner sc=new Scanner(System.in);	
		System.out.println("작은정수 입력구간: ");
		num2=sc.nextInt();			
		System.out.println("큰정수 입력구간");
		num=sc.nextInt();
		if(num<num2) {
			
			i=num;
			num=num2;
			num2=i;
        }
        /**
         * if 문에서 num1보다 num2는 1씩 증가
         */
		for(i=num; i<=num2; i++) {	 
			if(i%2==0) 
				continue;
				oddsum +=i;
		}
			System.out.println(num+"작은정수 " +num2 + "큰정수의합은 :" +oddsum +"입니다");
		
			
		}	
	}

