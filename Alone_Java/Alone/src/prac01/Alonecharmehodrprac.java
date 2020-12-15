package Array_char;

import java.util.Scanner;

public class Alonechar {
	
	public static void main(String[]args) {
		Alonechar ki= new Alonechar();
		ki.test1();
		ki.test2();
	}
	public void test1() {
		/**
		 * 문자열을 하나 입력 받아 문자배열에 넣고 검색할 문자를 하나 입력 받아 검색 문자가 문자열에 몇 개인지 개수를 출력하는 프로그램을
		 * 작성하세요. 예) 입력값 : helloworld 검색값 :ㅣ 출력 : 입력하신 문자열 helloworld에서 찾으시는 문자 l은 3개
		 * 입니다.
		 * @author 깔끔한 청년
		 * @Date 2020.12.14
		 */
		char ch; int hi=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("문자열 입력 : ");
		String arr= sc.nextLine();
		System.out.println("찾을문자 : ");
		ch= sc.next().charAt(0);
		
		for(int i=0; i<arr.length(); i++) {
			if(arr.charAt(i)==ch) {
				hi++;
			}
		}
		System.out.println(hi+"개 있다");
		
	}

	public void test2() {
		/**
		 * 소문자를 차례대로 a,b,c,d.... 나열 하여라 
		 * char형 복습구간
		 * @author 깔끔한청년
		 * @date 2020.12.15
		 */
		char[] arr = new char[26];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (char) (i + 'a');
			if (i == arr.length - 1) {
				System.out.print(arr[i]);
			} else {
				System.out.print(arr[i] + ",  ");
			}
		}
	}

}
	