package ncs.Test9;

public class PlaneTest {
	/**
	 * Abstract 클래스에서 상속받은 두 개의 클래스를 구현하여 아래 5번 항목의 실행 결과가 나오도
		록 프로그램을 작성한다
	 * @author 깔끔한청년
	 * @Date 2020/01/10
	 */

	public static void main(String[] args) {
		Airplane a = new Airplane("L747", 1000);
		Cargoplane c = new Cargoplane("C40", 1000);
		System.out.println("plane\t fuelSize");
		System.out.println("----------------------");
		System.out.println(a.getPlaneName() + "\t"+a.getFuelSize());
		System.out.println(c.getPlaneName() +"\t"+ c.getFuelSize());
		System.out.println("100운항");
		a.flight(100);
		c.flight(100);
		System.out.println("plane\t fuelSize");
		System.out.println("----------------------");
		System.out.println(a.getPlaneName() +"\t"+ a.getFuelSize());
		System.out.println(c.getPlaneName() +"\t"+ c.getFuelSize());
		System.out.println("200쥬유");
		a.refuel(200);
		c.refuel(200);
		System.out.println("plane\t fuelSize");
		System.out.println("----------------------");
		System.out.println(a.getPlaneName() +"\t"+ a.getFuelSize());
		System.out.println(c.getPlaneName() + "\t"+c.getFuelSize());

	}

}
