package kh.java.oop.filed;

public class Main {

	public static void main(String[] ars) {
		
		GalaxyNote20 ph1 = new GalaxyNote20();
		ph1.setOwner("배기원");
		ph1.setPhoneNumber("01012341234");
		System.out.println(ph1.getOwner() + " : " + ph1.getPhoneNumber());
		System.out.println(GalaxyNote20.WIDTH);
		
		
		GalaxyNote20 ph2 = new GalaxyNote20();
		ph2.setOwner("홍길동");
		ph2.setPhoneNumber("01088887777");
		System.out.println(ph2.getOwner() + " : " + ph2.getPhoneNumber());
		System.out.println(GalaxyNote20.WIDTH);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Math.PI);
	}
}
