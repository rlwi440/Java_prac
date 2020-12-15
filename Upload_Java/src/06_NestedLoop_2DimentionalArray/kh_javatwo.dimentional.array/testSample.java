package kh_javatwo.dimentional.array;

import java.util.Scanner;

public class testSample {

	public static void main(String[] args) {
		/**
		 * 1. 3행짜리5열 2차원배열 선언 및 생성 2. 1~100사이의 임의의 정수를 모든 방에 기록함 3. 각 행별 열의 합계가 5의 배수인
		 * 행열값만 출력함
		 * 2차원 배열 연습하기 .
		 * @author 깔끔한청년
		 * @Date 2020.12.16 
		 */
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][5];	//3행 5열  
		int[] sum = new int[arr.length]; //sum 생성 

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * 100) + 1;
				sum[i] += arr[i][j]; // 각행의 더한값을 다른배열 에 담아둔다.(5의배수 판별)
			}
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			if (sum[i] % 5 == 0) {
				System.out.println("[" + i + "]열의 합계(5의 배수): " + sum[i]);
			} else {
				System.out.println("[" + i + "]열의 합계(5의 배수): 5의 배수가 아닙니다.");
			}
		}
	}
}