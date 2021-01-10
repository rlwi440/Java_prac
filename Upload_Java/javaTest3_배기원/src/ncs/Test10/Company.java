package ncs.Test10;

public class Company {

	public static void main(String[] args) {
		Employee[] employees = new Employee[2];
		employees[0]=new Secreatary("Hilery",1,"secretary",800);
		employees[1]=new Secreatary("Clinten",2,"sales",1200);
		System.out.println("naem\t department \t salray");
		System.out.println("================================");
		for(int i=0; i<employees.length;i++) {
			System.out.println(employees[i].getName()+"\t"+employees[i].getDepartment()+"\t"+employees[i].getSalary());
		}
		System.out.println("===========================");
		System.out.println("인센티브 100 지급 ");
		((Secreatary) employees[0]).incentive(100);
		((Sales) employees[1]).incentive(100);		
		System.out.println("naem\t department \t salray\t tax");
		System.out.println("=====================================");
		for(int i=0; i<employees.length;i++) {
			System.out.println(employees[i].getName()+"\t"+employees[i].getDepartment()+"\t"+employees[i].getSalary()+employees[i].tax());
		}

	}

}
