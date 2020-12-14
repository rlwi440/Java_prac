package com.array.test;

import javax.swing.JOptionPane;

public class ArrayTest05 {

	public static void main(String[]args) { 
		ArrayTest05 ki =new ArrayTest05();
		ki. test();
		ki.test2();
		ki.test3();
	}
	public void test() {
		/**
		 * 배열안의 모든값을 더하고 , 총합과 평균 을 출력
		 * @author 깔끔한청년
		 * @Date 2020.12.14
		 */
		int [] arr = {10,20,30,40,50,60,3,-3};
		
		int sum=0;
		double avg =0.0;
		
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		avg=sum/arr.length;
		System.out.println("총합 :" +sum + "평균 : " +avg);
	}
	public void test2() {
		/**
		 * 배열의 인덱스 3인곳을 출력하지말고, 나머지만 출력 
		 */
		int[]arr = {10,20,30,50,3,60,-3};
		
		for(int i=0; i<arr.length; i++) {
			if(i==3) {
				continue;
			}
			System.out.println("arr[" + i + "]"+arr[i]);
			}
		}
	public void test3() {
		/**
		 * 국어 영어 수학 점수를 입력받는다
		 * 그학생의 총점과 평균 으르 출력한다.
		 */
		String name =JOptionPane.showInputDialog("이름은?!");
		int korScore = Integer.parseInt(JOptionPane.showInputDialog(name+"님의 국어점수는?!"));
		int engScore = Integer.parseInt(JOptionPane.showInputDialog(name+"영어점수는?!"));
		int  MathScore= Integer.parseInt(JOptionPane.showInputDialog(name+"님의 수학점수는?!"));
		int tot= korScore+engScore+MathScore;
		double avg =tot /3.0;
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.print(name+"\t"+korScore+"\t"+engScore+"\t"+MathScore+"\t"+tot +"\t" );
		System.out.printf("%.1f\n",avg);
	}
}
	


