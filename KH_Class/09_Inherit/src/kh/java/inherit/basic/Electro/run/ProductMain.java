package kh.java.inherit.basic.Electro.run;

import kh.java.inherit.basic.Electro.Desktop;
import kh.java.inherit.basic.Electro.SmartPhone;
import kh.java.inherit.basic.Electro.TV;

public class ProductMain {

	public static void main(String[] args) {
		Desktop d =new Desktop("삼성","삼성대땅 ",500_000,"삼성 모니터 27인치","비싸네","ㅋ ");
		
		System.out.println(d.getDesktopInfo());
		
		SmartPhone s =new SmartPhone("애플","ios14",500_000,"비싸다 ","test"); 
			System.out.println(s.getSmartPhoneInfo());
	
		TV tv = new TV("LG","17인치 LG",100_000_000,"17인치","56채널 ",18);
		 System.out.println(tv.getTVInfo());
	}
}