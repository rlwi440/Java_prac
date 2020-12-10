package com.kh.test.condition;

import java.util.Scanner;

public class SwitchTest1 {
	/**
	 * @author 깔끔한청년
	 * @Date 2020.12.11
	 */

	public static void main(String[] args) {
		/**
		 * @param int user,code,fare,water  double totfare ,string A
		 * @throws case method 활용
		 */
		int user; int code; int fare; double totfare; int water;   String A =" "; 
		Scanner sc=new Scanner(System.in);
		System.out.println(" ----------menu----------");
		System.out.println("  1. 가정용 (50원/liter)");
		System.out.println("  2. 상업용 (45원/liter)");
		System.out.println("3. 공업용 (30원/liter)");
		System.out.println("-------------------------");		
		System.out.println("  메뉴번호를 선택하세요 : ");
		System.out.println("  물 사용량을 입력하세요.");
		code=sc.nextInt();	//switch code 
		user=sc.nextInt();
		fare=0;	//사용요금
		totfare=0;	//전체사용요금
		switch(code) {
		case 1:
			fare=user*50;
			A="1.가정용";
			break;
		case 2:
			fare=user*45;
			A="2.상업용(업소에서 사용하실경우)";
			break;
		case 3:
			fare=user*30;
			A="공업용";
			break;
			
			default :
				System.out.println("메뉴번호 1,2,3만가능합니다.");
				break;
		}
			totfare =fare*10.5; //계산1
			water=(int) (fare*0.05);
			System.out.println(" ----------<<수도세>>-----------");
			System.out.println("선택메뉴번호 :"+A+ "를 선택하셨습니다.");
			System.out.println("사용요금 :" +fare+"원" );
			System.out.println("수도세 : "+water+ "원");
			System.out.println("총수도요금: "+totfare+ "원");
			System.out.println("---------------------------------");
		}
	}


