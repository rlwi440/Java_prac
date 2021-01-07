package kh.java.thread;

import javax.swing.JOptionPane;

public class ThreadControlTest {

	public static void main(String[] args) {
	ThreadControlTest t =new ThreadControlTest();
//	t.test1();
//	t.test2();
//	t.test3();
//	t.test4();
	t.test5();
	System.out.println("["+Thread.currentThread().getName()+"종료]");

	}

	private void test1() {
		Thread a =new Thread(new SleepThread('|',500));
		Thread b =new Thread(new SleepThread('-',500));
		
		a.start();
		b.start();
	}
	/**
	 * 3의배수출력 매서드 와 
	 * 4의 배수출력쓰레드 를 생성하고 실행하세요 
	 * [Thread 이름- 배수]
	 */
	private void test2() {
		Thread	a =new Thread(new numThread (3,200));	//3배수 200초 
		Thread b =new Thread(new numThread (4,200));	//4배수 200초 
		a.setName("3배수 쓰레드");
		b.setName("4배수 쓰레드");
		
		a.start();
		b.start();
		
	}
	
	private void test3() {
		Thread  c=new Thread(new testThread(6,200));	 //6배수 200초
	//	testThread 생성하는 클래스 
		c.setName("6배수 쓰레드 ");		//set 세팅용 
		c.start();	//시작 
	}
	/**
	 * 쓰레드간의  종속관계
	 * 일반 쓰레드 -Demon 쓰레드
	 * Demon- linux 계열의 컴퓨터에서 백그라운드 프로세스 를 가리키는말
	 */
	private void test4() {
			Thread cnt = new CountDown(50);
			cnt.setDaemon(true);//종속 관계 
			cnt.start();
			
			//main thread 일시 정지
			JOptionPane.showMessageDialog(null, "나는야 툴툴대마왕 너무빠르네 정말");
			
		}
	/**
	 * 쓰레드 종료시키기 
	 * 해당 쓰레드의 interrupt() 메소드 를 호출
	 * 2.interruptexception 발생
	 * 3. catch 절 다음액션(종료) 작성 
	 */
	private void test5() {
		Thread cnt = new CountDown(100);
		cnt.start();
		JOptionPane.showMessageDialog(null, "사장님너무, 빨라여 아휴 ..답답하다,나는야 툴툴대마왕");
		cnt.interrupt();
		
		
	}
}