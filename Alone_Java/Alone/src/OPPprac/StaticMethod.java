package kh.java.oop.method.static_;

import java.util.Scanner;

public class StaticMethod {
	/**
	 * 1. 전달한 문자열을 모두 대문자로 바꾸는 static 메소드
	 * 2.첫번째 문자열의 전달받은 인덱스의 문자를 전달받은 문자로 변수
	 * 3. 전달한 문자열에서 영문자의 개수를 리턴하는 static 메소드
	 * 4. 전달한 문자열값을 하나로 합쳐서 리턴 
	 * Static 예제 몇번다시 풀어보기 지금 실력 꽝 ! ..너무 부족하다!!!
	 * 
	 * @author 깔끔한청년
	 * @Date 2020.12.19
	 */
	public static String toUpper(String st) {
			Scanner sc =new Scanner(System.in);
		String prac= " ";	 // 대문자 입력구간  
		for(int i=0 ; i<prac.length(); i++) {
		char o= sc.next().charAt(0);
		if(o>='a'&& o <='z') {
			o -=26; 		// 대문자 26개 
		}
		prac +=o;
		}
		return prac;
	}
	public static char  setChar(String st,int o) {
		return  st.charAt(o);		
	}
	public static int getAlphabetLength(String x) {	// 다시 공부 응용 공부 
		int cnt=0;
		for(int i=0; i<x.length(); i++) {
			char ab=x.charAt(i);
			if((ab >= 'a' && ab<= 'z') || (ab >= 'A' &&  ab <= 'Z')) {
				cnt ++;
			}
		}
		return 0;
	}
	public static String conact(String ki1, String ki2) {
		/**
		 * JS concat  
		 * 예제) s1="경기광주"
		 * s2="깔끔한청년"
		 * s3="_"
		 * s4= concat(s1,s2,s3) // returns "<span class =" ">깔끔한 청년 공부   </sapn> 
		 * alert(s4);
		 * alert(s1+s2+s3)
		 */
		String str3 = "";
		for(int i = 0; i < ki1.length(); i++) {
			char x = ki1.charAt(i);
			str3 += x;
		}
		for(int i = 0; i < ki2.length(); i++) {
			char x = ki2.charAt(i);
			str3 += x;
		}
		return str3;
	}

}
