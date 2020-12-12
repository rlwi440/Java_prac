package com.kh.test.break_continue;

import java.util.Random;
import java.util.Scanner;

public class Test2 {
    /**
     * 1~100 사이의 임의의 난수를 발생시키고, 
       정수 한 개를 입력 받아  출력문 완성.
     * @author 깔끔한청년
     * @date 2020.12.12
     */
	public static void main(String[]args) {
		Test2 ki = new Test2();
		ki.test();
	}
	public void test() {
		int size ; int[]arr;  
		Scanner sc= new Scanner(System.in);		//Scanner 클래스 기반 인스턴스 생성
		System.out.println("정수한개 출력: ");	//안내메세지 출력 
		size =sc.nextInt();

        arr= new int[size];
        /**
         * 예시  int [] arr=  new int [size] [] <- 배열방 
         * size 변수에  담아낸 수 만큼 배열방 만들기. 
         */		
		
        Random rd= new Random();
         /**
          * 무작위 숫자릎[난수]를 발생시키기 위해, 발생전용 객체
          */  
		
		for(int i=0;i<size;i++) {
			arr[i]=rd.nextInt(100)+1; 
			System.out.printf("%3d",arr[i]);							
		}
		System.out.println();
		System.out.println();
	 int max,min;
	max=min=arr[0];
	for(int i=1; i<arr.length; i++) {
		if(max<arr[i])
			max=arr[i];
		if(min>arr[i])
			min=arr[i];
		}
	System.out.printf("가장 큰값은 :%d 가장작은값은: %d\n" ,max,min);
	System.out.println(min+ "회 만에 맞추셨습니다" );
	}

}

	
	

