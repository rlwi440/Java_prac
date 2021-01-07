package kh.java.thread;

public class testThread implements Runnable {
 private int  count;
 private long millis;
	@Override
	public void run() {
		for(int i=1; i*count<=100; i++) {
			System.out.println("["+count+"배수 쓰레드 - "+(i*count)+"]");
			try {
				Thread.sleep(millis);
			}catch(InterruptedException e) {
				e.printStackTrace();
				
			}
		}
	}
	public testThread(int count, long millis) {
		//필드공간
		super();
		this.count = count;
		this.millis = millis;
		}
	}

