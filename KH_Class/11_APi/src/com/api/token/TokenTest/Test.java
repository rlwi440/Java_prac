package com.api.token.TokenTest;

import java.util.StringTokenizer;

public class Test {
	/**
	 * "J a v a P r o g r a m " 문자열 값을 공백 단위로 Token 처리하여 char [] 에 저장하여 출력하시오.
	 * 시간을 오래 잡아먹은이유 char   배열선언.. 공부 요망 ..
	 * @author 깔끔한청년
	 * @Date 2020.12.29 요문제는 복습구간 다시한번더 풀어보기
	 */
public static void main(String[] args) {
	int i=0;  
	String data ="j a v a P r o g r a m";
	System.out.println("토큰 처리전 결과:" +data);
	System.out.println("전 글자갯수 출력 :"+ data.length());
	StringTokenizer ki =new StringTokenizer(data+" ");
	char [] ch=new char[ki.countTokens()];	//char 선언
	System.out.println("토큰 처리후 글자갯수출력: "+ki.countTokens());

	while(ki.hasMoreTokens()) {
		ch[i]+= ki.nextToken().charAt(0);
		i++;
	}
	for(int j=0; j<ch.length; j++) {
		System.out.print(ch[j]+ " ");
		}
	}
}
