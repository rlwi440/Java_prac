package kh.java.inherit.basic.Electro;

public class TV extends Product{
	private int size;
	private String  channel;

	public TV() {
	}

	public TV(String brand,String ProductName,int price, String Size, String channel,int size) {
		super(brand,ProductName,price);
		this.size=size;
		this.channel=channel;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getTVInfo() {
        return  getBrand()+","+ getProductName() +","+getPrice() +"," +getSize() +","+getChannel();
	}
}
	


