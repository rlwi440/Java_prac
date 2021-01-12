package kh.java.inner.class_;
/**
 * 내부 클래스 
 * 1.Static 내부클래스
 * 2.non-static 내부클래스 
 * 3.지역 내부 클래스 
 * 
 *목적 
 *-외부클래스 안에서만 사용할때 .
 *-외부클래스의 자원(private자원)에쉽게 접근 하기위해 
 */
public class OutreClass {
	private int num =100;
	private static int snum=99;
	
	public OutreClass() {
		new A().aaa();
		
		new B().bbb();
		
		test();
	}
	
	
	public class A{		//private 이여서 그렇다 내부/
		public void aaa() {
			System.out.println(num);
			System.out.println(snum);
		}
	}
	public static class B{
		public void bbb(){
//			System.out.println(num);	//non-static  자원접근불가 
			System.out.println(snum);
			
		}
	}
	/**
	 * 지역내부 클래스 는 지역변수와 마찬가지로 
	 * 접근제한자를 가질 수 없다 .
	 * 
	 */
	public void test() {
		class c{
			public void ccc(){
				System.out.println(num);
				System.out.println(snum);
			}
		}
			c  c=new c();
			c.ccc();
	}

}
