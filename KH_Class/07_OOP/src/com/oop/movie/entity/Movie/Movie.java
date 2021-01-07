package com.oop.movie.entity.Movie;

import javax.xml.ws.Response;

public class Movie {
	private  String MovieTitle;
	private  String director;
	private  String casting;
	private  Response  Calendar;
	

public Movie()	{//기본생성자
}
public Movie(String MovieTitle ,String director,String casting,Response dCalendar) {
this.MovieTitle =MovieTitle;	// 해당 클래스 선언후 사용 클래스 가 아닌 참조형 변
this.director =director;
this.casting=casting;
this.Calendar=Calendar;
}


	
 	String[]c =new String[5]; 
 	
public void printMovie(){
	System.out.println("MovieTitle"+"director"+"casting"+"Calendar");
}
public String getMovieTitle() {
	return MovieTitle;
}
public void setMovieTitle(String movieTitle) {
	MovieTitle = movieTitle;
}
public String getDirector() {
	return director;
}
public void setDirector(String director) {
	this.director = director;
}
public String getCasting() {
	return casting;
}
public void setCasting(String casting) {
	this.casting = casting;
}
public Response getCalendar() {
	return Calendar;
}
public void setCalendar(Response calendar) {
	Calendar = calendar;
}

}

