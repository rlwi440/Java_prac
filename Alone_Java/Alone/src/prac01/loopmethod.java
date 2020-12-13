package Whileprac;

public class Whiletest {
 public static void main(String[]args) {
	 Whiletest ki =new Whiletest();
	 ki.test();
	 ki.test2();
	 ki.test3();
	 ki.test4();
	 ki.test5();
	 ki.test6();
	 ki.test7();
 }
 public void test() {
	 /**
	  * 반복문 loop문 연습 별찍기 정사각형 연습
	  * 단계별 높아진다.
	  * @author 깔끔한청년
	  * @date 2020.12.12
	  */
	 for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {	
				System.out.print("*");			
			}
			System.out.println();
		}
 }

	public void test2() {
		/**
		 * 반복문 loop문 연습 별찍기 역삼각형 연습
		 * 
		 */
		for (int i = 0; i < 4; i++) {	 //4줄생성
			for (int j = 0; j <=i; j++) {	//빈칸 갯수 만큼 별 출력 
				System.out.print("*");
			}
			System.out.println();	// 줄바꿈
		}
	}
	public void test3() {
		/**
		 * 반복문 loop 문 연습 별찍기 왼쪽 역삼각형 연습 
		 */
		for (int i = 0; i < 4; i++) {
			for (int j = 3; j >= 0; j--) {
				if (i<j) {//참이면 빈칸에 공백 출력 
					System.out.print(" ");
				} else {	//거짓이면 별출력 
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	public void test4() {
		/**
		 * 반복문 loop 문 역 직각삼각형
		 */
		for (int i = 4; i > 0; i--) {	//줄을 생성하면서 빈칸 하나씩 줄어들게하기 
			for (int j = 0; j < i; j++) {	//j가 빈칸 (i)보다 작으면
				System.out.print("*"); //공백출력 
			}
			System.out.println();
		}
	}
	public void test5() {
		/**
		 *역(왼쪽) 직각삼각형
		 */
	
		for(int i=0;i <4; i++) {
		for (int j=0; j<i; j++) {	//j가빈칸 (i)보다 작으면
			System.out.println(" ");
		}
		for(int j=3; j>=i; j--) {	//j가 빈칸(i)보다 크거나 같다면
			System.out.println("*"); //별출력
		}
		System.out.println();
				
			}
		}
	public void test6() {
		/**
		 * 피라미드 삼각형 
		 */
		for(int i=0; i<4; i++) {
			for(int j=0; j<3-i; j++) {	//삼각형 별을 출력하기 우해 공백생성
				System.out.println(" ");
			}
			for (int j=0; j<2*i+1; j++) {//각행의 홀수만큼 별출력 
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}	

	public void test7() {
		/**
		 * @author 깔끔한청년
		 * @date 2020.12.13
		 * 마름모 별찍기 연습  
		 */
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j > i; j--) {
			}
			for (int j = 1; j <= 1 * 2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.println(" ");
			}
			for (int j = 7; j >= i * 2 + 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

