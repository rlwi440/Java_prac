package Member.model.vo;
// giwon.point.MemberManager

public class RUN {
	
	public static void main(String[] args) {
		
	     /**
	       * 현실로 생각하면
	       * 상속 : 부모님 돈 -> 너 돈
	       * 상속을 하면 부모 꺼를 자식이 쓸 수 있어
	       * 
	       * 상속을 하면 자식 메서드로 호출을 해도 에러가 제외
	       * 왜냐면 부모가 곧 자식이니까
	       * 
	       * extend 
	       * class 옆에 사용
	       * 하나의 클래스만 사용이 가능해
	       * 가상 클래스  final 변수,  함수를 선언만 할 수 있어
	       * 
	       * implements 
	       * interface를 상속을 받을 떄 사용
	       * 다중 상속이 가능해
	       * interface를 상속받을 경우 오버라이딩 함수의 재정의가 가능하다.
	       * interface final 변수,  함수를 선언만 할 수 있어
	       */
		
		MemberManager member = new MemberManager();
		System.out.println("-------------<회원정보>-----------");
		member.silverInsert(new Slaver("홍길동", "Slaver", 1000));
		member.silverInsert(new Slaver("김말뚱 ", "Slaver", 2000));
		member.silverInsert(new Slaver("고길동", "Slaver", 3000));
		member.goldInsert(new Gold("김회장", "Gold", 1000));
		member.goldInsert(new Gold("이화장", "Gold", 2000));
		member.goldInsert(new Gold("오회장", "Gold", 3000));
		member.vipInsert(new Vip("깔끔한회장","Vip",10000));
		member.VVipInsert(new VVip("배회장","VVip",100000));
		
		member.printData();
		}
	}
