package com.ki.test.field;

public class CarExample {
    /**
     * CarExample Main 클래스 , Tire,car,금호타이어,한국타이어 를 이용하는 실행 클래스 예제입니다.
     * 메개변수의 다형성 예제 연습문
     * @author 깔끔한청년
     * @Date 2020.12.27
     * 
     */
 public static void main(String[] args) {
	Car car =new Car();
	for(int i=1; i<5; i++) {
		int problemLocation =car.run();	//car객체의 run 메소드 5번 반복실행
		switch(problemLocation) {
		case 1:
			System.out.println("앞왼쪽 HankookTire로 교체");
			car.frontLefttIire= new HankookTire("앞왼쪽",15);
			break;
		case 2:
			System.out.println("앞오른쪽 KumhoTire로 교체");
			car.frontRighttIire= new KumhoTire("앞오른쪽",13);
			break;	
		case 3:
			System.out.println("앞왼쪽 HankookTire로 교체");
			car.backLefttIire= new HankookTire("뒤왼쪽",14);
			break;
		case 4:
			System.out.println("앞오른쪽 KumhoTire로 교체");
			car.backRighttIire= new KumhoTire("뒤오른쪽",17);
			break;
		}
		System.out.println("=============================");
	}
}
}
