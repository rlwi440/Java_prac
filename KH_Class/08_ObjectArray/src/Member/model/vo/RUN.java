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
		
		member.silverInsert(new Slaver("김사장", "Slaver", 1000));
		member.silverInsert(new Slaver("박사장", "Slaver", 2000));
		member.silverInsert(new Slaver("황사장", "Slaver", 3000));
		member.goldInsert(new Gold("김사장", "Gold", 1000));
		member.goldInsert(new Gold("배사장", "Gold", 2000));
		member.goldInsert(new Gold("깔통사장", "Gold", 3000));
		member.VipInsert(new Vip("깔끔한청년","VIP", 1000000));
		member.VVipInsert(new VVip("깔끔한 회장","VVIP",10000000));
		member.printData();
		}
	}


/**
 * javascript의 this 
 * 
 * scope(x) -> 
 * window있는 변수를 가지고 오겠다.
 * 
 * event 제외 
 * 
 * var aaa = 'aaa';
 * 
 * function a(){
 *      var aaa = 'ttt';
 *      console.log(this.aaa);
 * }
 * 
 * console.log(aaa);
 */