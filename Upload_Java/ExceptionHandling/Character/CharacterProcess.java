package com.exception.charcheck;

public class CharacterProcess {
	/**
	 * 개인적인 으로 해야할일 1.줄맞춤 정리 ,처음에 그리는과정 중요  공부할때 같이 써놓기
	 * 실행메소드 
	 * 클래스명:CharacterProces
	 * 기본생성자 메소드 전달된 문자열값에서 영문자가 몇개인지 카운트 해서 리턴 
	 * public int countAlpha(String s){}  생성
	 * @param s
	 * @return
	 * @throws Exception
	 * @author 깔끔한청년
	 * @Date 2020.12.31
	 */
	public int countAlpha(String s) throws Exception {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				throw new Exception("체크할 문자열 안에 공백 포함할 수 없습니다.");
			} else if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
				count++;
			}
		}
		return count;
	}
}