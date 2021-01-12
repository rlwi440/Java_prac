package ki.Alone.BankAccount;

public class ManagerTest  {

	public static void main(String[] args) {
	Employee e =new Employee(1000);
		System.out.println("직원의 봉급은: ");
		e.getSalary(); 
		System.out.println("직원의 세금액은: ");
		e.getGetTax();
		Manager t =new Manager (1000,500);
		System.out.println("직원의 봉급은 :");
		t.getSalary();
		System.out.println("직원의 보너스 :");
		t.getBonus();
		System.out.println("직원의 세금액은 :");
		t.getTax();
	}

}
