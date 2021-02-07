package workshop05;

public class Test03 {
public static void main(String[] args) {
	int[][] arr2 = {
			 {20, 30, 10},
			 {50, 40, 60},
			 {80, 80, 90}
			 };
	for(int i= arr2.length-1; i>=0; i--) {		// 거꾸로 생각
		for (int j=arr2[i].length-1; j>=0; j--) {
			System.out.println(arr2[i][j]+" ");
			}
		}
		
	}
}
