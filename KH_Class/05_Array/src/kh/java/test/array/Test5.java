package kh.java.test.array;

import java.util.Scanner;

class Test5 {
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
