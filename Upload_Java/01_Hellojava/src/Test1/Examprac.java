package com.kt.test.Test1;

public class Examprac {
    /**
     * @author 깔끔한청년
     * @date 20.12.07
     */
	public static void main(String[] args) {
        /**
         * @param boolean,char,long,double,float,String
         * @throws 각 자료형 별 변수로 만들고 초기화 논리형,문자열,문자,실수,정수형 
         */
		 Examprac p= new Examprac();
		 
		 p.prac01();
		 
	}
	public void prac01() {
		boolean bool;
		char ch;
		long L;
		double f;
		float d;
		String str ;
		
		
		bool =true;
		bool =false;
		bool=(5>2);
		
		L=(long)100_999999_99999999l;
		f= 567.890123;
		d=486.520d;
		ch='A';
		str= "Hello world";
		
		
		System.out.println("bool =" +bool);
		System.out.println("l =" +L+"억");
		System.out.println("d =" +d);
		System.out.println("f =" +f);
		System.out.println("ch =" +ch);
		System.out.println("str =" +str);		
	}
}
		 
	