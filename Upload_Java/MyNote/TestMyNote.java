package com.io.test2;

import java.util.Scanner;

/**
 * 
 ****** MyNote *******
 * 
 * 1. 노트 새로 만들기 //MyNote의 fileSave() 2. 노트 열기 //MyNote의 fileOpen() 3. 노트 열어서
 * 수정하기 //MyNote의 fileAppend() 4. 끝내기 //main() 으로 리턴
 * 
 * 메뉴 선택 : 번호입력
 * 
 * 입력된 번호에 따라, MyNote 의 메소드 실행시킴 메뉴 반복 실행
 * 
 *
 * 
 */

public class TestMyNote {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		MyNote ki =new MyNote();
		while(true) {
			System.out.println("******   MyNote  *******");
			System.out.println("1. 노트 새로 만들기	");
			System.out.println("2. 노트 열기");
			System.out.println("2. 노트 열어서 수정하기 ");
			System.out.println("끝내기");
			System.out.println("========================= ");
			int menu =sc.nextInt();
			switch(menu){//메뉴 선택 : 번호입력
				case 1:
					ki.fileSave();
					break;
				case 2:
					ki.fileopen();
					break;	// fileAppend 수정예정

				case 3: 
					System.out.println("프로그램을 종료합니다.");
					return;
			}	
		}
	}
}
