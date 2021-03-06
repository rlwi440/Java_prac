package com.ki.test.field;

public class KumhoTire extends Tire {

	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	@Override
	public boolean roll() {
		 ++accumulationRotation;	//누적 회전수 1증가 	
		 if(accumulationRotation<maxRotation) {
			 System.out.println(location + "KumhoTire 수명 : "+(maxRotation-accumulationRotation)+"회");		//정상회전(최대) 일 경우 실행
			 return true;
		 }else {
			 System.out.println("***"+location+"KumhoTire펑크 ***");	//펑크(누적=최대)일경우 실행
			 return false;
		
		 	}	
		}
	}
