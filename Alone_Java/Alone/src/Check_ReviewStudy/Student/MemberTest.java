package ki.Student;

public class MemberTest {

	public static void main(String[] args) {
		Member[] m= new Member[4];
		m[0]=new HourlyMember(22, 2);
		m[1] =new HourlyMember(33,3);
		m[2]=new RegularMember(44);
		m[3]=new RegularMember(55);
		
		double sum=0.0;
		for(int i=0; i<m.length;i++) {	
			sum+=m[i].getAge();	
			System.out.println("회원의 평균의합 : "+sum/m.length);
		int sum1= 0;
		for(int i1=0; i1<m.length;i1++) {
			sum1+=m[i].getpayment();
			System.out.println("회원의 회비합 : "+sum1);
		}
		}

	}

}
