package ki.Alone.BankAccount;

public class Employee {
	private  int salary;
	private int getTax;
	public Employee(int salary ) {
		super();
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getGetTax() {
		return salary/10 ;	//   getTax - 세금액(봉급의 10%)을 리턴
	}
	
	
}

