package ncs.Test6;

import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		 Scanner sc =new Scanner(System.in);
		 System.out.println("2부터 5까지 정수를 입력 : ");
	 int num=sc.nextInt();
	 try {
		 	System.out.println("결과값 : "+new Calculator().getsum(num));
	
	 }catch(InvalidException e) {
		 System.out.println(e.getMessage());
	 }
	 

	}
}
