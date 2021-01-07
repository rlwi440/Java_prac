package kh.java.inherit.basic.Electro;

public class Desktop extends Product {
	private String OS;
	private String monitor;
	private String keyboard;
	
	public  Desktop() {
	}		//기본생성
	/**
	 * brand,productName,price,os, monitor,keyboard
	 *  Desktop d =new Desktop
	 * 
	 */
	public  Desktop(String brand, String  productName,int price,String keyboard, String monitor,String OS) {
		this.keyboard=keyboard;
		this.monitor=monitor;		//private는 직접접근불가.
		this.OS=OS;
		//상속받은 public 메소드는 현재객체 소속인것처럼 사용가능 
		setBrand(brand);
		setProductName(productName);
		setPrice(price);
		
	}
	public String getOS() {
		return OS;
	}
	public void setOS(String oS) {
		OS = oS;
	}
	public String getMonitor() {
		return monitor;
	}
	public void setMonitor(String monitor) {
		this.monitor = monitor;
	}
	public String getKeyboard() {
		return keyboard;
	}
	public void setKeyboard(String keyboard) {
		this.keyboard = keyboard;
	}
	public String getDesktopInfo() {
		return getBrand() + ", " +getProductName()+ ","+ getPrice()+","
				+getOS()+","+getMonitor()+","+getKeyboard();
	}
}
