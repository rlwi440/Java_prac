package com.api.member.model.vo.member.run;

import java.util.Calendar;
import java.util.StringTokenizer;
import com.api.member.model.vo.member.Member;

public class Run {
	/**
	 * 다음과 같이 회원정보를 하나의 문자열로 담았다. 각회원별 정보의 순서는 회원번호,이름,키,몸무게,생일(yyyyMMdd)이다.
	 * "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319"
	 * @author 깔끔한청년
	 * @Date 2020. 12.30
	 */
	public static void main(String[] args) {
		String str = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";
		String[] baeki = str.split("[|]"); 
		String[] temp; // 임시변수
		Member[] arr = new Member[baeki.length];
		for (int i = 0; i < arr.length; i++) {
			StringTokenizer ki = new StringTokenizer(baeki[i], ","); 
			temp = new String[5]; 
			int j = 0; 
			while (ki.hasMoreTokens()) { 
				temp[j] = ki.nextToken();
				j++;
			}
			Calendar cal = Calendar.getInstance();
			cal.set(Calendar.YEAR, Integer.parseInt(temp[4].substring(0, 4)));
			cal.set(Calendar.MONTH, Integer.parseInt(temp[4].substring(4, 6)) - 1); 
			cal.set(Calendar.DATE, Integer.parseInt(temp[4].substring(6))); 
			arr[i] = new Member(Integer.parseInt(temp[0]), temp[1], Integer.parseInt(temp[2]),
					Integer.parseInt(temp[3]), cal);//
		}
		for (Member k : arr) {
			System.out.println(k.information());
		}
	}
} 
