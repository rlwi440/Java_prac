package com.kh.test.condition;

import java.util.Scanner;

public class Test8 {

	public static void main(String []args) {
		Test8 ki =new Test8();
		ki.Test();
	}
	public void Test() {
		String menu;
		int num;
		Scanner sc= new Scanner(System.in);
		menu =   "*******메   뉴******/n"
				+"1. 떡볶이 ----------------1000"
				+"2. 김밥 ------------------ 2000"
				+"3. 오뎅 ------------------ 1000"
				+" 4. 순대 ------------------ 2000"
				+"5. 튀김 ------------------ 3000"
				+" 6. 떡튀순 ---------------- 8000"
				+"*************************"
				+"번호 입력 : "	;
		
		num= sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.printf("떡볶이는 1000원 입니다 ");
			break;
		case 2 :
			System.out.printf("김밥은 2000원 입니다 ");
			break;	
		case 3 :
			System.out.printf("오뎅은 1000원 입니다 ");
			break;
		case 4 :
			System.out.printf("순대는 2000원 입니다 ");
			break;
		case 5 :
			System.out.printf("튀김는 3000원 입니다 ");
			break;
		case 6 :
			System.out.printf("떡튀순은 8000원 입니다 ");
			break;
			
			default :System.out.println("번호가 잘못입려되었습니다. 영업을종료합니다.감사합니다.");
			return;
		}
	}

}

	
