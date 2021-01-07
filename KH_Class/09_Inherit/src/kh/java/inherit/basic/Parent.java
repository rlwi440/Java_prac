package kh.java.inherit.basic;
/**
 *  상속 Inheritance 
 *  부모클래스가 가지고 있는 Member 변수/메소드를 자식 클래스 선언 하지 않고,
 *  사용할수 있게 하는것.
 *  - Public class 자식클래스 extends 부모클래스{}  확장하다.
 *   이점
 *   - 중복을 제거해서 효율적으로 관리할수있다 .
 *   - 공통적인 코드를 부모클래스에서 관리 할수있다 .
 *   
 *   특징 
 *   1.부모클래스의 필드 /메소드 자식 클래스에서 선언없이 접근 가능 
 *   2.모든 클래스의 최상위 부모클래스는 object 입니다  
 *   	- 아무 클래스도 상속하지 않았다면, extends object 가 생략된것
 *   	-Object 의 메서드 를 모든클래스에서 사용가능 , toString ,hascode,equals..
 *	 3.부모클래스의 메소드는 자식클래스는 재작성해서 사용할수있다 .
 *	 4.부모클래스의 private필드/메소드는 상속은 되지만, 직접접근을 할수가없다 
 *		getter/setter를 이용
 *		- 값대입시에 부모생성자 super를 호출해서 부모클래스안에서 값대입
*/

public class Parent extends Object {
	
	String name;
	int age;
	public Parent() {
		System.out.println("Parent 부모클래스 생성자 호출");
		}
		public void say() {
			System.out.println("제가  몰라..");
		}
		
		public void printInfo() {
			System.out.println(name + ", " + age);
		}
		
	}
