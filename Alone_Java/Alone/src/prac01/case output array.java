package Array_char;

import java.util.Scanner;

public class Alonechar {
	
	public static void main(String[]args) {
		Alonechar ki= new Alonechar();
		ki.test1();
		ki.test2();
		ki.test3();
		}
	public void test1() {
		/**
		 * 문자열을 하나 입력 받아 문자배열에 넣고 검색할 문자를 하나 입력 받아 검색 문자가 문자열에 몇 개인지 개수를 출력하는 프로그램을
		 * 작성하세요. 예) 입력값 : helloworld 검색값 :ㅣ 출력 : 입력하신 문자열 helloworld에서 찾으시는 문자 l은 3개
		 * 입니다.
		 * @author 깔끔한 청년
		 * @Date 2020.12.16
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
		 * char형 재복습 
		 * @author 깔끔한청년
		 * @date 2020.12.16
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

	public void test3() {
		/**
		 * 2차원 배열 대.소문자  26개 입출력  복습
		 *  헷갈려서 다시한번더 복습 후 암기연습 char[ ][ ] 예제 꾸준히 풀어보기
		 * @author 깔끔한청년
		 * @Date 2020.12.16
		 */
		char[][] arr = new char[2][26];	//2행 26열 	
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == 0) {
					arr[i][j] = (char) ('A' + j);
				} else {
					arr[i][j] = (char) ('a' + j);
				}
				System.out.print("[" + arr[i][j] + "]");
			}
			System.out.println();
		}

	}
}
	