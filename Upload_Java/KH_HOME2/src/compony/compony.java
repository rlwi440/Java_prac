package compony;

public class compony {

	double salary;
	double income;
	double afterTaxIncome;
	double bonus;
	double afterTaxBonus;
	
	public compony() {
		super();
	}
	public compony(double salary) {
		super();
		this.salary = salary;
		afterTaxIncome = 0.1;
		afterTaxBonus = 0.055;
		bonus = salary*0.2;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public double getAfterTaxIncome() {
		return afterTaxIncome;
	}
	public void setAfterTaxIncome(double afterTaxIncome) {
		this.afterTaxIncome = afterTaxIncome;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public double getAfterTaxBonus() {
		return afterTaxBonus;
	}
	public void setAfterTaxBonus(double afterTaxBonus) {
		this.afterTaxBonus = afterTaxBonus;
	}
}
