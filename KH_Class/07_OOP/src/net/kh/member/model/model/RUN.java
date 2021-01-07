package net.kh.member.model.model;

public class RUN {
/**
 * 
 * RUN ----->Member
 * 사용클래스 ----- > 피사용 클래스
 * 
 */
	public static void main(String[] args) {
		Member m = new Member();
		m.setmemberid("gogo");
		m.setmemberName("고길동");
		m.setmemberpwd("gogo1234");
		m.setage(22);
		m.setgender('남');
		m.setphone("01012341234");
		m.setemail("gogo@email.com");
		m.setmarried(true);
		String memberInfo = "아이디 : " + m.getMemberID()+"\n"
						  + "이름 : " 	+ m.getMemberName()+"\n"
						  + "이름 : " 	+ m.getMemberPwd()+"\n"
						  + "나이 : " 	+ m.getAge()+"\n"
						  + "성별 : " 	+ m.getGender()+"\n"
						  +"전화번호 : "+ m.getPhone()+"\n"
						  +"이메일 : " 	+ m.getEmail() + "\n"
						  + "결혼 여부 : " + m.isMarried();
		System.out.println(memberInfo);
	}
}
