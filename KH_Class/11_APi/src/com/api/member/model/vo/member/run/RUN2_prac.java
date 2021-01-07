package com.api.member.model.vo.member.run;

//import java.util.GregorianCalendar;
//import java.util.StringTokenizer;
//import com.api.member.model.vo.Member;
///**
//	다음과 같이 회원정보를 하나의 문자열로 담았다. 각회원별 정보의 순서는 회원번호,이름,키,몸무게,생일(yyyyMMdd)이다.
//	    "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319"
//	각각의 회원정보를 분리해서, 회원객체에 담고, 회원객체배열에 추가한다.
//	출력메소드를 통해 회원정보를 출력한다.
//	- 회원 com.api.member.model.vo.member
//	    - memberNo : int
//	    - memeberName : String
//	    - height : int
//	    - weight : int
//	    - birth : Calendar
//	    + information : String
//	- 실행클래스 com.api.member.run.Run 
// */
//public class RUN2_prac {
//	public static void main(String[] args) {
//		String str = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";
//		//1. | 기준으로 분리
//		StringTokenizer token = new StringTokenizer(str,"|");
//		//3. Member배열 선언
//		Member[] memberArr = new Member[token.countTokens()];
//		int i = 0;	//index변수
//		while(token.hasMoreTokens()){
//			//2. , 기준으로 분리
//			String memberStr =  token.nextToken();
//			String[] mStr = memberStr.split(",");
//			//2.1 분리한데이터를 Member에 담기
//			Member m = new Member();
//			//2.1.1 String타입은 그냥 대입
//			//2.1.2 int타입은 Integer.parseInt로 형변환
//			//2.1.3 Calendar타입은 19900905를 parsing해서 년월일 정보 얻은후 Calendar에 대입
//			m.setMemberNo(Integer.parseInt(mStr[0]));
//			m.setMemberName(mStr[1]);
//			m.setHeight(Integer.parseInt(mStr[2]));
//			m.setWeight(Integer.parseInt(mStr[3]));
//			int yyyy = Integer.parseInt(mStr[4].substring(0,4));
//			int mm = Integer.parseInt(mStr[4].substring(4,6));
//			int dd = Integer.parseInt(mStr[4].substring(6));
//			m.setBirth(new GregorianCalendar(yyyy,mm-1,dd));
//			//3.1 Member배열에 추가
//			memberArr[i++] = m;
//		}	
//		//3.2 Member정보 열람
//		for(Member m : memberArr) {
//			System.out.println(m.infromation());
//		}
//	}
//}