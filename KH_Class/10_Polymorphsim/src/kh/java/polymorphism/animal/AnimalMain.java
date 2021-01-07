package kh.java.polymorphism.animal;

public class AnimalMain {

	public static void main(String[] args) {
		AnimalMain am =new AnimalMain();
//		am.test1();
//		am.test2();
//		am.test3();
//		am.test4();
//		am.test5();
//		am.test6();
//		am.test7();
		am.test8();
	}
	/**
	 * 인터페이스는 객체화 할수없다. 
	 * 인터페이스는 역시 부모타입으로 다형성으로 적용할수있다 .
	 */
	public void test8() {
		Runnable r1 =new Dog();
		Runnable r2 =new Cat();
		r1.run();
		r2.run();
		((Dog)r1).say();
		
		System.out.println(Runnable.legs);
		
		
		Bitable b1=new Dog();
		Bitable b2 =new Cat();
		b1.bite("멍멍~");
		Dog d1= (Dog)b1;
		d1.attack();
		d1.bite("멍멍~");
		System.out.println("-----------------");
		Animal a1 =d1;
		a1.attack();
		a1.say();
		System.out.println("-----------------");
		Eagle e1 =new Eagle();
		e1.attack();
		e1.fly("개굴개굴 날고싶어요 ");
		
		
			}
	/**
	 * 추상클래스 Animal 
	 */
	public void test7() {
//		Animal a = new Animal(); //Cannot instantiate the type Animal
		Animal a = new Cat();
		Animal b = new Dog();
		Animal c = new Pig();
		//추상클래스 Animal을 상속한 자식클래스는 
		//무조건 추상메소드 attack 구현을 보장받는다.
		a.attack();
		b.attack();
		c.attack();
	}
	/**
	 * 동적 바인딩
	 * 1. 상속&부모클래스의 메소드 오버라이딩 say 
	 * 2. 부모타입으로 해당 메소드 호출  ,해당 메소드 호출
	 * 자동으로 자식타입의 재작성한 메소드가 호출된다.
	 * 다운캐스팅 없이 자식메소드 사용가능 
	 * 정적 바인딩
	 * 동일한 타입의 메소드를 호출한다 . 
	 */
	public void test6() {
		Animal a1 =new Cat();
		Animal a2 =new Dog();
		
		a1.say();
		a2.say();
		//다형성을 이용한 attack
		Animal[] arr = new Animal[100];
		for(int i = 0; i < arr.length; i++) {
			if(i % 2 == 0)
				arr[i] = makeDog();
			else 
				arr[i] = makeCat();
		}
		for(Animal anm:arr)
			anm.attack();		//동적바인딩 자식클래스의 오버라이드한 메소드가호출된다
	}
	/**
	 * 리턴값을 다형성 이용해서 처리하기 
	 */
	public void test5() {
		Animal cat = makeCat();
		Animal dog = makeDog();
		
		Animal[] arr = new Animal[100];
		for(int i = 0; i < arr.length; i++) {
			if(i % 2 == 0)
				arr[i] = makeDog();
			else 
				arr[i] = makeCat();
		}
		
		for(Animal anm : arr)
			attack(anm);
		
	}
	
	public Dog makeDog() {
		return new Dog();
	}
	
	public Cat makeCat() {
		return new Cat();
	}
	/**
	 * 다형성의 활용
	 * 1.매개변수 의선언부
	 * 2.리턴값 처리 
	 * 매개변수 선언부에서 다형성 활용하기 
	 */
	public void test4() {
		Cat cat =new Cat();
		Dog dog =new Dog();
		
		attack(cat);
		attack(dog);
	}
	public void attack(Animal animal) {
		if(animal instanceof Cat){
	((Cat)animal).punch();	//instance 공부하기 
	}else if(animal instanceof Dog ) {
		((Dog)animal).say(); 
		}
	}
	/**
	 * 부모타입의 배열에 사용가능하다
	 *	
	 */
	public void test3() {
		Animal[]arr =new Animal[3];
		arr[0]= new Cat();		
		arr[1] =new Dog();
//		arr[2]= new Animal();
		arr[2] =new Cat();
		
		System.out.println(arr[0] instanceof Cat);//true
		System.out.println(arr[0] instanceof Dog);	//false
		System.out.println(arr[0] instanceof Animal);//true
		System.out.println(arr[0] instanceof Object);//true
		
		
		for(Animal anml: arr) {
			anml.say();
			//instanceof 해당타입의 객체인 경우 true 리턴 
			//true 가리턴된경우 , 해당 타입으로의 안전한 형변환 보장
			//Cat 객체인 경우
			if(anml instanceof Cat) {
			((Cat)anml).punch();
			}
			//Dog 객체인 경우 
			else if (anml instanceof Dog) {
			((Dog)anml).Kick();	
			}
		}	
	}
	/**
	 *  형변환 
	 *  - upcasting  부모타입으로 형변환 . 자동(암묵적) 형변환
	 *  -downcasting  자식타입으로 형변환. 수동(명시적) 형변환
	 */
	public void test2() {
		Animal animal =new Dog();		//upcasting 
		Dog dog = (Dog)animal;		//downcasting (수동 ) 명시적 형변환
		dog.Kick();
	}
	/**
	 *  자식객체를 부모타입의 참조변수에 제어 할수있다 .
	 *  단 자식클래스에 선언된 자원은 사용할수 없다 .
	 */
	public void test1() {
		Cat cat =new Cat();
		cat.say();
		cat.punch();
		
		
		Animal animal1 = cat; 
		System.out.println(cat == animal1);//주소값비교 true 
		animal1.say();
		//animal1.punch();	// 부모타입의 변수에 담으면 자식클래스에서 선언된 자원(필드,메소드)를 사용할수없다.
	
		
		
		Object obj1 =cat ;	
		//obj1.say();
		//animal1.punch();
		System.out.println(obj1.hashCode());
		System.out.println("------------------");
		//다시 자식타입의 변수에 담으면 
//		Animal animal2 = (Animal)obj1;
//		animal2.say();
		((Animal)obj1).say();		//우선순위 괄호 
//		Cat cat2 = (Cat)animal2;
//		cat2.punch();
		((Cat)obj1).punch();		//우선순위 괄호 공부
		
	}

}
