package kh.java.thread;

public class CustomThread2 implements Runnable {
private char ch;
public CustomThread2 (char ch) {
	this.ch=ch;
}
	@Override
	public void run() {
	for(int i=0; i<100; i++ )
		System.out.println(ch);
	System.out.print("<"+ ch+ "끝>");
	} 
}
