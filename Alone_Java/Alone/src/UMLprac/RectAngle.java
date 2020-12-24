package com.kh.test.shpe.model.vo;

public class RectAngle {
	int width; int height;
	public RectAngle(){
		
	}
	public RectAngle(int Width, int height) {
		this.width= Width;
		this.height=height;	
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void draw() {
		System.out.println("가로"+width+"cm,세로  "+ height + "cm인 사각형을그립니다.");
		
		}
	}
	
