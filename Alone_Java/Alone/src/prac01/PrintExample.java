package prac03;

public class PrintExample {
	/**
	 * 혼자연습하는공간  @author,@date, 
	 * @author 깔끔한청년
	 * @date 2020.12.05
	 * 
	 *
	 **/
	
	public static void main(String[] args) {
		/**
		 * @param int
		 * @param double
		 * @param String 
		 * 문자열 %-10s  6자리 문자열, 오른쪽 빈자리 공백 ,%10s 10자리문자열  왼쪽 문자열 빈자리 공백
		 */
		
		int Value=123;
		System.out.printf("상풍의가격:%d원\n",Value);
		System.out.printf("상풍의가격:%6d원\n",Value);
		System.out.printf("상풍의가격:%-6d원\n",Value);
		System.out.printf("상풍의가격:%-6d원\n",Value);
		System.out.printf("상풍의가격:%06d원\n",Value);
		
		double area =3.14159 *10*10;
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n",10,area);
		
		String name=  "깔끔한청년";
		String object = "개발자";
		System.out.printf("%6d|%-10s|%10s\n",1,name,object);
			
	}

}
