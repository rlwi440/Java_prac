package kh.java.collection.list;

import java.util.Collections;
import java.util.Comparator;

public class StudentNameAscending  implements Comparator<Student>{
	/**
	 * 이름 String 오름차순
	 * 문자열 오름차순
	 * Comparator<Student> comp = new StudentNameAscending();
		Collections.sort(list, comp);
	 *  생성해준뒤  요렇게 작성하면된다 .  list 는 배열 
	 */
	@Override
	public int compare(Student s1,Student s2) {
		return s1.getName().compareTo(s2.getName());
		//2개의 두 문자열을 비교하고 int형 값을 반환하는 메소드 
	}

}
