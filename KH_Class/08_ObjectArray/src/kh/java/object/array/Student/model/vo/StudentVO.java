package kh.java.object.array.Student.model.vo;

public class StudentVO {
	private int no;
	private String name;
	private String phone;
	
	public StudentVO() {		//기본생성자
		
	}
	
	public StudentVO(int no, String name, String phone) {
		this.no=no;
		this.name= name;
		this.phone=phone;
}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
		
}
