package kh.java.nested.loop;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Test1 ki =new Test1 ();
		ki.test1();
		ki.test2();
		ki.test3();
	}
	public void test1() {
		/**
		 * 정수하나 입력받아, 그 수가 양수일때만 입력된 
		 *수를 행 수로 적용하여 다음과 같이 출력되게 하는 프로그램을 만들어보자.
		 *	내가 아는 부분만이라도 풀어보자 포기하지 말자 .
		 * @author 깔끔한청년
		 * @Date 2020.12.15
		 */
		int num=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("정수입력 : ");
		num=sc.nextInt();
		for (int i = 0; i < num; i++) {	 //5줄생성
			for (int j = 0; j <=i; j++) {	//빈칸 갯수 만큼 별 출력 
				System.out.print("*");	// 12345 예제 헷갈려서 *표로 출력 꼭 물어보기 ..한계다..
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
		int num=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("정수입력: ");
		num=sc.nextInt();
		for(int i=5; i >num; i--) {
			for(int j=0;j<i; j++) {
				
				System.out.print("*");  
			}
			System.out.println();
		}

	}
	public void test3() {
		/**
		 *정수하나 입력받아, 그 수가 양수일때만 입력된 
    	 *수를 줄 수로 적용하여 다음과 같이 출력되게 하는 
    	 *프로그램을 만들어보자. 일단은 출력문 은 만들었지만 .. 모르겠다  별찍기라도 연습하자 
    	 *@author 깔끔한청년
    	 *@Date 2020.12.15
		 */
		int num =0; 
		for(int i=0; i<5;i++ ) {
			for(int j=0; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		int num2=0;
		for(int i=5; i>0;i--) {
			for (int j=0; j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
	