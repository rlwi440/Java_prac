package JavaWorkshop4;

public class Test03 {
	/*
	 * 다음 배열의 내용을 실행 결과와 같이 출력 되도록 프로그램을 작성 하시오. int[] arr = {10, 20, 30, 40, 50,
	 * 60, 70, 80, 90, 100};
	 * 
	 */
	public static void main(String[] args) {
		int temp; 
		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		for (int i = 0; i < arr.length - 1; i++) {			//쉽게생각해 역순
			int max=i;
			for(int j =i+1; j<arr.length; j++) {
				if(arr[max]<arr[j]) {
					 temp=arr[max];
					 arr[max]=arr[j];
					 arr[j]=temp;
				}
				}
			}
		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k] + " ");
		}
	}
}
