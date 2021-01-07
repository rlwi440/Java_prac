package kh.java.nested.loop;

import java.util.Scanner;

public class NestedLoopTest {
public static void main(String[]args) {
	NestedLoopTest  n =new NestedLoopTest ();	
//n.test1();
	//n.test2();


	n.test3();
//	 n.test4();
//	 n.test5();
//	 n.test6();
	 n.test7();
//	 n.test8();
	 n.test9();
}
public void test9() {
for(int i= 0; i<5; i++) {
	for(int j=0; j<3; j++ ) {
		System.out.print("*");
		if(i%2==1)
			break;
	}
	System.out.println();
}
}
public void test8() {
	for(int i=0; i<5; i++ ) {
		for(int j=0; j<=i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}

/**
 * 각 단에서 dan,su가동일할대 까지 출력
 */
public void test7() {
	System.out.println("구구단 출력 : " );
	outer:
	for(int i=2; i<=9; i++) {
		System.out.println(i+"단출력 :");
		for(int j=1;j<=9; j++ ) {
			System.out.printf(i+ "x"+ j +" = "+(i*j));
			if(i ==j)
				System.out.println();
				continue outer;	//다른문장	
		}
		System.out.println();
	}
}
/**
 * label 이있는 break문 
 * dan *su위 결과가 300미만 일때 까지만 출력
 */
public void test6() {

	System.out.println("구구단 출력 : ");
	outer: for (int i = 2; i <= 100; i++) {
		System.out.println(i + "단출력 :");
		for (int j = 1; j <= 9; j++) {
			if (i * j > 300)
				break outer;
			System.out.printf(i + "x" + j + " = " + i * j);
		}
		System.out.println();
	}
}

/**
 * ---2단
 */
public void test5() {
	System.out.println("구구단 출력 : " );
	for(int i=2; i<=9; i++) {
		System.out.println(i+"단출력 :");
		for(int j=1;j<=9; j++ ) {
			System.out.printf(i+ "x"+ j +" = "+i*j);
		}
		System.out.println();
	}
}
public void test4() {
	for(int i=4 ; i>0; i-- ) {
		for(int j=0; j<i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	for (int i=0; i<4; i++) {
		for(int j=0; j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
public void test3() {
	Scanner sc = new Scanner(System.in);
	System.out.print("행  :");
	int num1 = sc.nextInt();

	System.out.print("열 :");
	int num2 = sc.nextInt();

	for (int i = 0; i < num1; i++) {
		for (int j = 0; j < num2; j++) {
			if (i == 0) {
				System.out.print("☆");
			}
			{
				System.out.print("★");
			}
		}
		System.out.println();
	}

}
	public void test1() {
		for(int i= 0; i<3; i++) {
			for (int j=0; j<5; j++) {
				//System.out.print(i+","+j + " ");
				System.out.print("★");
			}
			System.out.println();
			
		}
		
		
	}
	public void test2() {	
		/**
		 * 행과 열 을 출력하시오 
		 */
		Scanner sc=new Scanner(System.in);
		System.out.print("행 :");
		int num1= sc.nextInt();

		System.out.print("열 :");
		int num2= sc.nextInt();

		for(int i =0; i<num1; i++) {
			for(int j=0; j<num2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}