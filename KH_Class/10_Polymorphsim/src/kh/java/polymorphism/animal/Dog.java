package kh.java.polymorphism.animal;

public class Dog extends Animal implements Runnable,Bitable{
	public void Kick() {
		System.out.println("견 킥 날림!");
	}
	@Override 
	public void attack() {
		Kick();
	}
	@Override
	public void say() {
		System.out.println("안녕하세요,저는 미스터견입니다.");
	}
	
	@Override
	public void run() {
		System.out.println("껑충껑충 걷습니다");
	}
	@Override 
	public void bite(String sound) {
		System.out.println("미스터 견 "+sound);
	}
}
