package com.prac.test;
public class perfumeExample {
	/**
	 * 생성자 오버로딩 연습
	 * perfume3개 객체 생성  
	 * @author 깔끔한청년
	 * @Date 2020.12.18 
	 */
	public static void main(String[]args) {
		Perfume LeLabo1 =new Perfume();
		System.out.println("LeLabo1.brand :"+LeLabo1.brand);
		System.out.println();
		
		Perfume LeLabo2 =new Perfume("상탈33","시크한 우드");
		System.out.println("LeLabo2.name :"+LeLabo2.name);
		System.out.println("LeLabo2.evaluation :" +LeLabo2.evaluation);
		System.out.println();
		
		Perfume LeLabo3 =new Perfume("어나더 13","르라보" ,"은은하다");
		System.out.println("LeLabo3.name :"+LeLabo3.name);
		System.out.println("LeLabo3.Perfume :" +LeLabo3.Perfume);
		System.out.println("LeLabo3.evaluation :" +LeLabo3.evaluation);
		System.out.println();
	}
}