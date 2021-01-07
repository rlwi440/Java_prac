package kh.java.thread;

public class ThreadBasicTest {
	/**
	 * 프로세스
	 * 
	 * 운영체제에서는 실행중인 하나의 어플리케이션을 프로세스라고 함.
	 * 
	 * 운영체제로부터 실행에 필요한 메모리를 할당받아 어플리케이션의 코드를 실행.
	 * 
	 * 
	 * 
	 * 스레드
	 * 
	 * 프로세스를 이루는 코드의 실행흐름.
	 * 
	 * 하나의 스레드는 하나의 코드 실행흐름임.
	 * 
	 * 
	 * 
	 * 멀티 프로세스
	 * 
	 * 서로 독립적. 하나의 프로세스에서 오류가 발생하더라도 다른 프로세스에 영향을 미치지 않음.
	 * 
	 * 
	 * 
	 * 멀티 스레드
	 * 
	 * 하나의 프로세스 내부에 존재하기 때문에 하나의 스레드가 예외를 던지면 프로세스 하나가 아예 동작하지 않을 수 있음 -> 예외 처리 중요.
	 * 
	 * 
	 * 
	 * 메인 스레드
	 * 
	 * 자바 어플리케이션은 메인스레드가 main 메소드를 실행하면서 시작함.
	 * 
	 */

	public static void main(String[] args) {
		ThreadBasicTest t =new ThreadBasicTest();
//		t.test0();
//		t.test1();
		t.test2();
		System.out.println("<메인 끝> ");
		
	}
	/**
	 * 싱글 스레드
	 */
	private void test0() {
		// A
		for (int i = 0; i < 100; i++) {
			System.out.println(' ');
		}
		// B
		for (int i = 0; i < 100; i++) {
			System.out.println('_');
		}
	}
	/**
	 * 쓰레드 생성방법
	 * 1.Thread 클래스 상속
	 * 
	 */
	private void test1() {	
		Thread th1 = new CustomThread1('|');
		Thread th2 = new CustomThread1('-');
		//우선순위 지정 (1~ 10 ) 기본값 5
		
		th2.setPriority(Thread.MAX_PRIORITY);	//10
		th1.setPriority(Thread.MIN_PRIORITY);	//1 
		th1.start();
		th2.start();
	}	
	private void test2() {
		Runnable run1 =new CustomThread2('|');
		Runnable run2 =new CustomThread1('_');
		 
		Thread th1 =new Thread(run1);
		Thread th2 =new Thread(run2);
		th1.start();
		th2.start();
	}


}