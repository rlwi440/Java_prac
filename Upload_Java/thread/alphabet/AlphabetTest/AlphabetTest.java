package com.thread.alphabet.AlphabetTest;

/**
 *
 * <문제 2> - 실행용 클래스 : com.thread.alphabet.AlphabetTest.java - 쓰레드 클래스 :
 * com.thread.alphabet.UpperAlphbetThread.java
 * com.thread.alphabet.LowerAlphbetThread.java 두개의 멀티쓰레드를 만들고, 각각 알파벳대문자, 알파벳
 * 소문자를 출력하세요.
 * @author 깔끔한청년
 * @Date 2021.01.06
 */

public class AlphabetTest {
	public static void main(String[] args) {
		AlphabetTest t =new AlphabetTest();	//선언해주기 
		t.test0();
		t.test1();

	}
	
private void test0() {
	Thread th1 =new UpperAlphbetThread(); // 생성자 생성
	th1.start();
}
private void test1() {
	Thread th2 =new LowerAlphbetThread();
	th2.start();
}
	
}

