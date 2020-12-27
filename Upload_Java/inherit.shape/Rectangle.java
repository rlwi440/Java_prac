package kh.java.inherit.shape;

/**
 * 실습문제 shape 클래스를 상속받은Rectagle클래스를 작성하세요.
* points: Point[4]  0번지-leftTop, 1번지-rightTop, 2번지-rightBottom, 3번지-leftBottom 
* width : int
* height : int
생성자
* 기본생성자
* 파라미터생성자 : Point[] points, int width, int height
다음 메소드를 오버라이딩할 것.
* draw()메소드: 
* getArea()메소드
* toString()메소드
*   @author 깔끔한청년
*   @Date 2020.12.27 
* toString,draw,toString 복습공부!!! 
 */
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


