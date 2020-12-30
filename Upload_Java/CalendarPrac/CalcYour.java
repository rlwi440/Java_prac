package com.api.calendar.CalcYourDays;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalcYour {
    /**
     * 생일(년,월,일 )입력받고 오늘이 태어난지 몇일 되었는지 출력 ex)(97/10/01)
     * @param SimpleDateFormat, Integer.parseInt
     * @author 깔끔한청년
     * @Date 2020.12.30
     */
public static void main(String[] args) {
	Date cal= Calendar.getInstance().getTime(); //하나의 인스턴스 
	SimpleDateFormat yearDateFormat =new SimpleDateFormat("yyyy"); //년도
	SimpleDateFormat monthDateFormat =new SimpleDateFormat("MM");// 달  소문자 대문자 주의!!
	SimpleDateFormat dayDateFormat =new SimpleDateFormat("dd");	//일 
	
	Scanner sc=new Scanner(System.in);
	
	int kiYear= Integer.parseInt(yearDateFormat.format(cal)); 
	int kiMonth= Integer.parseInt(monthDateFormat.format(cal)); 
	int kiDay=Integer.parseInt(dayDateFormat.format(cal));
	
	int birthYear=0; 
	int birthMonth=0;
	int birthDay=0;
	
	int dayCount =0;
	
	System.out.println("태어난 년을 입력:");
	birthYear=sc.nextInt();
	System.out.println("태어난 월을 입력:");
	birthMonth=sc.nextInt();
	System.out.println("태어난 일을 입력:");
	birthDay=sc.nextInt();
	
	dayCount=kiDay-birthDay;
	System.out.println(dayCount);
	dayCount= dayCount+((kiMonth*30)-(birthMonth*30));
	System.out.println(dayCount);
	dayCount= dayCount+((kiDay*365)-(birthDay*365));
	System.out.println(dayCount);
	
	System.out.println("오늘벌써 태어난지 "+dayCount+"일 되는날입니다.");
}
}
