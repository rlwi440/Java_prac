package kh.java.inherit.shape;

/**
 *  Circle has a point :has a 포함관계 연관관계
 *  Circle ────>Point
 * 
 * Circle is a Shape : is a 상속관계 (일반화 관계)
 * Circle ────────────── ▷ Shape
 *
 */
public class Circle  extends Shape{

	private Point center;
	private int r;
	
	
	public Circle() {
		this.center=new Point(100,100);
		this.r=100;
	}
	
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public Circle(Point center, int r) {
		super();
		this.center = center;
		this.r = r;
	}
	public Circle(double area) {
		super(area);
		// TODO Auto-generated constructor stub
	}
	/**
	 * override 상속받은 메소드를 고쳐쓸수 있다 
	 * 1, 메소드명 ,파라미터 선언부,리턴타입 모두 동일해야한다.
	 * 	-@override  annotation   안전장치
	 * 2.접근제한자는 더 넓은범위로 수정이 가능
	 * -private(x)-default(x)-protected-public
	 * -private 메소드는 오버라이드 불가
	 * -default 메소드가 거의없음 
	 * 3.메소드가 던지는 예외클래스는 줄이거나 , 자식 클래스로 변경가능 
	 */
	@Override		//안전장치
		public void draw() {
			System.out.println("중심점이 " + center+ "이고,"
							 + "반지름이 " + r + "인 원을 그리고 있다.");
	}
}
