package com.method.prac;
/**
 * 매개변수 선언부
 * 매개변수의 개수를 모를경우
 * int sum1(int[]value)  매개변수를 배열타입으로 선언
 * @author 깔끔한청년
 * @Date 2020.12.20
 */
public class Computer {
	int sum1(int[]values) {
		int sum=0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	int sum2(int...values) {
		int sum=0;
		for(int i=0; i<values.length; i++) {
			sum+=values[i];
		}
		return sum;
	}
}
