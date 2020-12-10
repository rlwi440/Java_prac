package com.kh.test.condition;

import java.util.Scanner;

public class Test9 {
	public static void main(String []args) {
		/**
		 * @author 깔끔한청년
		 * @Date 2020.12.11
		 */
		Test9 ki= new Test9();
	
		ki.test();
	}
	
	public void test() {
		/**
		 * @param char,int,String 
		 * @throws case method 활용 
		 */
		char ch;
		int num=0; int B=0; String A=" ";  int b=0; String a= " "; 
	
		System.out.println("*********주메뉴*********");
		System.out.println("a. 불고기버거 ------------5000");
		System.out.println("b. 새우버거 --------------4000");
		System.out.println("c. 치킨버거 --------------4500");
		System.out.println("  d. 한우버거 -------------10000");
		System.out.println("  e. 디버거 ----------------7000");
		System.out.println("**********************");
		System.out.printf("주메뉴 선택해주세요");
		Scanner sc=new Scanner(System.in);
		System.out.printf("주메뉴 선택해주세요 (a~e): " );
		ch=sc.next().charAt(0);
		
		System.out.println("*******사이드메뉴********");
		System.out.println("\t1. 콜라 -------------------1500 ");
		System.out.println("\t2. 사이다 -----------------1500");
		System.out.println("\t3. 밀크쉐이크-------------2500");
		System.out.println("\4. 레드불------------------3000");
		System.out.println("\t***********************");
		System.out.println("음료수를선택하세요 : ");
		 num=sc.nextInt();
	

		
		switch(ch) {
		case 'a' :
			B=5000;
			A="불고기버거";
			break;
		case 'b' :
			B=4000;
			A="새우버거";
			break;
			
		case 'c' :
			B=4500;
			A="치킨버거";
			break;
		case 'd' :
			B=10000;
			A="한우버거";
			break;
			
		case 'e' :
			B=7000;
			A="한우버거";
			break;
			
			default :
				System.out.println("잘못입력하셨습니다.영업을 종료합니다.");
				return;
				
		
		} 
		switch(num) {
		case 1:
			b=1500;
			a="콜라";
			break;
		case 2:
			b=1500;
			a="사이다";
			break;
		case 3:
			b=2500;
			a="밀크쉐이크";
			break;
		
		case 4 :
			b=3000;
			a="레드불";
			break;
			
			default:
				System.out.println("잘못입력하셨습니다영업을 종료합니다.");
				return;
			
				}	
		System.out.println((A+a) +"은(는) 총" +(B+b) + "원원입니다.");
			}	
	
		}
