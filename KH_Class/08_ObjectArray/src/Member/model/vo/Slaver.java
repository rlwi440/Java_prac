package Member.model.vo;

//giwon.point.MemberManager
public class Slaver extends MemberManager{
	
	double countPoint;
	
	public Slaver() {
		
	}
	
	public Slaver(String member, String grade, int point) {
		
		this.member = member;
		this.grade = grade;
		
		this.point = point;
		
		double point_data = point * 0.02;
		
		this.countPoint = point_data;
	}
	
}
