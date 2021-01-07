package kh.java.inherit.basic;

public class Run {

	public static void main(String[] args) {
		/**
		 * 부모클래스 는 자식클래스는 접근불가. 현실로 생각하면 상속 : 부모님 돈 -> 너 돈 상속을 하면 부모 꺼를 자식이 쓸 수 있어
		 * 
		 * 상속을 하면 자식 메서드로 호출을 해도 에러가 제외 왜냐면 부모가 곧 자식이니까
		 * 
		 * extend class 옆에 사용 하나의 클래스만 사용이 가능해 가상 클래스 final 변수, 함수를 선언만 할 수 있어
		 * 
		 * implements interface를 상속을 받을 떄 사용 다중 상속이 가능해 interface를 상속받을 경우 오버라이딩 함수의
		 * 재정의가 가능하다. interface final 변수, 함수를 선언만 할 수 있어
		 */
		Child1 ch1 = new Child1();
		ch1.name = "홍길동";
		ch1.age = 30;
		ch1.printInfo();
		ch1.say();
		ch1.game();
		
		System.out.println("==================");
		Child2 ch2 = new Child2();		//확장은 위에서 아래로 가능하다 .
		ch2.name ="마이콜 ";
		ch2.age=18;
		ch2.printInfo();
		ch2.say();
		ch2.ListenToMusic();
		System.out.println("==================");
		
	
		GrandChild gc =new GrandChild(); 
		gc.name="둘리";
		gc.age=20;
		gc.printInfo();
		gc.say();
	}
	
}