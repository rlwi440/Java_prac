package kh.java.jdk.api;
/**
 * 값비교 연산자
 * 1.기본형의 값비교
 * 2.참조형의 주소값비교
 *  - true 같은객체를 가리키고있다.
 *  -false 다른객체를 가리키고 있다 .
 *  String 참조형
 *  String 의 값비교는 equals 를 사용해야한다. 
 *  1.기본형
 *  2. 참조형 
 *
 */
public class StringTest {

	public static void main(String[] args) {
//		int a=10 ,  b=20;
////		System.out.println(a==b);
//		
//		StringTest s1 =new StringTest();
//		StringTest s2 =s1;
//		System.out.println(s1==s2);
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
//		
//		s2 =new StringTest();
//		System.out.println(s1==s2);
		
		// 문자열 값비교
		String s1 = "java";
		String S2 = new String("java");
		System.out.println("java"== "java");
		System.out.println(s1 == S2);
		System.out.println(s1.equals(S2));//equals 사용하기
		
		
		String S3 ="java";
		System.out.println(s1 ==S3 );
	}
	;
	
	

}
