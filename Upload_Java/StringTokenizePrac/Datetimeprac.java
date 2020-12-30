package kh.java.api.datetime;

import java.util.Calendar;

public class DateTimepractest {
	/**
	 * 사용자로부터 생일(년, 월, 일)을 입력받고, 오늘이 태어난지 몇일 되었는지 출력하세요
	 * @author 깔끔한청년
	 * @Date 2020.12.30일 
	 * 
	 */
	public static void main(String[] args) {
		DateTimepractest ki =new DateTimepractest();
		ki.test();
	}
	public void test() {
	Calendar baeki= Calendar.getInstance();
	baeki.set(2011,2,21,3,20,5);
	
	int year=baeki.get(Calendar.YEAR);
	int month=baeki.get(Calendar.MONTH);
	int Date=baeki.get(Calendar.DATE);
	int dayofweek=baeki.get(Calendar.DAY_OF_WEEK);
	int hour=baeki.get(Calendar.HOUR);
	int minute =baeki.get(Calendar.MINUTE);
	int second =baeki.get(Calendar.SECOND);
	
	String [] Cal= {"일","월","화","수","목","금","토"};
	System.out.printf(year+"년"+month+"월"+Date+"일"+Cal[dayofweek-1]+" "
		+hour+"시"	+minute+"분"+second+"초");

	}
}
