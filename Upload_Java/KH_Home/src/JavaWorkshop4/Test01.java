package JavaWorkshop4;

public class Test01 {
	/*
	 * 2차원 배열 arr2에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 작성 하시오. int[][] arr2 = { { 5, 5},
	 * {10,10,10,10,10}, {20,20,20}, {30,30,30,30} };
	 * 
	 */
	public static void main(String[] args) {
		int [][] arr2 = {
				{ 5, 5},
				{10,10,10,10,10},
				{20,20,20},
				{30,30,30,30}
			};
		int sum =0;  int count =0; //합계는 sum ,  count= 평균 
		for(int i=0; i<arr2.length; i++) {		//1차원배열 
			for(int j =0; j<arr2[i].length; j++) {		// 2차원 배열 arr[i]
				sum+= arr2[i][j];
				count++;
			}
		}
			double avg =sum/count;
			System.out.println("total="+sum);
			System.out.println("average=" +count);
		}
}