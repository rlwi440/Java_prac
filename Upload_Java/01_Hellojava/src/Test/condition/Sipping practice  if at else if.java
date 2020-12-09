package kh.java.condition.Test3;

import java.util.Scanner;

public class Test4 {
	/**
	 * @author 깔끔한청년
	 * @date 2020.12.10
	 * 
	 */

	public static void main(String[] args) {
		/**
		 * @param 
		 */
		Test4 ki =new Test4();
		ki.Test();

	}
	public void Test() {
		int num;
		Scanner sc= new Scanner(System.in);
		System.out.println("정수입력 :");
		num= sc.nextInt();
		if(0>num&&10<=num) {
		}else if(num%2==0) {
			System.out.printf("짝수인지 확인",num);
			}else if(num%2!=0) {
				System.out.printf("홀수인지 확인",num);
			} else {
				System.out.println("반드시 정수 1~10사이의 정수입력해야합니다");	
			}
	}
}