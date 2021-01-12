package ki.BankAccount;

public class NormalAccount extends  BankAccount{

	public NormalAccount(int id, int balance) {
		super(id, balance);
	}
	public NormalAccount(int id ) {
		this(id,0);
	}
	public void withdraw(int amount) { 
		if (getBalance()<amount) {
			System.out.println("출금이 불가합니다");
		}else {
				super.withdraw(amount);
			}
		}
	}
