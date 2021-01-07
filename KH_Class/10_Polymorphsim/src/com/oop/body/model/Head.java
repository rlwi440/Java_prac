package com.oop.body.model;

public class Head extends Body {			//자식클래스
	private String hairColor ; 		//접근제어자
	public void headbang() {
	System.out.println(hairColor+"색 머리를돌립니다.");	
	}
	public Head() {
	}
	public Head(String hairColor) {
		this.hairColor=hairColor;
	}
	public String getHairColor() {
		return hairColor;
	}
	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}
	@Override
	public void action() {
		headbang();
		
	}
}

