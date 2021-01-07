package kh.java.inherit.shape;


public class Rectangle extends Shape {
	 private Point[] point =new Point [4];
	 private int width;
	 private int height;
public Rectangle(){	
}


public Rectangle(Point[] point, int width, int height) {
	super();
	this.point = point;
	this.width = width;
	this.height = height;
}


public Point[] getPoint() {
	return point;
}


public void setPoint(Point[] point) {
	this.point = point;
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
@Override
public void draw() {
	System.out.println("네 꼭지점이 ");
	for(int i=0; i<point.length;i++) {
		System.out.println(point[i].toString());
		System.out.println(i!=point.length-1 ?"," :"");
	}
	System.out.println("이고,너비가 "+width+"높이가"+height+"인 사각형을 그린다.");
	}
@Override
public String toString() {
	String num ="point=";
	for(int i=0; i<point.length; i++) {
		num+=point[i].toString();
		num+=i!=point.length-1 ? "," : "";
	}
	num+= ",width=" +width+",height= "+height;
	return num;
}


@Override
public double getArea() {

	return width*height;
}

}


