package ki.BankAccount;

public class MinusAccount extends BankAccount {
private int loan ;
	public MinusAccount(int id, int balance ,int loan) {
		super(id, balance);
		this.loan=loan;
		// TODO Auto-generated constructor stub
	}
	public MinusAccount(int id ,int loan) {
		this(id,loan,0);
	}
	public void withdraw(int amount) {
		if(getBalance()+getLoan()<amount) {
			System.out.println("출금이 불가합니다");
		}else {
			super.withdraw(amount);
		}
	}
	public int getLoan() {
		return loan;
	}
	
	

}
