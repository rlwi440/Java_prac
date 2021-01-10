package ncs.Test2;

public class StringTest {

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
