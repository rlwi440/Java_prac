package kh.java.oop.access.modifier.field.run;
import kh.java.oop.access.modifier.field.*;
public class kiwiRun {
	public static void main(String[]args) {
		kiwi kw =new kiwi();
		System.out.println(kw.publicNum);
//		System.out.println(kw.protectedNum);// 자식클래스 인 경우는 ok 
//		System.out.println(kw.dafautNum);
		
	}

}
