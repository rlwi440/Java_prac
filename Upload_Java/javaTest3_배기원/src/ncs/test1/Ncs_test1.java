package ncs.test1;

public class Ncs_test1 {
	public static void main(String[] args) {
		int[][] array = {{12,41,36,56,21},{82,10,12,61,45},{14,16,18,78,65},
				{45,26,72,23,34}}; 
		
		double sum=0; 		// 저장값
		int  count =0; 	
		double avg =0;	//합계 
		for (int i =0; i<array.length; i++) {
			for(int k=0; k <array[i].length; k++) {
				sum+= array[i][k];
				count++;
			}
		}
		System.out.println("배열의 합계  :" +sum);	
		avg=(double)sum/count;
		System.out.println("배열의 요소의 평균 :" + avg );
	}
}
