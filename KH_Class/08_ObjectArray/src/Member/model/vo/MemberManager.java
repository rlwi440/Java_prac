package Member.model.vo;

//giwon.point.Slaver
//giwon.point.Gold

/*protected로 지정하면 자식 클래스에서 직접 접근 가능하다.
 * private - default -protected - public 
 * Member 의 자식클래스 ,GOld Silver Vip VVip에서는 직접 접근할수있다.
 * 커스텀 클래스를 상속하는경우에는 Protected 지정가능하지만,
 * jdk 가 제공한은 어떤 캡슐화를 상속한다면,protected 로 변경할수없다.
 * ->super생성자를 통해 값세팅 &getter setter 이용 
 * 
 */
public class MemberManager {
	   String member, grade;
	   double point;

	   Slaver[] slaver = new Slaver[10];
	   int slaverInt = 0;
	   
	   Gold[] gold = new Gold[10];
	   int goldInt = 0;
	   
	   Vip[] vip  =new  Vip[5];
	   int VipInt =0;
	   
	   VVip[]vvip =new VVip[5];
	   int VVipInt=0;
	   
	   public void silverInsert(Slaver slaver) {
			
		   this.slaver[this.slaverInt] = slaver;
		   this.slaverInt += 1;
	   }
		public void goldInsert(Gold gold) {
			this.gold[this.goldInt] = gold;
			this.goldInt += 1;
		}
		public void VipInsert(Vip vip) {
			this.vip[this.VipInt] =vip;
			this.VipInt+=1;
		}
		public void VVipInsert(VVip vvip) {
			this.vvip[this.VVipInt] =vvip;
			this.VVipInt+=1;
		}
		
		
		
		public void printData() {
			
			for(int i=0; i<this.slaverInt; i++) {
				System.out.println(this.slaver[i].member);
				System.out.println(this.slaver[i].grade);
				System.out.println(this.slaver[i].point);
				System.out.println(this.slaver[i].countPoint);
			}
			
			for(int i=0; i<this.goldInt; i++) {
				System.out.println(this.gold[i].member);
				System.out.println(this.gold[i].grade);
				System.out.println(this.gold[i].point);
				System.out.println(this.gold[i].countPoint);
			}
			
			for(int j=0; j<this.VipInt; j++) {
				System.out.println(this.vip[j].member);
				System.out.println(this.vip[j].grade);
				System.out.println(this.vip[j].point);
				System.out.println(this.vip[j].member);
			}
			for(int k=0; k<this.VVipInt; k++) {
				System.out.println(this.vvip[k].member);
				System.out.println(this.vvip[k].grade);
				System.out.println(this.vvip[k].point);
				System.out.println(this.vvip[k].member);
				}
			}
		}



//package member.controller;
//
//import member.model.vo.Gold;
//import member.model.vo.Silver;
//import member.model.vo.VVip;
//import member.model.vo.Vip;
//
//public class MemberManager {
//
//	public static final int MAX_MEMBER_COUNT = 10;
//	
//	Silver[] s= new Silver[MAX_MEMBER_COUNT];
//	Gold[] g = new Gold[MAX_MEMBER_COUNT];
//	Vip[] v = new Vip[MAX_MEMBER_COUNT];
//	VVip[] vv = new VVip[MAX_MEMBER_COUNT];
//	
//	int silverIndex = 0;
//	int goldIndex = 0;
//	int vipIndex = 0;
//	int vvipIndex = 0;
//	
//	
//	public void silverInsert(Silver s) {
//		this.s[silverIndex++] = s;
//	}
//	public void goldInsert(Gold g) {
//		this.g[goldIndex++] = g;
//	}
//	public void vipInsert(Vip v){
//		this.v[vipIndex++] =  v;
//	}
//	public void vvipInsert(VVip vv){
//		this.vv[vvipIndex++] =  vv;
//	}
//	
//	public void printData() {
//		System.out.println("----------------------------------------<<회원정보>>-----------------------------------------");
//		System.out.printf("%-15s %-15s %-15s %-15s\n", "이름","등급","포인트","이자포인트");
//		System.out.println("------------------------------------------------------------------------------------------------");
//		for(int i=0; i<silverIndex;i++) {
//			System.out.printf("%-15s %-15s %-15d %-15.2f\n", s[i].getName(), s[i].getGrade(), s[i].getPoint(), s[i].getEjapoint());			
//		}
//		for(int i=0; i<goldIndex;i++) {
//			System.out.printf("%-15s %-15s %-15d %-15.2f\n", g[i].getName(), g[i].getGrade(), g[i].getPoint(), g[i].getEjapoint());
//		}
//		for(int i=0; i<vipIndex; i++){
//			System.out.printf("%-15s %-15s %-15d %-15.2f\n", v[i].getName(), v[i].getGrade(), v[i].getPoint(), v[i].getEjapoint());
//		}
//		for(int i=0; i<vvipIndex; i++){
//			System.out.printf("%-15s %-15s %-15d %-15.2f\n", vv[i].getName(), vv[i].getGrade(), vv[i].getPoint(), vv[i].getEjapoint());
//		}
//	}
//}
