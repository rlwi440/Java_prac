package JavaWorkshop4;

public class Calc {
	/*
	 * int형 정수를 입력 받아 1부터 입력 받 은 숫자까지 짝수의 합을 구하여 리턴한다.
	 */
	public int calculate(int data) {
		int sum =0; 
		System.out.println("짝수: ");
		for(int i=0; i<data;i++) {
			if(i%2==0) {
				sum+=i;
				System.out.println(i+ " ");
			}
		}
		return sum;
		
	}

}
