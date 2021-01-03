package com.io.test4.model.vo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Book {		// Field 작성 
	private String  title;
	private String author;
	private int price;
	private Calendar date;
	private double discountRate;
	public Book(String string, String string2, int i, double d) {		
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String title, String author, int price, Calendar date, double discountRate) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.date = date;
		this.discountRate = discountRate;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Calendar getDate() {
		return date;
	}
	public void setDate(Calendar date) {
		this.date = date;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	@Override
	public String toString() {
		Date dates =new Date(date.getTimeInMillis()); // 함수를 이용하여 반환 
		SimpleDateFormat format =new SimpleDateFormat("yyyy년 MM월 dd일 출간");
		return "Book [title=" + title + ", author=" + author + ", price=" + price + ", date=" + date + ", discountRate="
				+ discountRate + "]";
		}
	}

