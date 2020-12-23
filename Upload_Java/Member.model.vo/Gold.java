package Member.model.vo;

//giwon.point.MemberManager
public class Gold extends MemberManager{
		double countPoint;
		
		public Gold() {
		   
		}
	   
		public Gold(String member, String grade, int point) {
			
			this.member = member;
			this.grade = grade;
			
			this.point = point;
			
			double point_data = point * 0.05;
			
			this.countPoint = point_data;
		}
}
