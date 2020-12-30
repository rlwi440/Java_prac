package com.exception.number;

public class NumberProcess {
	/**
	 * boolean형을 사용하고 , flag(상태확인) 개념이다 .
	 * public boolean checkDouble(int a, int b){} 사용하였습니다
	 * @author 깔끔한청년
	 * @Date 2020.12.31
	 * @param a
	 * @param b
	 * @return
	 * @throws Exception
	 */
	public boolean checkDouble(int a, int b) throws Exception{
	if (!(a>=1&&a<=100&&b>=1&&b<=100))	//단, 전달된 첫번째와 두번째 수가 1~100사이의 값이 아니면  느낌표를 사용한이유 
		throw new NumberRangeException("1부터 100사이의 값이 아닙니다.");	//에러메시지 입력  throw 개념 떠넘기다.
	 if(a%b ==0)
		return true;	
	else
		return false;
	}
} 	
	
