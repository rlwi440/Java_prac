package kh.java.oop.encapsullation.account;

public class AccountMain {

	public static void main(String[] args) {
		
		Acount acc = new  Acount();
//			acc.name = "홍길동";
//		acc.balance = 1_000_000;
		acc.setName("홍길동");
		acc.setBalance(1_000_000);
		
		//입금\
		acc.deposit(500_000);
		//		acc.balance += 500_000;
//		System.out.println(acc.name + "님 계좌 잔액  : " + acc.balance + "원");
		System.out.println(acc.getName() + "님 계좌 잔액  : " + acc.getBalance() + "원");
		acc.withrdraw(100_000);
		acc.withrdraw(100_000_000);
		
//		acc.balance -= 100_000_000;
//		System.out.println(acc.name + "님 계좌 잔액  : " + acc.balance + "원");
		
	}
}
