package kh.java.test.array;

import java.util.Scanner;

class Test5 {
	/**
	 * 주민등록번호 성별자리 이후부터 *로 가리기.  
     *	단, 원본 배열값은 변경 없이 배열 복사본으로 
     *	변경하세요
	 * @author 깔끔한청년
	 * @Date 2020 .12.15 
	 */
	public static void main(String[]args) {
		Test5 ki = new Test5();
		ki.test();
}
	public void test() {
	Scanner sc =new Scanner(System.in);
	 System.out.println("주민등록번호 입력: ");
	String num = sc.next();
	char[] arr =new char[14];
	for(int i=0; i<arr.length; i++) {
		if(i>7) {
			arr[i] ='*';
		}else {
			arr[i]=num.charAt(i);
		}
		System.out.println(arr[i]);
	}
	}
}
