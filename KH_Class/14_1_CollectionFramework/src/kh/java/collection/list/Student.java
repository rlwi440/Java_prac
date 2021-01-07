package kh.java.collection.list;

import java.util.Objects;

public class Student implements Comparable<Student> {

	private int no;
	private String name;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + "]";
	}

	/**
	 * equals 에 사용한 필드를 똑같이 이용해서 hashcode를 생성할것
	 * 
	 */
	public int hashcode() { // Override
		return Objects.hash(no, name);
	}

	/**
	 * 필드값이 동일하면 true가 나올수있도록 재작성한다. no, name
	 * 
	 * equals &hashcode 는 동시에 오버라이딩 한다 . hashcode는 두 객체가 같은 객체인지 확인하는 Method입니다
	 * equals 결과가 true이면 , hashcode값이 동일해야한다.(동일한 객체처럼 작동할수있도록)
	 */
	@Override
	public boolean equals(Object o) {
		// Student 형변환전 타입검사
		if (!(o instanceof Student))
			return false;
		Student other = (Student) o;
		if (no != other.no) // 직접접근 가능하다 .
			return false;

		if (!name.equals(other.name)) // return value == ((Integer)obj).intValue();
										// 한번씩 참고
			return false;

		return true;
	}

	/**
	 * 기본정렬 :학번 오름차순 양수:자리유지 0 음수 :자리 바꿈
	 */
	@Override
	public int compareTo(Student other) {

		return this.no - other.no; // 순서가바뀐다
	}

}
