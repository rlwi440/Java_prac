package kh.java.condition.Test3;

import java.util.Scanner;

public class Test5 {
	public static void main (String[]args) {
		/**
		 * @author 깔끔한청년
		 * @date 2020.12.10 
		 */
		Test5 ki= new Test5();
		/**
		 * @parma double
		 * @throws BMI calc
		 */
		ki.test();
		
		}
	public void test() {
		double weight;
		double height;
		double BMI;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("키 입력 구간입니다. :");
		 height=sc.nextDouble();
		 
		 System.out.println("몸무게 입력 구간입니다. :");
		 weight=sc.nextDouble();
		 
	 	BMI = weight*1000/(height*height);		//BMI = 몸무게*10000/(신장(M)*신장(M))
		
		if(BMI>=30) {
			System.out.printf("체지량 지수%.1f상 고도비만 입니다",BMI);
		}else if(BMI>=25&&30<BMI) {
			System.out.printf("체질량 지수 %.1f상 비만입니다",BMI);
		}else if(BMI>=23&&25<BMI) {
			System.out.printf("체질량 지수 %.1f상 과체중 입니다",BMI);
		}else if(BMI>=18.5&&23<BMI) {
			System.out.printf("체질량 지수 %.1f상 정상체중입니다",BMI);
		}else {
			System.out.printf("체질량 지수 %.1f상 저체중입니다",BMI);
		}
	}
}
	