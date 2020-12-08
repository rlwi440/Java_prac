package prac03;

import java.util.Scanner;

public class Stringborad {
	/**
	 * 혼자연습하는공간  @author,@date, 
	 * @author 깔끔한청년
	 * @date 2020.12.06
	 * 
	 *
	 **/
	public static void main(String[] args) {
		/**
		 * @param scanner 
		 * @throws 입력된 문자열에서  input Data q 를 입력시 종료 .
		 * @return inputData
		 */
		Scanner scanner = new Scanner(System.in);
		String inputData;

		while (true) {
			inputData = scanner.nextLine();
			System.out.println("입력된 문자열:\"" + inputData + "\"");
			if (inputData.equals("q")) {
				break;
			}
		}
		System.out.println("종료");	

	}
}
