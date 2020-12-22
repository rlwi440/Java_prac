package com.oop.coffe.dto.Coffe;

import java.util.Scanner;
/**
 * 1. Coffee 클래스에 대한 객체 배열(세계3대커피정보) 선언함. 배열크기 
 *	2. 사용자에게 키보드로 세계3대 커피정보를 입력받아, 각 객체에 기록함
 *	3. 출력 확인함
 * @author 깔끔한청년
 * @Date 2020.12.22
 */

public class CoffeManager {
	private String origin;
	private String location;

	private Coffe[] coffee = new Coffe[3]; // 멤버변수

	public CoffeManager() {

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < coffee.length; i++) {

			System.out.print("세계 커피의 나라를 입력해주세요 :");
			origin = scan.next();

			if (origin.isEmpty())
				origin = "해당 나라를 입력하지않았습니다.";
			System.out.print("세계 커피의 지역을 입력해주세요 :");
			location = scan.next();
			if (location.isEmpty())
				location = "해당 나라를 입력하지않았습니다.";
			coffee[i] = new Coffe(origin, location);

		}

		System.out.println("====<<세계3대 커피>>====");
		System.out.println("=====================");
		System.out.println("원산지=============지역 ");
		for (int i = 0; i < coffee.length; i++) {
				coffee[i].printScan();	
		}
		System.out.println("=====================");
	}

}
