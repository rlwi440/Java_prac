package kh.java.oop.encapsullation.account;
/**
 * 캡슐화 
 * 
 *구조체 의 단점을 극복한 클래스
 * -private 접근제한자를 사용해 field 의 직접 접근을 방지
 * public 접근제한자를 사용한 method 을 이용해 우회적으로 사용
 * 
 *  
 *
 */

public class Acount {
	// private 접근제한자 : 같은 클래스 내부에서만 접근 가능
	private String name;
	private long balance; // 잔액

	// public method를 통통해 우회접근
	// setter : 필드값을 세팅하기
	// this : 현재객체를 가리키는 메소드안의 숨은 참조값
	public void setName(String name) {
		this.name = name;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	// getter : 필드값을 가져오기, getter는 값을 return 받게 해주는 메소
	public String getName() {
		return name;
	}

	public long getBalance() {
		return balance;
	}

	/**
	 * 입금
	 */
	public void deposit(long money) {
		if (money > 0) {
			balance += money;
			System.out.println(name + "님 계좌에" + money + "원이 입금되었습니다.");
		} else
			System.out.println("잘못된 금액이 입력되었습니다.");
	}

	/**
	 * 출금
	 */
	public void withrdraw(long money) {
		if (money <= balance) {
			balance -= money;
			System.out.println(name + "님 계좌에" + money + "원이 출금되었습니다");

		} else
			System.out.println("잔액이 부족합니다");
	}
}