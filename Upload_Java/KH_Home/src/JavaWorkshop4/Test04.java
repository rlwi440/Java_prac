package JavaWorkshop4;

import java.util.Scanner;

public class Test04 {
	/*
	 * Calc 객체를 생성 하고 calculate() 함수 를 이용하여 결과를 받아 출력 한다.
	 */

	public static void main(String[] args) {
		Calc cal=new Calc(); 
		Scanner sc=new Scanner(System.in);
		System.out.println("입력하는구간:");
		int num=sc.nextInt();
		System.out.println("결과 : "+cal.calculate(num));
	}

}
