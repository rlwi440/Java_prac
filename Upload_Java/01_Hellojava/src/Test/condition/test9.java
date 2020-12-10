package com.kh.test.condition;

import java.util.Scanner;

public class Test9 {
	public static void main(String []args) {
		Test9 ki= new Test9();
	
		ki.test();
	}
	
	public void test() {
		char ch;
		int num=0; int sum=0; 
	
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
		if(ch=='a'||'e'>ch||num<=1||num==4) {
			System.out.println("번호를 잘못누르셨습니다.영업종료합니다.");
			return;
		}
		switch(ch) {
		case 'a' :
			System.out.print("불고기 버거 , ");
			sum+=5000;
			break;
		case 'b' :
			System.out.print("새우버거 , ");
			sum+=4000;
			break;
		case 'c' :
			System.out.print("치킨버거 , ");
			sum+=7000;
			break;
		case 'd' :
			System.out.print("한우버거 , ");
			sum+=10000;
			break;
		case 'e' :
			System.out.print("디버거  , ");
			sum+=7000;
			break;
		} 
		switch(num) {
		case 1:
			sum+=1500;
			System.out.println("콜라는 총 "+sum+"원 입니다.!");
			break;
		case 2:
			System.out.print("사이다, ");
			sum+=1500;
			break;	
		case 3:
			System.out.println("밀크쉐이크: ");
			sum+=2500;
			break;
		case 4 :
			System.out.print("레드불: ");
			System.out.println("레드불은 총 "+sum+"원 입니다.!");
			break;
				}	
			}	
		}
