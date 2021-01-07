package kh.javatwo.dimentional.array;
/**
 * 2차원 배열 
 * {{1,2,3,},{4,5,6},{7,8,9}}
 * arr[0][0] --> 1
 * arr[0][1] --> 1 
 * arr[0][2] --> 1
 * arr[1][0] --> 1
 */

public class TwoDimentionlaAraayTest {
	public static void main(String [] args) {
		TwoDimentionlaAraayTest ki =new TwoDimentionlaAraayTest();
		//ki.test1();
//		ki.test2();
		ki.test3();
		ki.test4();
	}
	/**
	 * 2차원배열의 이해
	 * -배열안의 이해
	 *  -참조의 참조
	 */
	public void test4() {
		int [][]arr =new int [2][3];
		//int[][]의 길이: 첫번째 가리키는 배열의 길이 
		for(int i=0 ; i< arr.length; i++) {
			//int[]의 길이: 두번째 가리키는 배열의 길이 
			for(int j=0; j<arr[i].length ;j++) {
				
			}
		}
	}
	/**
	 * 
	 */
	public void test3() {
		/**
		 * 복습공부 연습
		 */
		
		char[][] arr = new char[2][26];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == 0) {
					arr[i][j] = (char) ('a' + j);
				} else {
					arr[i][j] = (char) ('A' + j);
				}
				System.out.print("[" + arr[i][j] + "]");
			}
			System.out.println();
		}
	}
	
	/**
	 * 2차원 배열의 초기화
	 * 
	 *  선언 ,배열할당, 값대입
	 */
	public void test2() {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void test1() {
		// 1.배열 선언
		int [][] arr ;
		//2.배열  할당
		arr = new  int [5][4];
		//3.값대입 
//		arr[0][0]=1;
//		arr[0][1]=2;
//		arr[0][2]=3;
//		arr[1][0]=4;
//		arr[1][1]=5;
//		arr[1][2]=6;
//		
		// 대입할 값사이의 규칙성이 있을때 중첩반복문을 통해 값대입 가능 
		
		int k =1; 
		for (int i= 0 ; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] =k;
				k++;
			}
		}
		//4 값출력 
		System.out.println(arr[2][3]);
			
	for (int i= 0; i<arr.length;i++) {
		for(int j=0; j<arr[i].length;j++ ) {
			System.out.println(arr[i][j]);
		}
	}
	
}
}