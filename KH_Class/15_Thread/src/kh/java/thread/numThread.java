package kh.java.thread;

public class numThread implements Runnable {
private int num ;
private long millis;


	@Override
public void run() {
    for(int i=1; i*num<=100; i++) {
        System.out.println("["+num+"배수 쓰레드 - "+(i*num)+"]");
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    System.out.println("["+num+"배수 쓰레드 - 끝]");
}


	public numThread(int num, long millis) {
		super();
		this.num = num;
		this.millis = millis;
	}

}
