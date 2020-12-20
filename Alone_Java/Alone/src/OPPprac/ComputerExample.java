package com.method.prac;
/**
 * @author 깔끔한청년
 * @Date 2020.12.20
 */

public class ComputerExample {
	public static void main(String[] args) {
		Computer  com =new Computer ();
	int [] values1 = {1,2,3};
	int result1= com.sum1(values1);
	System.out.println("result1 :" + result1);
	
	int result2= com.sum1(new int[] {1,2,3,4,5} );
	System.out.println("result2 :" + result2);

	int result3= com.sum2(1,2,3 );
	System.out.println("result3 :" + result3);
	
	int result4= com.sum2(1,2,3,4,5 );
	System.out.println("result4 :" + result4);
	
	int result5= com.sum1(new int[] {1,2,3,4,5,6,7,});
	System.out.println("result5 : "+ result5);
	
	int result6= com.sum2(1,2,3,4,5,6,7);
	System.out.println("result6 : "+ result6);

	}
}

