package kh.java.polymorphism.animal;

public class Pig extends Animal {
	@Override
	public void attack() {
	sound();
	}
public void sound() {
	System.out.println("돼지는 꿀꿀어렵다");
}
}
