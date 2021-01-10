package ncs.Test10;

public class Sales extends Employee implements Bonus{
	

	public Sales() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
		
	}

	@Override
	public double tax() {
		return this.getSalary()*0.13;	//salary에 13% 적용한다.
		}
	public void incentive(int pay) {
		setSalary((int)(getSalary()*1.1));
		//인센티브 지급, pay의 120%  기존 salary에 더해진다.
	}

}
