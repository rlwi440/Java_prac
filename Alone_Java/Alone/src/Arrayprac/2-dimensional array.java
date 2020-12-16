package Array_char;

public class ArrayInarray {

	public static void main(String[] args) {
		/**
		 * 4행 5행 에서 1~100사이의 임의의 정수를 출력 받아  합계 5의 배수값출력 복습 문제 
		 * @author 깔끔한청년
		 * @Date 2020.12.16
		 * 
		 */
		ArrayInarray ki =new ArrayInarray();
		ki.test();
	}
	public void test() {
	 int[][] arr= new int[4][5];		//4행 5열 
	 int sum[]= new int[arr.length];	//sum 저장공간 
	 for(int i=0; i<arr.length; i++) {
		 for(int j=0; j <arr[i].length; j++) {
			 arr[i][j]=(int)(Math.random()*100)+1 ;	 //1~100개  임의의 정수를 모든방에 기록. 
			 sum[i]+=arr[i][j];
		 }
	 }
	 System.out.println();
	
	for(int i= 0; i<arr.length; i++) {
		for(int j=0; j<arr[i].length; j++) {
			System.out.println(arr[i][j]+ " ");
		}
		System.out.println();
	}
	System.out.println();
	
	for(int i=0; i<arr.length; i++) {
		if(sum[i]%5==0) {			//열의 합계가 5의배수 
			System.out.println("["+ i + "]열의 합계(5의배수) : " +sum[i]);
		}else {
			System.out.println("["+ i + "]열의 합계(5의배수) :5의배수가 아닙니다. " );
		}
		}
	}
}

