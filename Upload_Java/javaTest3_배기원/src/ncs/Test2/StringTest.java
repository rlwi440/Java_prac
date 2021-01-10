package ncs.Test2;

public class StringTest {
/**
 * 	주어진 String 데이터를 “,”로 나누어 5개의 실수 데이터들을 꺼내어 합과 평균을 구한다.
	단, String 문자열의 모든 실수 데이터를 배열로 만들어 계산한다.
 * 	@author 깔끔한청년
 * 	@Date 2020/01/10
 */
	public static void main(String[] args) {
		String str ="1.22,4.12,5.93,8.71,9.34";
		double data[]= new double[5];		// 5개 객체 
		double sum=0;
		int count =0; 
		String[] st =str.split(",");	// 자르기 
		 for(String s: st) {
			 data[count]= Double.parseDouble(s);//문자열에서 
			 
		 }
		
	}
}
