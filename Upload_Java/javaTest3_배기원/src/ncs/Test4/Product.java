package ncs.Test4;

public class Product {
private String name;
private int price;
private int quantity;
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public Product(String name, int price, int quantity) {
	super();
	this.name = name;
	this.price = price;
	this.quantity = quantity;
}
public String information() {		//information 활용
	return "상풍명 : " +this.name+"\n"+
			"가격 : "+this.price+ "원 \n" +this.quantity+"개 ";
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
}
