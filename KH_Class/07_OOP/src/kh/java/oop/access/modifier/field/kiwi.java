package kh.java.oop.access.modifier.field;
/**
 * field/method
 * 1.public 다른 패키지 | 다른 클래스
 * 2.protected  같은패키지 |다른 패키지라도 상속관계는 ok
 * 3.default(작성금지) 같은패키지 
 * 4.private  같은클래스 
 * 
 * 
 * 
 *
 */

public class kiwi {
	public int publicNum =100;
	protected int protectedNum=90;
	int dafautNum=80;
	private int privateNum =70; 

}
