package ki.BankAccount;

public class BankAccount {
	 protected int id; // 계좌번호
	 private int balance; // 잔액
	 
	 public BankAccount(int id, int balance) {
	  this.id = id;
	  this.balance = balance;
	 }
	 public BankAccount(int id) {
	  this(id, 0);
	 }
	 public int getBalance() { // 잔액조회
	  return balance;
	 }
	 public void deposit(int amount) { // 입금
	  System.out.println("계좌 " + id + ": " + amount + "원 입금");
	  balance += amount;
	 }
	 public void withdraw(int amount) { // 출금
	  System.out.println("계좌 " + id + ": " + amount + "원 출금");
	  balance -= amount;
	 }
}

