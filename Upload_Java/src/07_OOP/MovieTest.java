package com.oop.movie.entity.Movie;
import com.oop.movie.entity.*;

public class MovieTest {
	public static void main(String[] args) {
		String a= "매트릭스";
		String b= "매트릭스"+"조니뎁";
		String c= "매트릭스"+"조니벧"+"배기원3";
		String d= "매트릭스"+ "조니뎁 "+"배기원3"+"2020년 12월 20일 "; 
		Movie ki = new Movie();
		System.out.println(a);
		Movie ki2 = new Movie();
		System.out.println(b);
		Movie ki3 = new Movie();
		System.out.println(c);
		Movie ki4 = new Movie();
		System.out.println(d);
		for (int i = 0; i < 5; i++) {
			ki.c[0] = "배기원";
			ki.c[1] = "미소";
			ki.c[2] = "배기원3";
			if (ki.c[i] == null) {
				continue;
			}
			
		}
	}
}

//System.out.println(ki.c[i]="배기원 "+"미소"+"미소청년"+"깔끔한청년"+"바나나");	// 출연배우 5명 다시 공부하기 
//	ki2.printMovie();