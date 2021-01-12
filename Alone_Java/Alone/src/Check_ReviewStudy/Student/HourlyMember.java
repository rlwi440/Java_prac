package ki.Student;

public class HourlyMember extends Member {
	public HourlyMember(int age,int hour) {
		super(age);
		this.hour=hour;
	}

	private int hour;
	
	public int getpayment() {
		return hour*100;
		
	}

}
