package shape;

public class ShapeTest {
	public static void main(String[] args) {
		Shape shape[] = new Shape[6];
		// 6개의도형객체를배열에넣는다.
		shape[0] = new Triangle(7, 5, "Blue");
		shape[1] = new Rectangle(4, 6, "Blue");
		shape[2] = new Triangle(6, 7, "Red");
		shape[3] = new Rectangle(8, 3, "Red");
		shape[4] = new Triangle(9, 8, "White");
		shape[5] = new Rectangle(5, 7, "White");
	System.out.println("기 본 정 보\n");
	for(int i=0; i<shape.length;i++) {
		if(shape[i] instanceof Triangle)
			System.out.printf("%s","Triangle\t");
		if(shape[i] instanceof Rectangle)
			System.out.printf("%s","Rectangle\t");
		System.out.printf("%3.1f\t%s\n",shape[i].getArea(),shape[0].getColors());
	}
	// 모든 객체들을 for Loop문을 이용하여 setResize함수를 이용하여
	for(int i=0;i<shape.length;i++) {			//loop문 공부하기 
		if(shape[i] instanceof Triangle) {
			((Triangle)shape[i]).setResize(5);		//참조변수가 참조하고 있는 인스턴스의 실제 타입을 알아보기 위해 instanceof
		}
		else if(shape[i] instanceof Triangle) {		//else if 문 사용하기 
			((Rectangle)shape[i]).setResize(5);		
			}
		}
	System.out.println("\n사이즈 변경후 정보\n");
	for(int i=0; i<shape.length;i++) {
		if(shape[i] instanceof Triangle)
			System.out.printf("%s","Triangle\t");
		if(shape[i] instanceof Rectangle)
			System.out.printf("%s","Rectangle\t");
		System.out.printf("%3.1f\t%s\n",shape[i].getArea(),shape[0].getColors());
	}
}
}

	
