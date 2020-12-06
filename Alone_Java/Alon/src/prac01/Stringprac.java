package prac03;

public class Stringprac {
	/**
	 * 혼자연습하는공간  @author,@date, 
	 * @author 깔끔한청년
	 * @date 2020.12.05
	 * 
	 *
	 **/

	public static void main(String[] args) {
		/**
		 * 문자열 연산자 쉽게 생각하기 
		 * 10+2+8 = 20  숫자 연산과  문자열 연산은 말그래도 피연산자도 자동으로 문자열로 자동변환.
		 * @param Value
		 * @param String
		 * 
		 */
		int Value = 10 + 2 + 8;
		System.out.println("value: " + Value);

		String str1 = 10 + 2 + "8";
		System.out.println("str1 :" + str1); // 문자열 결합연산

		String str2 = 10 + "2" + 8;
		System.out.println("str2 :" + str2);

		String str3 = "10" + 2 + 8;
		System.out.println("str3 :" + str3);

		String str4 = "10" + (2 + 8);
		System.out.println("str4 :" + str4);

	}
}
