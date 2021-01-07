package kh.javatwo.dimentional.array;

import java.util.Scanner;

/**
 * 가변배열 JaggedArra
 * int [][] arr =new int [3][2];
 * 참조의 참조 배열의길이가 제각각인 배열   
 */

public class JaggedArrayTest {
	public static void main(String []args ) {
		JaggedArrayTest ki =new JaggedArrayTest();
//		ki.test1();
//		ki.test2();
		ki.test3();
	}
	public void test3() {
	Scanner sc = new Scanner(System.in);
	int num;
	System.out.println("정수입력 : ");
	num=sc.nextInt(0);
	int [][] arr =new int[5][];
	
	for(int i=0; i<arr.length; i++) {
		for(int j=0; j<arr[i].length; j++) {
		}
	}
}
	
	public void test2() {
		Scanner sc = new Scanner(System.in);
		String temp;
		String[][] arr = new String[3][];
		arr[0] = new String[5];
		arr[1] = new String[2];
		arr[2] = new String[3];
		for(int i=0; i<arr.length; i++) {
			if(i==0) temp="의류";
			else if(i==1) temp="식료품";
			else temp="기타물품";
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(temp+" " +(j+1) + "번 = ");
				arr[i][j]=sc.nextLine();
			}
		}
		System.out.println("======================");
		for(int i=0; i<arr.length; i++) {
			if(i==0) System.out.println("구매할 의류 목록");
			else if(i==1) System.out.println("구매할 식료품 목록");
			else System.out.println("구매할 기타물품 목록");
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}


	/**
	 * 가변배열 
	 */
		public void test1() {
		int [][] arr= new int [3][];
		//2차원 배열
		arr[0]=new int [10];
		arr[1]=new int [3];
		arr[2]=new int [7];
		//값입력
		int k=0;
		for(int i=0; i<arr.length; i++)
			for(int j=0 ;j<arr[i].length; j++)
				arr[i][k] = k++;
		for(int i= 0; i<arr.length; i++) {
//			System.out.println(arr[i]);
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}

	}
}
