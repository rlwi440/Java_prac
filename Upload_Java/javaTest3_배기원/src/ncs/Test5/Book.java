package ncs.Test5;

public class Book {
	private String title;
	private String author;
	private String publisher;
	private int price;
	private double discountRate;
	public Book(String title, String author, String publisher, int price, double discountRate) {
		super();
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.discountRate = discountRate;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getPublisher() {
		return publisher;
	}
	public int getPrice() {
		return price;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	
}
