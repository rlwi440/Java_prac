package com.api.member.model.vo.member.run;

import java.util.Calendar;
import java.util.StringTokenizer;

import com.api.member.model.vo.member.Test;

public class Run {
	private static Object cal;

	/**
	 * 다음과 같이 회원정보를 하나의 문자열로 담았다. 각회원별 정보의 순서는 회원번호,이름,키,몸무게,생일(yyyyMMdd)이다.
	 * 
	 * "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319"
	 * 
	 * 각각의 회원정보를 분리해서, 회원객체에 담고, 회원객체배열에 추가한다.
	 * 
	 * 출력메소드를 통해 회원정보를 출력한다.
	 * 회원정보 과정중에 출력실패 ..
	 * 
	 * @author 깔끔한청년
	 * @Date 2020. 12.30
	 * 
	 */

	public static void main(String[] args) {
		String str = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";
		String [] baeki= str.split("|");
		String [] temp; // 임시변수
		Test [] arr= new Test [baeki.length]; 
		
		for(int i=0; i<str.length();i++) {
			StringTokenizer ki= new StringTokenizer(",");
			temp =new String[5];	//임시변수 tloken 5개..
			int j=0;
			while(ki.hasMoreTokens()) {		//문제 2번째 문제 참조
				temp[j]=ki.nextToken();
				j++;
			}
			Calendar cal=Calendar.getInstance(); //Calenda 객체이용
			cal.set(Calendar.YEAR,Integer.parseInt(temp[4].substring(0,4)));  
			cal.set(Calendar.MONTH,Integer.parseInt(temp[4].substring(4,6))-1);	 
			cal.set(Calendar.DATE,Integer.parseInt(temp[4].substring(6)));
			arr[i]= new Test(Integer.parseInt(temp[0]),
				temp[1],Integer.parseInt(temp[2]),Integer.parseInt(temp[3]),cal);   // 모르겠다 복습요망 ..
			}
		for(Test k: arr) {
			System.out.println(k.information());
		}
		
	}
			
}

