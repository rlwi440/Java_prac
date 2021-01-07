package kh.java.polymorphism.animal;

public class Eagle extends Animal implements Bitable{
	@Override
	public void attack() {
	System.out.println("개굴개굴");
		
	}
	public void fly(String sound) {
		System.out.println("개굴개굴"+sound);
	}
	@Override
	public void bite(String sound) {
		// TODO Auto-generated method stub
		
	}
}
