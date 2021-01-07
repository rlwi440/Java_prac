package kh.java.collection.set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Collection -set-Hashset
 * 중복을 허용하지 않는다  저장된 순서를 보장하지 않는다.
 * LinkedHashSet :중복을 허용하지 않는다 .저장된 순서유지
 * TreeSet : 중복을 허용하지 않는다 .오름차순 정렬지원
 * 어설픈 순서는 사용하지 않는다
 *  
 */
public class HashSetTest {
	public static void main(String[] args) {
		HashSetTest h=new HashSetTest();
//		h.test1();
//		h.test2();
//		h.test3();
//		h.test4();
		h.test5();

	}
	/**
	 * 로또숫자 출력하기
	 * 1~45사이의  중복없는 난수 6개 를 오름차순 정렬 
	 * 밥먹고 나서 한번더 복습해보기 
	 */
	public void test5() {
		Set<Integer>set =new TreeSet<>();	//Treeset 오름차순 정렬
		do {	//do 반복문
			int ran=((int)(Math.random()*45)+1);
			set.add(ran);	//저장할값 
			if(set.size()==6) 	//이해가 느렸던 부분 체크 Size 부분 에서 객체 에대한 갯수 이해 가 느렸다.
				break;
		}while(true);
		System.out.println(set);
	}
	/**
	 * LinkedHashSet
	 * TreeSet
	 */
	
	public void test4() {
		Set<Integer>set1 =new LinkedHashSet<>();
		set1.add(24);
		set1.add(35);
		set1.add(100);
		set1.add(1);
		System.out.println(set1);
		//오름차순 정렬 
		Set<Integer>set2 =new TreeSet<>(set1);//set1 가져오기
		System.out.println(set2);
	}
	/**
	 * 커스텀 클래스 중복처리 
	 *순서를 유지하지 않는 데이터 의 집합으로  데이터를중복허용 하지않는다 
	 */
	public void test3() {		//Hashset ->equals
		Set<Person> set =new HashSet<>();		//중복처리 
		set.add(new Person("홍길동"));
		set.add(new Person("신사임당"));
		
		set.add(new Person("홍길동"));
		
		System.out.println(set);
		
	}
	/**
	 * list- set :  중복제거 
	 * Set -list :  순서필요 (정렬)
	 */
	public void test2() {
		List<Integer> list = new ArrayList<>() ;
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		System.out.println(list);
		
		
	
		Set<Integer> set =new HashSet<Integer>(list);
		System.out.println(set);
		//list 변환 :내림차순 // reverseorder() ; 다시 공부하기 
		List<Integer> list1 =new ArrayList<Integer>(set);
		Collections.sort(list,Collections.reverseOrder());	
		//Collections데이터의 집합 요소 모르는것들은   주석처리 하기  
		//오래 걸렸던 부분 sort(정렬)(list,,Collections.reverseOrder(역순)); 
		System.out.println(list);
	}
	public void test1() {
		HashSet<Integer> set1 =new HashSet();
		Set<String>set2=new HashSet<>();
		Collection<Double> set3 =new HashSet<Double>();
		//요소추가 
		set2.add("안녕");
		set2.add("투투왕자");
		set2.add("개구리");
		set2.add("hi");
		//저장된 요소 개수 확인
		 System.out.println(set2.size());
		 //인덱스 통한 요소 가져오기는 지원하지 않는다
		 
		 //반복문을 통한 전체열람만 가능 
		 //일반 for문은 사용할수없다.
		 //1.ForEach문은 가능 
		 for(String s : set2) {
	            System.out.println(s);
	        }
	        //3.Iterator  컬렉션에 저장되어있는 요소을 읽어오는방법
	        Iterator<String> iterator = set2.iterator();
	        while(iterator.hasNext()) {
	            String s = iterator.next();
	            System.out.println(s);
	        }
	        //삭제  :동등한 객체를 찾아 삭제(equals & hashcode overriding필수 )
	        set2.remove("hi");
	        //전체삭제
	        set2.clear();
	        //비어 있는지 검사 
	       System.out.println(set2.isEmpty());		//비어 있는지 검사 isEmptyd
	        
		 System.out.println(set2);
		
				
	}

}
