package ki.Student;

public abstract class Member {
	private int age;

	public int getAge() {
		return age;
	}
//   getPayment() - 회비를 조회하는 메소드(매개변수는 없고, int형을 리턴하는 abstract method)
	public abstract int getpayment();
	public Member(int age) {
		super();
		this.age = age;
	}
	
}
