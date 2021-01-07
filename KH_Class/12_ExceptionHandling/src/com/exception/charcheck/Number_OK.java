package com.exception.charcheck;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Number_OK {
		Scanner sc = new Scanner(System.in);
		int rnd, cnt;
		
		public static void main(String[] args){
			
			new Number_OK().go();
			
			System.out.println("프로그램을 종료합니다.");
		}

		public void go() {
			getRandomNumber();
			
			while(true){
				
				cnt++;
				
				int userNum = getNumber();
				
				int result = checkNumber(userNum);
				
				if(result > 0)
					System.out.println("입력한 숫자보다 작습니다.");
				else if(result <0)
					System.out.println("입력한 숫자보다 큽니다.");
				else {
					System.out.print("맞았습니다(."+cnt+"번) \n\n 계속 하시겠습니까? (y/n) : ");
					String answer = sc.next();
					
					if(answer.toLowerCase().charAt(0)=='y'){
						getRandomNumber();
					}
				}
					
			}
		}

		public void getRandomNumber() {
			rnd = new Random().nextInt(100)+1;
			
			cnt = 0;
		}

		public int checkNumber(int userNum) {
			int result;
			
			if(userNum-rnd>0) result = 1;		//입력숫자가 큰 경우	: 입력하신 숫자보다 작습니다.
			else if(userNum-rnd<0) result = -1;	//입력숫자가 작은 경우 : 입력하신 숫자보다 큽니다.
			else result = 0;					//정답.
			
			return result;
		}

		/**
		 * 사용자 정수 입력 메소드
		 * 
		 * InputMismatchException 에 대해서
		 * 
		 * -----------------------------------------------------------------------------------
		 * When a scanner throws an InputMismatchException, 
		 * the scanner will not pass the token that caused the exception, 
		 * so that it may be retrieved or skipped via some other method.
		 * -----------------------------------------------------------------------------------
		 * That means that if the next token is not an int, it throws the InputMismatchException, 
		 * but the token stays there. 
		 * So on the next iteration of the loop, sc.nextInt() reads the same token again and throws the exception again. 
		 * What you need is to use it up. Add a reader.next() inside your catch to consume the token, 
		 * which is invalid and needs to be discarded.
		 * 
		 * @return
		 */
		public int getNumber() {
			int num;
			while(true){

				try {
				
					System.out.print("정수 입력 : ");
					num = sc.nextInt();
					break;	//정상적인 수를 입력한경우, 반복문 종료!
					
				} catch (InputMismatchException e){
					
					System.out.println("정수를 입력하세요!");
					sc.next();
					
//					throw e;
				}
			}
			
			return num;
		}
		
	}
