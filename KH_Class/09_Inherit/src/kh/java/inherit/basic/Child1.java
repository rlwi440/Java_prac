package kh.java.inherit.basic;

public class Child1 extends Parent{
	/**
	 * Super () 부모생성자 를 호출
	 * 생략해도 JVM이 자동으로 생성호출 
	 * 맨 첫줄에 작성되어야 함.
	 * this와 동시 사용불가.
	 * this가 다른 생성자를 호출하는 키워드 이고 , super가 부모생성자를 호출
	 */
	public Child1 () {
		super(); // 부모생성자 자동호출 		맨첫줄에 만 사용가능합니다 this 
		System.out.println("Child1 생성자 호출");
	}
	/**
	 * 매소드 재작성 Override 
	 */
	public void say() {
	System.out.println("다 내꺼야 ");	
	
	}
	
	
	public void game() {
		System.out.println("첫째가 게임을 합니다.");
	}
}