package JavaWorkshop4;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수형데이터 입력: ");		//Scanner
		int num = sc.nextInt();	
		int sum = 0;

		StringBuffer  str= new StringBuffer();		//초기 문자열이 없고 16개의 문자를 저장할 수 있는 버퍼를 가진 객체를 생성한다.
		for(int i =num;i<=10;i++) {
			if(!(i % 3 == 0 || i %5 ==0)) {			//3의 배수와 5의배수는 합에서 제외한다.
				str.append(i+"+");	//int 데이터를 현재 문자열에 끝에 추가
				sum += i;
			}
		}
		System.out.println(str.substring(0, str.length()-1));
		System.out.println("결과 : "+sum);
	}
}
