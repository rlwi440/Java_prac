package kh.java.oop.method.Test;

public class Test {
	/**
	 * 다음 코드에서 각 출력문에 찍히게 될 값을 작성하고, 실제 코드로 작성후 확인하세요.
	 * @author 깔끔한청년
	 * @Date 2020.12.18
	 */

    int a = 100;
    static int s = 99;
	public static void main(String[] args) {
		Test t= new Test();
		t.test1();
        t.test2();
        Test t3 = new Test();
        t.test3(t3);
        System.out.println(t3.a);	//100
        t.test4(t);
            
    }

	public void test1() {
		int a = 1000;
		int s = 999;
		System.out.println(this.a);			// 100
		System.out.println(Test.s);		//99
	}

	public void test2() {
		Test t = new Test();
		t.a = 1000;
		System.out.println(a); //10
	}

	public void test3(Test t) {
		t.a = 10;
		this.a = 200;
		System.out.println(t.a); //10
	}

	public void test4(Test t) {
		t.a = 1000;
		System.out.println(this.a);//1000
	}

}