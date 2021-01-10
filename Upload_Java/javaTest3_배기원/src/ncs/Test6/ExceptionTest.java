package ncs.Test6;

import java.util.Scanner;

public class ExceptionTest {
	/**
	 * 2부터 5까지의 정수형 데이터만을 키보드로 입력 받아 1부터 입력 받은 수까지의 합을 출력 한
		다. 단, 입력 받은 수가 2부터 5까지의 범위를 벋어나면 “입력 값에 오류가 있습니다.”라고 출력
		하고 프로그램을 종료한다.
	 * @author 깔끔한청년
	 * @Date 2020/01/10
	 */
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
