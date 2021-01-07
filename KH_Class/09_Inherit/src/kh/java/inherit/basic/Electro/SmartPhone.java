package kh.java.inherit.basic.Electro;


public class SmartPhone extends Product {
	
	  private String carrier;
	   private String os;
	   

		public SmartPhone() {
		
		}
	    
	   public SmartPhone(String brand,String productName,int price ,String os,String carrier) 
		{
		   // 부모생성자 호출
		   super(brand,productName,price);
		   this.os=os;
		   this.carrier=carrier;
	   }

	public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	public String getos() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	
	public String getSmartPhoneInfo() {
	        return getBrand() + ", " +getProductName()+ ","+ getPrice()+","
					+getos()+","+getCarrier();
		}
}