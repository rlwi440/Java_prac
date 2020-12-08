package com.test.car;

import java.util.Scanner;

public class carExample {
    /**
     * @author 깔끔한 청년
     * @date 20.12.09
     */

	public void test1() {
        /**
         * @param Scanner method()
         * @throws  3개의점수 합계점수를 평균 으로 구한값   합격 불합격  
         * @return avg 
         **/
		int hd,kia,LG,sum;	// 내가 만들어보는 공부 

		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("현대점수 : ");
		hd=sc.nextInt();
		
		System.out.print("기아 점수:");
		kia=sc.nextInt();
		
		System.out.print("엘지 점수:");
		LG=sc.nextInt();
		
		sum= hd+kia+LG;	//합계 점수
		double avg =sum/3.0;
		System.out.println("평균 : " + avg );
		System.out.println(sum>= 40 &&avg<=85? "합격" : "불합격" );
			
	}

	public void test2() {
        /**
         * @param Scanner method
         * @throws 학생 성적 을 구한값
         */
		 Scanner sc =new Scanner(System.in);
		 System.out.println("학생이름 :");
		 String name= sc.nextLine();	// string 은 nextLine () method
		 
		 System.out.printf("학년 : ") ;
		 int grade =sc.nextInt();	
		 
		 System.out.printf("반 : ") ;
		 int clss =sc.nextInt();	
		 
		 System.out.printf("번호 : ") ;
		 int num =sc.nextInt();
		 
		 System.out.println("성별(M/F): ");
		 char sex = sc.next().charAt(0);		//한번더 복습하는공간

		 System.out.println("성적 :");
		 double point =sc.nextDouble();
		 
		 System.out.printf("%d학년 %d반 %d번 %s학생 %s은  성적은 %.2f이다 ",grade,clss,num,clss,sex,point );			//%.2f는 소수점 두번째 자리 까지 나타낸다
	}

	public void test3() {

        /**
         * @param int 
         * @throws  for 문을활용해 구구단 연습
         */
		for (int m = 2; m <= 9; m++) {
			System.out.println("****" + m + "*단****");
			for (int n = 1; n <= 9; n++) {
				System.out.println(m + "x" + n + "=" + (m * n)); // 2단
			}
			for (int j = 3; j <= 9; j++) {
				System.out.println("*****" + j + "*단 ****");
				for (int k = 1; j <= 9; j++) {
					System.out.println(j + "x" + k + "=" + (j * k));// 3단
				}
			}
			for (int h = 4; h <= 9; h++) {
				System.out.println("*****" + h + "*단 ****");
				for (int i = 1; i <= 9; i++) {
					System.out.println(h + "x" + i + "=" + (h * i));// 4단
				}
			}

		}
	}
}