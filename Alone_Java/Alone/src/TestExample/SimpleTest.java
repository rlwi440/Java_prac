package test.controller;

import java.util.Scanner;

public class Test1 {
    /**
     * 6개의 예제연습 공부한것들  조건문,while,dowhile 문 Swich문 , 접근제어자 연습
     * @author 깔끔한청년
     * @Date 2020. 12.20 
     */

	public static void main(String[] args) {
		Test1 ki = new Test1();
		ki.test();
		ki.test2();
		ki.test3();
		ki.test4();
		ki.test5();
		ki.test6();
	}
	private String sum1;

	public void test() {
		Scanner sc= new Scanner(System.in);
		System.out.println("정수입력 :");
		int num=sc.nextInt();
			if(num>= 1&& num<=100) {
				System.out.println("2의배수가입니다\n");
			}else if  (num%2!=0){
				System.out.println("2의배수아닙니다.\n");
			}
	}
		  
	public void test2() {
		for(int i=2; i<6; i+=1) { 
	            for(int j=1; j<10; j++) {
	            	if(i*j%2==1) {
	                System.out.println(i + " x " + j + " = " + i*j);
	                
	            }
	            	System.out.println();
	        }
	    }
	}
	public void test3() {
		 int sum = 0, i = 0;
	      double avg;
	      
	      /**
	       * while과 do while의 차이
	       * 
	       * do while은 반드시 한번은 실행 하기 위해서 사용
	       * while은 조건이 맞을 경우만 실행
	       * 같은 점은 두 개를 반복문안에 증감값을 사용하지않으면 무한 루프
	       */
	      do {
	         
	         /**
	          * sum = sum + i 
	          * 왜냐면 sum은 모든 숫자를 더한 값이 때문
	          */
	         sum = sum + i;
	         i++;
	      }while(i <= 100);
	      
	      /**
	       * 데이터에 대한 출력은 변수 선언을 했을 경우 무조건 변수에 담아서 넘겨줘야한다
	       */
	      avg = sum / i;
	      
	      System.out.println("합계 : " + sum);
	      System.out.println("평균 : " + avg);
	   }
	
	public void test4() {
		int x =4; int y=2;
		int result= (x+y);
		int result1 =(x-y);
		int result2 =(x*y);
		int result3= (x/y);
		System.out.println("합 :" +result);
		System.out.println("차  :" +result1);
		System.out.println("곱 :" +result2);
		System.out.println("나누기 " +result3);
	}
	public void test5() {
		int num1 =abc(); int num2= abc();
		if(num1>=1 && num1<=9) 
		{ if(num2>=1&&num2<=9)
		if(num1*num2 <10)
			System.out.println("한자리수입니다.");
			else System.out.println("두 자리 수입니다.");
		}
	
	}
	public int abc() {		//접근제어자  int num 1,2  접근성 
		Scanner sc =new Scanner(System.in);
		System.out.println("정수입력 :  ");
		int num= sc.nextInt();
		return num;
	}
	public void test6() {
		Scanner sc =new Scanner(System.in);
		System.out.println("입력구간 :");
		int num= sc.nextInt();
		switch(num) {
		case 1: System.out.println("**입력이 정상으로 되었습니다.**") ; break;
		case 2: System.out.println("**조회가 시작되었습니다**"); break;	
		case 3: System.out.println("**수정이 정상적으로 되었습니다 **"); break;
		case 4: System.out.println("**삭제가 정상적 으로 되었습니다**"); break;
		case 5: System.out.println("**정상적으로 종료되었습니다**"); break;
		default: System.out.println("다시 입력해주세요");
		}
	}
}
		
	