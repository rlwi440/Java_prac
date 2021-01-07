package kh.java.nested.loop;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Test1 ki =new Test1 ();
//		ki.test1();
//		ki.test2();
//		ki.test3();
//		ki.test4();
//		ki.test5();
		ki.test6();
	
	}
	
	public void test6() {
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j > i; j--) {
			}
			for (int j = 1; j <= i; j++) {
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

	public void test5() {
		int num=0; 
		Scanner sc=new  Scanner (System.in);
		System.out.println("정수입력");
		num=sc.nextInt();
		if(num<1) {
			System.out.println("양의정수가 아닙니다. :");
			return;
		}
		for(int i=0; i<num; i++) {
			for(int j=0; j<(num-1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
	}
	public void test4() {
		/**
		 * 정수 입력을 받아 숫자로 출력문 다시 연습 .
		 * 포기안한다 정말 
		 *@author 깔끔한청년
		 *@Date 2020.12.17
		 */
		int num =0; 
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력: ");
		num=sc.nextInt();
		if(num<5) {	
			System.out.println("양의정수 입력:");
			return;
		}
		for(int i=0; i<num; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(j+1);
			}
			System.out.println();
		}
	}
	
	public void test1() {
		/**
		 * 
		 *	
		 * @author 깔끔한청년
		 * @Date 2020.12.15
		 */
		int num=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("정수입력 : ");
		num=sc.nextInt();
		if(num<1) {
			System.out.println("양의정수가 아닙니다 :");
			return;
		}
		for (int i = 0; i < num; i++) {	 //5줄생성
			for (int j = 0; j <=i; j++) {	//빈칸 갯수 만큼 별 출력 
			
				System.out.print(j+1);	// 12345 예제 헷갈려서 *표로 출력 꼭 물어보기 ..한계다..
			}
			System.out.println();	// 줄바꿈
		}
	}

	public void test2() {
		/**
		 *  정수하나 입력받아, 그 수가 양수일때만 입력된 수를  행수로 적용하여 다음과 같이 출력되게 하는 프로그램을 만들어보자. 
		 *  출력은 가능..
		 *  @author 깔끔한청년
		 *  @Date 2020.12.15
		 */
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력: ");
		num = sc.nextInt();
		if (num <1) {
			System.out.println("양의수를 입력하세요 :");
			return;
		}
			for (int i = 0; i < num; i++) {
				for (int j = 0; j <(num-i); j++) {

					System.out.print("*");
				}
				System.out.println();
			}

		}

		public void test3() {
			/**
			 * 정수하나 입력받아, 그 수가 양수일때만 입력된 수를 줄 수로 적용하여 다음과 같이 출력되게 하는 프로그램을 만들어보자. 일단은 출력문 은
			 * 만들었지만 .. 모르겠다 별찍기라도 연습하자
			 * 연습하는공간 
			 * 
			 * @author 깔끔한청년
			 * @Date 2020.12.15
			 */
			Scanner sc = new Scanner(System.in);
			System.out.print("양의정수를 하나 입력하세요 ==> ");
			int num = sc.nextInt();

			if (num < 1) {
				System.out.println("양의정수가 아닙니다.");
				return;
			}

			for (int i = 0; i < num * 2 - 1; i++) {
				if (i < num) {
					// j<=1 등호 주의!!
					for (int j = 0; j <= i; j++) {
						System.out.print("*");
					}
				} else {
					for (int j = 0; j < num; j++) {
						if (j <= (i - num))
							System.out.print(" ");
						else
							System.out.print("*");
					}
				}
				System.out.println();
			}
		}

	}

	