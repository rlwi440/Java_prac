package kh.java.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import kh.java.collection.set.Person;

public class HashMapTest {
	/**
	 * Map Key ,value 한쌍으로 요소를 구성한다. key를 통해서 value 접근해 사용 key는 허용하지 않는다 . 나중 Value로
	 * 치환된다.
	 * 
	 * 동일한 key로 추가저장하면 ,나중 Value로 치환된다.
	 * 
	 */

	public static void main(String[] args) {
		HashMapTest h = new HashMapTest();
		h.test1();
		h.test2();

	}

	/**
	 * 전체요소 열람하기 1.key 값을 set에 담아 2.key ,Value 한쌍을 set에 담기
	 * 전체요소 2가지 1.key set ,Entry set
	 */
	private void test2() {
		Map<String, Person> map = new HashMap<>();
		map.put("honggd", new Person("투투"));
		map.put("my", new Person("나는"));
		map.put("sinsa", new Person("신사"));
		map.put("you", new Person("너"));

		// 1 .Keyset
		Set<String> keyset = map.keySet();
		Iterator<String> iter = keyset.iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			Person value = map.get(key);
			System.out.printf("key = %s, value = %s%n", key, value);
		}
		// keyset+forEach
		for (String key : keyset) {
			Person value = map.get(key);
			System.out.printf("key = %s, value = %s%n", key, value);
		}
		// 2. Map.Entry(key,value한쌍) Set
		Set<Entry<String, Person>> entrySet = map.entrySet();
		// entrtSet+forEach
		for (Entry<String, Person> entry : entrySet) {
			Person Value = entry.getValue();
			System.out.printf("key = %s, value = %s%n", keyset, Value);
		}
		Iterator<Entry<String, Person>> iter1 = entrySet.iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			Person value = map.get(key);
			System.out.printf("key = %s, value = %s%n", key, value);
		}

	}
	private void test1() {
		//<k,V>두개의 제네릭을 사용
		//key 로 Integer 만 허용
		//value String만 허용 
		HashMap<Integer ,String>map1 =new HashMap<>();
		// Character 클래스는 기본 데이터 타입의 값을 객체 형식으로 표현하기 위해 사용된다
		Map<Character,Person>map2 =new HashMap<>();
		//요소추가 put 
		map1.put(1, "투투왕자");
		map1.put(2, "신사임당");
		map1.put(3, "세종대왕");
		//요소 가져오기  map1.get(1) 체크 
		String s1 =map1.get(1);
		System.out.println(s1);
		//동일한 키값으로 요소추가  동일한 key로 추가저장하면 ,나중 Value로 치환된다.
		map1.put(2,"장영실");
		//map2에 요소추가 
		map2.put ('a',new Person("Aida"));
		map2.put ('b',new Person("Bob"));
		map2.put ('c',new Person("clain"));
		map2.put ('d',new Person("David"));
		//equals& hashcode overriding 전제로 한다. 
		//특정 key가 존재하는가?  키 containsKey
		System.out.println(map2.containsKey('b')); //char -> new Character
		System.out.println(map2.containsKey('x')); //char -> new Character
		//특정 Value 가 존재하는가?!  Value containsValue
		System.out.println(map2.containsValue(new Person("David")));
		
		Person p1 =map2.get('b');
		System.out.println(p1+ ","+p1.hashCode());
		map2.put('b',new Person("Bill"));
		Person p2=map2.get('b');
		System.out.println(p2+ ","+p2.hashCode());
		map2.put('b',new Person("clain"));
		Person p3=map2.get('c');
		System.out.println(p3+ ","+p3.hashCode());
		
		
		
		System.out.println(map1);
	}

}
