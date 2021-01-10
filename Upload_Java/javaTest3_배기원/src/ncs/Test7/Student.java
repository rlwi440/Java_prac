package ncs.Test7;

public class Student extends Human {
	private String number;
	private String major;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, int age, int height, int weight,String number, String major) {
		super(name,age,height,weight);
		this.number = number;
		this.major = major;
	}

	@Override
	public String toString() {
		return  super.toString()+ this.number+",\t"+this.major;
	}

}
