package kh.java.inner.class_;

public class Main {

	public static void main(String[] args) {
	new OutreClass();
	OutreClass outer = new OutreClass();
	OutreClass.A a = outer.new A();//멤버 내부클래스
	a.aaa();
	
	OutreClass.B b = new OutreClass.B();//static 내부클래스
	b.bbb();
	
	//지역내부클래스는 외부에서 절대 접근할 수 없다.
	outer.test();
	
}

}