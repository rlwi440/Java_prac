package com.oop.body.model;

public class Leg  extends Body {
	public void run() {
		System.out.println("성큼성큼 뛰어갑니다");
	}
		public Leg() {
			
		}
		@Override 
		public void action() {
			run();
		}
	}
