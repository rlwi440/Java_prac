package Account;

public class Accont {
	/*
	 * 고정 금리의 계좌를 생성 하여 현재 잔액을 기준으로 이자를 계산하는 프로그램을 작성 한다.사용 데이터
	 * 	Account(계좌번호): 441-0290-1203, balance(잔액): 500000원, interestRate(이율): 7.3%
	 */
	private String account="";
	private int balacne=0;
	private double interestRate=0;
	public Accont() {
		super();
	}
	public Accont(String account, int balacne, double interestRate) {
		super();
		this.account = account;
		this.balacne = balacne;
		this.interestRate = interestRate;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public int getBalacne() {
		return balacne;
	}
	public void setBalacne(int balacne) {
		this.balacne = balacne;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	//현재 잔액을 기준으로 이자를 계산 한다
	public double calculateInterest() {
		return balacne*(interestRate/100);
	}
	//입금
		public int deposit(int money) {
			balacne+=money;
			return balacne;
		}
		/**
		 * 3) Account class에 Account의 모든 정보를 출력 할 수 있는 accountInfo()를 만든다.
		           출력예: 계좌번호: 221-0101-2111 잔액: 100000원 이자율: 4.5%
		 */
		public void accountInfo() {
			System.out.printf("계좌번호 : %s 잔액 : %s 이자율 : %.1f %%" ,this.account ,this.balacne,this.interestRate);
		}
}
