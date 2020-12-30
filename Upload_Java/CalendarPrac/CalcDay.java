package com.api.calendar.CalcDday.test1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalcDay {
	/**
	 * 수료일까지 남은 일수를 계산해서 다음과 같이 출력하세요. Calendar클래스를 이용해서 D-DAY계산기를 만드세요. 출력은 다음과
	 * 같습니다.
	 * @author 깔끔한청년
	 * @Date 2020.12.30
	 * 
	 */
	public static void main(String[] args) {
		CalcDay  cal =new CalcDay(); 
	cal.test();
	cal.test2();
}
	public void test() {

	Calendar finalDay= new GregorianCalendar(2021,06,8);	//GregorianCalendar클래스 생성자  년도 ,월 ,일  -1 
	
	Calendar now =Calendar.getInstance();
	long nowday= now.getTimeInMillis();		
	long finalDayday=finalDay.getTimeInMillis();
	/**
	 * millis //1000(초) /60(분)/60(시)/24(일)
	 * long diff =(num2- num1)/1000 /60/60/24 ;
	 */
	long  diff =(finalDayday-nowday)/1000/60/60/24;
	
	if(diff==0) {
		System.out.println("D-Day입니다");
	}else{
		System.out.println("D-"+diff+"일입니다.");
		}
	}
	
	public void test2() {
		Calendar finalDay= new GregorianCalendar(2021,06,8);
		Calendar now =Calendar.getInstance();
		long nowday= now.getTimeInMillis();		
		long finalDayday=finalDay.getTimeInMillis();
		/**
		 * millis //1000(초) /60(분)/60(시)/24(일) long diff =(num2- num1)/1000 /60/60/24 ;
		 */
		long diff = (finalDayday - nowday) / 1000 / 60 / 60 / 24;

		if (diff > 0) {
			System.out.println("D-" + (diff + 1) + "일입니다.");
		} else if (diff == 0) {
			System.out.println("D-Day입니다.");
		} else if (diff < 0) {
			System.out.println("D-" + (diff - 1) + "일 지났습니다.");

		}
	}d

}
