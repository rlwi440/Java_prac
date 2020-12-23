package Member.model.vo;

public class Vip extends MemberManager  {
	double countPoint;
	
public  Vip() {
}
public Vip(String member, String grade, int point) {
	this.member=member;
	this.grade =grade;
	
	this.point=point;
	
	double point_data= point*0.1;	// vip 등급은 10%곱한값 추가 
	
	this.countPoint=point_data;
	}

}
