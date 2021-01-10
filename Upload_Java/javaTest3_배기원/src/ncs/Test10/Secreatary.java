package ncs.Test10;

public class Secreatary extends Employee implements Bonus {

	public Secreatary() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Secreatary(String name, int number,String department, int salary) {
		super(name, number, department, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double tax() {
		// TODO Auto-generated method stub
		return getSalary()*0.1;
	}
	public void incentive(int pay) {
		this.setSalary((int)this.getSalary()+(pay+0.8));
	}

}
