package com.ki.test.field;


public class Tire {
	//필드 
	protected  int maxRotation;		// 최대회전수 
	protected int accumulationRotation;	//누적 회전수
	protected String location;		//타이어의위치 
	
//생성자
 public Tire(String location ,int maxRotation  ) {
	this.maxRotation=maxRotation;
	this.location=location;
	}
 //메소드 
 public boolean roll() {
	 ++accumulationRotation;	//누적 회전수 1증가 	
	 if(accumulationRotation<maxRotation) {
		 System.out.println(location + "Tire 수명 : "+(maxRotation-accumulationRotation)+"회");		//정상회전(최대) 일 경우 실행
		 return true;
	 }else {
		 System.out.println("***"+location+"Tire펑크 ***");	//펑크(누적=최대)일경우 실행
		 return false;
	 }
	 
 }
}
