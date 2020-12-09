package kh.java.condition.Test3;

import java.util.Scanner;

public class Test4 {
    /**
    * @author 깔끔한청년
    * @date  2020.12.10
    */

	public static void main(String[] args) {
		Test4 ki =new Test4();
		ki.Test();

	}
	public void Test() {
		Scanner sc= new Scanner(System.in);
		System.out.println("정수입력 :");
	 int num =sc.nextInt();	
	
	 if(num>0 &&num <=10) {
		 if(num%2==0) {
			 System.out.println("짝수");
		 } else   {
			 System.out.println("홀수");
		 } else  {
			 System.out.println("1~10사이 정수 를 입력");
		 }
	 }
	}
}