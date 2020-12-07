package prac04;

public class ForMultipli {
	/**
	 * @author 깔끔한청년
	 * @date 2020.12.07
	 */

	public static void main(String[] args) {
		/**
		 * @param int m,n
		 * @throws 바깥쪽 for문과 중첩문 for문을 9번 반복 실행
		 * @return for(int m=2; m<=9;m++)
		 */
		for (int m = 2; m <= 9; m++) {
			System.out.println("***" + m + "단***");
			for (int n = 1; n <= 9; n++) {
				System.out.println(m + "x" + n + "=" + (m * n));
			}

		}

	}
}
