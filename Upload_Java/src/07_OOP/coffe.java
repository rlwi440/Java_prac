package com.oop.coffe.dto.Coffe;

public class Coffe {
	/**
	 * @author 깔끔한 청년
	 * @Date 2020.12.22 Coffee 멤버변수 원산지 origin, 지역 location 기본생성자, 모든필드초기화생성자
	 *       getter, setter 출력메소드 ()
	 */
	
	String origin = "";
	   
	   String location = "";
	   
	   String[] Coffee = new String[3];
	   
	   public Coffe() {
	      
	   }
	   
	   public Coffe(String origin, String location) {
	      this.origin = origin;
	      this.location = location;
	   }

	   public String getOrigin() {
	      return origin;
	   }

	   public void setOrigin(String origin) {
	      this.origin = origin;
	   }

	   public String getLocation() {
	      return location;
	   }

	   public void setLocation(String location) {
	      this.location = location;
	   }

	   public String[] getCoffee() {
	      return Coffee;
	   }

	   public void setCoffee(String[] coffee) {
	      Coffee = coffee;
	   }
	   
	   
	   public void printScan() { 
	      System.out.println(getOrigin()+"    " +getLocation() );
	   }
	}
		 
	 
	
	
	

