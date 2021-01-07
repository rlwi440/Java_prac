package kh.java.thread;

public class SleepThread implements Runnable {
	private char ch; 
	private long mills;		// 필드 생성  
	
	public SleepThread(char ch, long mills) {
		this.ch=ch;
		this.mills=mills;
	}
	
	@Override
	public void run() {
	for(int i =0 ; i<100; i++) {
		System.out.println(ch);
		//현재 쓰레드를 TiMED -WATTING 상태로 변경 
		try {
			Thread.sleep(mills);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//쓰레드명
			System.out.println(Thread.currentThread().getName() + " 끝!");
	

	}

}
