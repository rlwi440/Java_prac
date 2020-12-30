package com.api.member.model.vo.member;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {
	public static final int length = 0;
	private int memberNO;
	private String  memberName;
	private int height;
	private int weight;
	private Calendar birth;

	
	public Test(int memberNO ,String memberName,int height, int weight,Calendar birth) {
		super();
		this.birth=birth;
		this.height=height;
		this.memberName=memberName;
		this.memberNO=memberNO;
		this.weight=weight;
	}

	public int getMemberNO() {
		return memberNO;
	}

	public void setMemberNO(int memberNO) {
		this.memberNO = memberNO;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Calendar getBirth() {
		return birth;
	}

	public void setBirth(Calendar birth) {
		this.birth = birth;
	}
	public String information() {
		/**
		 * 날짜 : java.SimpleDateFormat
		 */
		long difference =birth.getTimeInMillis();	
		
		Date date =new Date(difference);		//format 공부
		SimpleDateFormat sdf =new  SimpleDateFormat("yyyy-MM-dd");
		return memberName +"이름 " +memberNO+"회원"+height+"키"+ weight+"몸무게"
				+ "생일:"+ sdf.format(date);	//
	}
}
