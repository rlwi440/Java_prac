package Account;

public class AccountTest {
	/**
	 * 	 account 객체 생성
	 *   account 기본 정보 출력 
	 *   account 에 20000원 입금
	 *   account 변경 정보 출력 
	 *   이자 출력 – 현재 잔고를 기준으로 고객에게 줄 이자 금액을 출력 한다
	 */

	public static void main(String[] args) {
		Accont  account =new Accont("441-0290-1203", 500000,7.3);
		System.out.print(account.getAccount());
		System.out.print(" 현재잔액 : "+account.getBalacne());
		
		System.out.println();
		System.out.println("2000원 입금");
		account.deposit(2000);
		
		System.out.print(account.getAccount());
		System.out.println(" 현재잔액 : "+account.getBalacne());
		System.out.printf("이자 : %.1f",account.calculateInterest());
	}

}
