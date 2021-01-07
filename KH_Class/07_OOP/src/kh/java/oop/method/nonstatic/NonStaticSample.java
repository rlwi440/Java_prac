package kh.java.oop.method.nonstatic;

import java.util.Scanner;

public class NonStaticSample {
	/**
	 * 1.메소드명 : printLottoNumbers ,실행 요청시 1~45까지의 임의의 정수 6개 
	 * 2.메소드명 : outputChar,실행 요청시 정수 하나, 문자 하나를 전달받아 문자를 정수 갯수만큼 출력하는 메소드
	 * 3.실행 요청시 정수 하나, 문자 하나를 전달받아 문자를 정수 갯수만큼 출력하는 메소드메소드명 : outputChar
	 * 4.메소드명 : mySubstring,추출하여 리턴하는 메소드. 단 문자열은 반드시 값이 있어야함.
	 * @author 깔끔한청년
	 * @Date 2020.12.19 
	 * 
	 * 
	 */
	
	public static void main(String[]args) {
		NonStaticSample  ki= new NonStaticSample();
		ki.lotto();
		//ki.outputChar();
		ki.alphabet();
		ki.mySubstring(null, 0, 0);
	}
	
	public void lotto() {
		Scanner sc = new Scanner(System.in);
		int lotto[] = new int[6];

		for (int i = 0; i < 6; i++) {
			lotto[i] = (int) (Math.random() * 6) + 1;	// 6개 의 난수 생성
			for (int j = 1; j < i; j++)	//중복생성 제거 
				if (lotto[i] == lotto[j]) {//	 현재 자리와 다시전에 꺼로변경 
					i--;
					break;
				}
			}
		System.out.println("로또번호 : ");
		
		for(int i=0; i<6; i++) {
			System.out.print(lotto[i]+ " ");
				}
		}
	public void outputChar() {
		Scanner sc = new Scanner(System.in);
		char a;
		a=sc.next().charAt(0);
		int b= (char)a;
		System.out.println(b);
		}
public void alphabet () {
	for(int i=1; i<20; i++) {	//20개 랜덤숫자생성 
		char ch=(char)((Math.random()*26)+65);		//알파벳 문자 26개생성 
		System.out.println(ch +" \n");
	}
}

public void  mySubstring(String s , int start ,int end) {	// 리턴 null 실패 .. 예제문 많이풀고  많이풀어야겠다 
		System.out.println("------- 시작 ------");
		if(s==null) {
			return ;
		}
		if(start<0) {
			System.out.println("시작인덱스 입력오류 ");
			return ;
		}
		if(end<0) {
			System.out.println("마지막 인덲스 오류");
			return;
		}
		System.out.println("------종료 ------");
	}
}

	