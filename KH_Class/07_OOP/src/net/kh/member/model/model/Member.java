package net.kh.member.model.model;

public class Member {
		private String memberid;
		private String memberpwd;
		private String memberName;
		private String email;
		private String phone;
		private char gender;
		private int age;
		private boolean married; 
	
	public void setmemberid(String memberid) {
		this.memberid = memberid;
	}
	
	public void setmemberpwd(String memberpwd) {
		this.memberpwd = memberpwd;
	}
	
	public void setmemberName(String memberName) {
		this.memberName = memberName;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public void setphone(String phone) {
		this.phone = phone;
	}
	public void setgender(char gender) {
		this.gender = gender;
	}
	public void setage(int age) {
		this.age = age;
	}
	public void setmarried(boolean married) {
		this.married = married;
	}
	 public String getMemberID() {
	        return memberid;
	    }
	    public String getMemberPwd() {
	        return memberpwd;
	    }
	    public String getMemberName() {
	        return memberName;
	    }
	    public int getAge() {
	        return age;
	    }
	    public char getGender() {
	        return gender;
	    }
	    public String getPhone() {
	        return phone;
	    }
	    public String getEmail() {
	        return email;
	    }
	    /**
	     * boolean 타입의 필드 getter 는 is 로 시작한다 .
	     * @return
	     */
	    public boolean isMarried() {
	        return married;
	    }
	}

