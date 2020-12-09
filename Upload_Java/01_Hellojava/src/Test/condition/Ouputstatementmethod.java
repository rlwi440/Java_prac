package kh.java.condition.Test1;

import java.util.Scanner;
/**
 * @author 깔끔한 청년
 * @ Date  2020.12.10
 *  
 */

public class television {
    /**
     * @parma Scanner method 
     */
	
	public static void main(String[] args) {
		 television ki = new  television();
		 ki.test1();
		 ki.test2();
		 ki.test3();
	}
	
		 public void test1() {
			
		Scanner sc = new Scanner(System.in);
		int  kor =0;
		int eng =0;
		int math =0;
		int sum= 0;
		
		System.out.println("국어점수를 입력하세요 :");
		kor =sc.nextInt();
		System.out.println("영어점수를 입력하세요 :");
		eng =sc.nextInt();
		System.out.println("수학점수를 입력하세요 :");
		math =sc.nextInt();
		
		sum =kor+eng+math;
		
		if(sum>=250) {
		}
			System.out.println("우수생입니다.");
		}
	
	
		 public  void test2() {
				
				Scanner sc = new Scanner(System.in);
			 System.out.println("A의 연봉은 :");
				int a = sc.nextInt();
				
				System.out.println("B의 연봉은 :");
				int b = sc.nextInt();
				
				System.out.println("C의 연봉은 :");
				int c = sc.nextInt();
				
				if(a>=5000) {
					System.out.println("고액연봉");
				}else if(b>= 5000) {
					System.out.println("고액연봉");
				}if(c>=5000) {
					System.out.println("고액연봉");
				}
		 }

		 public  void test3() {
			 Scanner sc=new Scanner(System.in);
				System.out.println("정수입력 :");
				int num =sc.nextInt();
			
				
				if(num%2 ==0 ) {	
					System.out.println("짝수");
				}else if(num%2 ==1) {
					System.out.println("홀수");
				}else {
					System.out.println("종료");
				}
				
			}
		 }
		 			
				
				