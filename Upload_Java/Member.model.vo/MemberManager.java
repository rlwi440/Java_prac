package Member.model.vo;

//giwon.point.Slaver
//giwon.point.Gold
public class MemberManager {
	
	   String member, grade;
	   double point;

	   Slaver[] slaver = new Slaver[10];
	   int slaverInt = 0;
	   
	   Gold[] gold = new Gold[10];
	   int goldInt = 0;
	   
	   public void silverInsert(Slaver slaver) {
			
		   this.slaver[this.slaverInt] = slaver;
		   this.slaverInt += 1;
		   
	   }
		
		public void goldInsert(Gold gold) {
			this.gold[this.goldInt] = gold;
			this.goldInt += 1;
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
		}
}
