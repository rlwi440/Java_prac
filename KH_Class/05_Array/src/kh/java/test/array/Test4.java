package kh.java.test.array;

import java.util.Scanner;

public class Test4 {

public static void main (String[]args) {
	Test4  ki= new Test4();
	ki.test();
}

public void test() {
	Scanner sc = new Scanner(System.in);
	System.out.println("전화번호 입력 : ");
	String number = sc.next();
	// 010- 1234-1234
	char[] arr = new char[13];
	for (int i = 0; i < arr.length; i++) {
		if (i >= 4 && i <= 7) {
			arr[i] = '*';
		} else {
			arr[i] = number.charAt(i);
		}
		System.out.print(arr[i]);
	}
}

}