package ki.BankAccount;

import java.util.Scanner;

public class AccountTest {
	/**
	 * (1) 다음과 같은 4개의 계좌 생성
	 * 
	 * 일반 계좌(계좌번호 11, 잔액 1000로 초기화) 일반 계좌(계좌번호 22로 초기화) 마이너스통장 계좌(계좌번호 33, 잔액 1000,
	 * 대출한도 500로 초기화) 마이너스통장 계좌(계좌번호 44, 대출한도 500로 초기화)
	 * 
	 * (2) 4개 계좌의 최대 출금 가능액 각각 출력 (3) 사용자로부터 출금액 입력받아 4개 계좌에서 각각 출금 수행 (4) 사용자로부터
	 * 입금액 입력받아 4개 계좌에 각각 입금 수행 (5) 4개 계좌의 최대 출금 가능액 각각 출력
	 *  @author 깔끔한청년
	 *  @Date 2020.01.12
	 */

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		NormalAccount ki =new NormalAccount( 11,1000);
		NormalAccount ki1 =new NormalAccount(22);
		MinusAccount ki2 =new  MinusAccount(33,1000,500);
		MinusAccount ki3 =new MinusAccount(44,500);
		System.out.println("최대의 출금액 : ");
		System.out.println(ki.getBalance());
		System.out.println("최대의 출금액 : ");
		System.out.println(ki1.getBalance());
		System.out.println("최대의 출금액 : ");
		System.out.println(ki2.getBalance()+ki2.getLoan());
		System.out.println("최대의 출금액 : ");
		System.out.println(ki.getBalance()+ki3.getLoan());
		//(3) 사용자로부터 출금액 입력받아 4개 계좌에서 각각 출금 수행
		System.out.println("출금액 입력 : ");
		int amount =sc.nextInt();
		ki.withdraw(amount);
		ki1.withdraw(amount);
		ki2.withdraw(amount);
		ki3.withdraw(amount);
		System.out.println(ki.getBalance());
		System.out.println(ki1.getBalance());
		System.out.println(ki2.getBalance());
		System.out.println(ki3.getBalance());
		//(4) 사용자로부터 입금액 입력받아 4개 계좌에 각각 입금 수행
		System.out.println("입금액 입력: ");
		int amount1 =sc.nextInt();
		ki.deposit(amount1);
		ki1.deposit(amount1);
		ki2.deposit(amount1);
		ki3.deposit(amount1);
		System.out.println(ki.getBalance());
		System.out.println(ki1.getBalance());
		System.out.println(ki2.getBalance());
		System.out.println(ki3.getBalance());
		//(5) 4개 계좌의 최대 출금 가능액 각각 출력
		System.out.println("최대의 출금액 : ");
		System.out.println(ki.getBalance());
		System.out.println("최대의 출금액 : ");
		System.out.println(ki1.getBalance());
		System.out.println("최대의 출금액 : ");
		System.out.println(ki2.getBalance()+ki2.getLoan());
		System.out.println("최대의 출금액 : ");
		System.out.println(ki.getBalance()+ki3.getLoan());
	}

}
