package exception;

public class AcoountTest {
	public static void main(String[] args) {
		int input=0;
		int output =0;
		
		Acoount account = new Acoount("441-0290-1203", 5000000, 7.3);
		System.out.println("계좌번호: "+account.getAccount()+
				"잔고  : "+account.getBalance()+"이자율 :"+
				account.getInterestRate());
	try {
		input =-10;// account 에 -10원 입금 – Exception 처리
		account.deposit(input);
		}catch(Exception e) {
			if(input<0) {
				System.out.println("입금금액이 0보다 적습니다");
			}
		}
	try {
		output= 600000;
		account.withdraw(output);
	}catch(Exception e) {
		if(account.getBalance()<0) {
			System.out.println("출금금액이 0보다적습니다");
		}else if(output>account.getBalance()) {
			System.out.println("출금금액이 현재 잔액보다 많습니다.");
		}
	}
	System.out.println("이자: "+account.calculateInterest());
	}
}
	