package com.oop.body.model;

public class Arm extends Body {
	public void armSwing() {
		System.out.println("팔을 뻗습니다.");
	}
	public Arm() {
		
	}
	@Override 
	public void action() {
		armSwing();
	}
}
