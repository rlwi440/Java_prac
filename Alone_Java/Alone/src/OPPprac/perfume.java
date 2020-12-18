package com.prac.test;

public class Perfume {
	/**
	 * 객체의 생성시 생성자  this() 메서드 연습
	 * @author 깔끔한청년
	 * @Date 2020.12.18 
	 */
	String  brand = "르라보";
	String  name;
	String Perfume;
	String evaluation;
	

	Perfume(){	// 생성자  
		
	}
	

	Perfume(String name){
	this.name=name;
	}
	Perfume(String name,String evaluation){
		this.name=name;
		this.evaluation=evaluation;
		}
	Perfume(String name,String Perfume,String evaluation){
		this.name=name;
		this.Perfume=Perfume;
		this.evaluation=evaluation;
		}
}
