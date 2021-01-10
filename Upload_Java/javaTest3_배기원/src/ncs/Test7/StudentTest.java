package ncs.Test7;

public class StudentTest {
	/**
	 * Human 이라는 부모 클래스를 상속받은 Student 클래스를 이용하여 프로그램을 작성한다.
		3개의 Student 객체를 생성하여 배열에 셋팅한 후 각 객체의 모든 정보를 출력한다.
	 * @author 깔끔한청년
	 * @Date 2020/01/10
	 */

	public static void main(String[] args) {
		Student[] students = new Student[3];
		students[0]=new Student("홍길순",25,171,81,"201401","영어영문학");
		students[1]=new Student("한사랑",23,183,72,"201402","건축학");
		students[2]=new Student("홍길동",26,175,65,"201403","체육학");
		
		for(int i=0; i<students.length; i++) {
			System.out.println(students[i].toString());
		}

	}

}
