package kh.java.test.array;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Test6 ki =new Test6();
		ki.test();
		ki.test2();
	}
	public void test() {
		Scanner sc =new Scanner(System.in);
		System.out.println("전화번호 입력 : ");
		String name =sc.next();
		char[] arr=  new char[13];
		for(int i=0; i<arr.length; i++) {
			if(i>=4&&i<=7) {
				arr[i]='*';
			}
			else {
				arr[i]=name.charAt(i);
			}
			System.out.print(arr[i]);
		}
 	}
	public void test2() {
		Scanner sc= new Scanner(System.in);
		System.out.println("주민등록번호 입력 :");
		String num=sc.next();
		char[]arr= new char[14];
		for(int i=0; i<arr.length; i++) {
			if(i>7) {
				arr[i]='*';
			}else {
				arr[i]=num.charAt(i);
			}
			System.out.print(arr[i]);
		}
	}
}
