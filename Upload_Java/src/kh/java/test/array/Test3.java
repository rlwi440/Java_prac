package kh.java.test.array;

import java.util.Scanner;

public class Test3 {
public static void main(String []args) {
	Test3  ki=new Test3();
	ki.test();
}
public void test() {
	/**
	 * 문자열을 하나 입력 받아 문자배열에 넣고 검색할 문자를 하나 입력 받아 검색 문자가 문자열에 몇 개인지 개수를 출력하는 프로그램을
	 * 작성하세요. 예) 입력값 : helloworld 검색값 :ㅣ 출력 : 입력하신 문자열 helloworld에서 찾으시는 문자 l은 3개
	 * 입니다.
	 * @author 깔끔한 청년
	 * @Date 2020.12.14
	 */
	char ch; int hi=0;
	Scanner sc =new Scanner(System.in);
	System.out.println("문자열 입력 구간 : ");
	String arr=sc.nextLine();
	System.out.println("찾을문자 ");
	ch= sc.next().charAt(0);
	
	for(int i= 0;i<arr.length(); i++) {
		if(arr.charAt(i)== ch) {
			hi++;
		}
	}
	System.out.println(hi+"개 있습니다.");
}

	
}
