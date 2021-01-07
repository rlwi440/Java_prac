package com.collection.map.member.MemberTest;

import com.collection.map.member.MemberTest.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import kh.java.collection.set.Person;

public class MemberTest {
	Map<String, Member> member = new HashMap<>();
	public static void main(String[] args) {
		MemberTest h =new MemberTest();
		h.test1();
		h.test1_1();
		h.test2();
		h.test3();
		h.test4();
	}

	public void test1() {
		member.put("honggd", new Member("honggd", "1234", "홍길동", 35, "01012341234"));
		member.put("sinsa", new Member(" sinsa	", "1234", "신사임당", 50, "01012341234"));
		member.put("leess", new Member("leess", "1234", "이순신", 43, "01012341234"));
		member.put("honggd", new Member("yooon", "1234", "윤봉길", 37, "01012341234"));
		member.put("jangbg", new Member("jangbg", "1234", "장보고 ", 29, "01012341234"));
	}
	//회원 Map은 필드로 지정하고, MemberTest member 사용 foreach문 사용 하였습니다 
	public void test1_1() {
		Set<String> keyset = member.keySet();
		Iterator<String> iter = keyset.iterator();
		for (String key : keyset) {
			Member value = member.get(key);
			System.out.printf("key = %s, value = %s%n", key, value);
		}
	}
	//Map에 저장된 회원중 인자로 전달한 아이디가 존재하는 여부를 검사하는 메소드를 생성하세요.
	public boolean isUserExist(String userId) {
		Set<Entry<String, Member>> entrySet = member.entrySet();
		for (Entry<String, Member> entry : entrySet) {
			Member Value = entry.getValue();	//entry 제네릭 왼쪽 Value 
			if(Value.getUserId().equals(userId)) // 아이디가 존재 하는 여부 
		return true;
		}
		return false;
	}
	//다음 두 아이디를 테스트하세요. 
	//jangbg : true 리턴
	//sejong : false 리턴
		public void test2() {
			System.out.println(isUserExist("jangbg"));
			System.out.println(isUserExist("sejong"));
		}
		// yooon 아이디 조회후 해당객체를 다음과 같이 수정하세요.
		public void test3() {
			String st = null;
			Set<Entry<String, Member>> entrySet = member.entrySet();
			for (Entry<String, Member> entry : entrySet) {
				if(entry.getValue().getUserId().equals("yooon")) {
					/**
					 * 비밀번호:5678
					 * 이름 :윤동주
					 * 나이 :27
					 * 전화번호 :01034563456
					 */
					st= entry.getKey();
					member.get(st).setUserPwd("5678");
					member.get(st).setUserName("윤동주");
					member.get(st).setAge(27);
					member.get(st).setPhoneNumber("01034563456");
					System.out.println(st);
				}	
			}	
	
		}
		//sinsa 아이디 회원을 삭제하세요.
		public void test4() {
			String st = null;
			Set<Entry<String, Member>> entrySet = member.entrySet();
			for (Entry<String, Member> entry : entrySet) {
				if(entry.getValue().getUserId().equals("sinsa")) {
					st= entry.getKey();
					member.remove(st);		//remove 삭제하기 
			}
		}
	}
}

