package com.kh.test.condition;

import java.util.Scanner;

public class SwitchTest1 {

	public static void main(String[] args) {
		int user; int code; int fare; double totfare; int water;
		Scanner sc=new Scanner(System.in);
		System.out.println(" ----------menu----------");
		System.out.println("  1. 가정용 (50원/liter)");
		System.out.println("  2. 상업용 (45원/liter)");
		System.out.println("3. 공업용 (30원/liter)");
		System.out.println("-------------------------");		
		System.out.println("  메뉴번호를 선택하세요 : ");
		System.out.println("  물 사용량을 입력하세요.");
		code=sc.nextInt();	//switch code 
		user=sc.nextInt();	// 사용량 입력구간
		fare=0;	//사용요금
		totfare=0;	//전체사용요금
		switch(code) {
		case 1:
			fare=user*50;
			break;
		case 2:
			fare=user*45;
			break;
		case 3:
			fare=user*30;
			break;
			
			default :
				System.out.println("메뉴번호 1,2,3만가능합니다.");
				
			totfare =fare*1.05; //계산
			water=(int) (fare*0.05);
			System.out.println(" ----------<<수도세>>-----------");
			System.out.printf("선택메뉴번호 : %d%s를 선택하셨습니다. ",code);
			System.out.println("사용요금 :" +fare+"원" );
			System.out.printf("수도세 :%d\n원",water);
			System.out.println("총수도요금: "+totfare+ "원");
			System.out.println("---------------------------------");4
		}
	}

}
