package Member.model.vo;

public class VVip extends MemberManager {
	
	double countPoint;
	
	public	VVip(){
	}
	
	public VVip(String member,String grade, int point) {
		this.member =member;
		this.grade=grade;
		
		this.point= point;
		
		double point_data =point*0.15;	// 15%곱한갑 추가 
		
		this.countPoint=point_data;
	}
}
