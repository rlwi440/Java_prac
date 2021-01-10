package ncs.Test3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateTest {
	/**
	 * 	생일 : 1987년 5월 27일 수요일	
		현재 : 2016년 4월 18일
		나이 : 29 세
	 * 
	 */
public static void main(String[] args) {
	SimpleDateFormat sim =new SimpleDateFormat("yyyy년 MM월 dd일 ");	//SimpleDateFormat 날짜형식지정구간
	GregorianCalendar my =new  GregorianCalendar();	//원하는 날짜  및 시간 정보를 셋팅값 
	my.set(1987,4,27);	//set 값 세팅값 
	String  day=null;
	
	GregorianCalendar Today =new GregorianCalendar();		//Year, Month,Date
	int year=Today.get(Calendar.YEAR);
	int Month=Today.get(Calendar.MONTH);
	int Date=Today.get(Calendar.DATE);	
	
	System.out.println("생일  : " +sim.format(my.getTime()));	//생일 입력구간
	switch (my.get(Calendar.DAY_OF_WEEK)) {		// 일주일 0~ 6까지 기억하기 
	case 1: day="일";	break;
	case 2: day="월";	break;
	case 3: day="화";	break;
	case 4: day="수";	break;
	case 5: day="목";	break;
	case 6: day="금";	break;
	case 7: day="토";	break;
	}
	System.out.println(" "+day+"요일 ");
	System.out.println("현재 : "+sim.format(Today.getTime()));
	System.out.println("나이 : "+(year-my.get(Calendar.YEAR))+"세 ");
	}
}