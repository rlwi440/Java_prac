package JavaWorkshop4;

import java.util.Random;
import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		int num1=0; int num2=0; 
		Scanner sc =new Scanner(System.in);
		//1)1~5까지의 두 개의 정수형 데이터를 입력 받아 2차원 배열을 만든다.
		System.out.println("두개의 정수입력(1~5): ");
		num1=sc.nextInt();
		num2=sc.nextInt();
		if(num1<1||num1>5||num2<1|| num2>5) {
			System.out.println("숫자를 입력하세요");
		}
		double sum=0;
		//4) 입력 받은 두개의 정수를 이용하여 2차원 배열을 생성한다.
		int [][]arr = new int[num1][num2];
		for(int i =0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = (new Random()).nextInt(5)+1;
				sum+=arr[i][j];
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		//7) 배열의 총합과 평균을 출력 한다
		System.out.printf("sum=%.1f\n", sum);
		System.out.printf("avg=%.1f\n", sum/(num1*num2));
	}
}