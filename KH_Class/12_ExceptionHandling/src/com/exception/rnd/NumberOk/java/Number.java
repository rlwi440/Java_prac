package com.exception.rnd.NumberOk.java;

import java.util.Scanner;

public class Number {
	/**
	 * 임의의 난수(1~100사이의 정수)를 발생시켜 키보드로 입력된 값과 비교하여, 임의의 정수를 알아 맞히는 프로그램
	 * 
	 * main 메서드 : - 메서드 호출은 객체레퍼런스를 통해 게임시작메소드 호출. 키보드 입력용 메서드 : +getNumber() : int
	 * - 사용자의 입력예외에 대해 예외처리 할 것 메서드명 : +checkNumber(int) : int - 이 메서드에 키보드로 입력받은
	 * 정수를 넘겨 임의로 발생된 정수와 비교하여, 같으면 0 난수보다 적으면 -1, 난수보다 크면 1을 리턴함 메인에서 반환값에 따라 정수를
	 * 맞힐 때 까지 checkNumber 반복 실행 값을 맞히면 "맞았습니다." 출력하고, 몇번째에 맞혔는지도 출력 계속 할 것인지 물어서, y
	 * 이면 계속, n 이면 종료시킴
	 * @author 깔끔한청년
	 * @Date 2020.12.31
	 */
	private int ki; // 접근제어자

	public static void main(String[] args) {
		Number n = new Number();
		n.start();
	}

	public void start() {
		int count = 0;
		ki = (int) (Math.random() * 100) + 1;
		while (true) {
			System.out.println("정수 입력 :");
			int temp; // 임시변수
			try {
				temp = getNumber(); // 키보드 입력용 메서드 : +getNumber()
				temp = checkNumber(temp);
				count++;
				if (temp == 0) {
					System.out.println("=====정답입니다 .=====" + count);
					break;
				} else if (temp == -1) {
					System.out.println("난수보다 크다"); // 난수보다 적으면 -1,
				} else if (temp == 1) {
					System.out.println("난수보다 작다");
				}
			} catch (Exception e) {
				System.out.println("====오류결과=====");
				continue;
			}
		Scanner sc = new Scanner(System.in);
		System.out.println("게임계속 하나여? : ");
		String s = sc.nextLine();
		if (s.equals("y")) { // 계속 할 것인지 물어서, y 이면 계속
			count = 0;
			ki = (int) (Math.random() * 100) + 1;
			System.out.println("===================");
			System.out.println("게임을 다시시작합니다");
			System.out.println("===================");
		} else {
			System.out.println("===================");
			System.out.println("게임을 중단합니다");
			System.out.println("===================");
				break;
				}
			}
		}
	



	public int checkNumber(int temp) { // 메서드 입력
		if (ki == temp)
			return 0;
		else if (ki < temp)
			return -1;
		else
			return 1;

	}

	public int getNumber() throws Exception { // throw키워드 강제로 예외 를 발생시킨다
		int input;
		try {	
			Scanner sc = new Scanner(System.in);
			input = sc.nextInt();
			if (input >= 1 && input <= 100)
				return input;
			else
				throw new Exception("정수의 범위가 아닙니다.");
		} catch (Exception e) {
			throw new Exception("숫자가 아닙니다");
		}
	}
}
