package kh.java.test.array;

import java.util.Scanner;

public class Test4 {
	/**
	 *  사용자의 전화번호를 입력받고, 11자리의 문자형배열에 저장한후,  가운데 4자리를 *로 가리기.  
     *	단, 원본 배열값은 변경 없이 배열 복사본으로 변경하세요
	 * @author 깔끔한청년
	 * @Date 2020.12.15
	 */

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
	//char 13자리 생성
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