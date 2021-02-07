package School;

public class StudentTest {

	public static void main(String[] args) {
		double sumage=0; double sumheight=0; double sumweight=0;
		Student studentArray [] = new Student[3];
		studentArray[0]= new Student("홍길동",15,171,81);
		studentArray[1]= new Student("한사람",13,183,72);
		studentArray[2]= new Student("홍길동",16,175,65);
		System.out.println("이름\t나이\t신장\t몸무게\t");	
		for(int i=0;i<studentArray.length;i++) {
			System.out.println(studentArray[i].getName()+"  "+
		studentArray[i].getAge()+"  "+studentArray[i].getHeight()+"   "+studentArray[i].getWeight());
			sumage+=studentArray[i].getAge();
			sumheight+=studentArray[i].getHeight();
			sumweight+=studentArray[i].getWeight();
		}
		System.out.printf("나이의평균 : %.2f\n",sumage/studentArray.length);
		System.out.printf("신장의 평균:%.2f\n",sumheight/studentArray.length);
		System.out.printf("몸무게의평균: %.2f\n",sumweight/studentArray.length);
	}
}
