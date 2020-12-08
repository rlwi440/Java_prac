package prac04;

public class CastingEx {
	/**
	 * @author 깔끔한청년
	 * @date 20.12.08
	 */
	public static void main(String [] args) {
		/**
		 * 				복습공부 
		 * 			  정수형: Byte(1) ->short(2) ->Integer(4) ->long(8)
		 * 			  실수형 : float(4) -> double(8)	
		 * 			boolean(논리형) false -> stop true -> state
		 * 			ASCLL Table  A 65  ~Z 90  a 97 ~ z 122  0 48 ~ 9 57    
		 */
		CastingEx ex= new CastingEx();
		ex.test1();
		ex.test2();
		ex.test3();
	}
	void test1() {
		byte a = 65 ;	//아스키 코드 a 65
		Short b = 66; 	
		char c = 'q'; 	
		int d = 68; 	
		long e = 12122121221l;	 //뒤에 접미사 붙여주기 
		float f = 7121212215412L;//실수는 항상 정수보다 크다. 바이트 크기 상관이없다 float형 =long 형 	
		double g = 71; 	
		boolean r= (2<5);		//boolean형은  처음엔 false =stop 생각하면편하다 
		String k= "hello world";
				
		System.out.println("a = " +a);
		System.out.println("e = " +e);
		System.out.println("r = " +r);
		System.out.println("c = " +c);
		System.out.println("K = " +k);
		System.out.println("f = " +f);	
	}
	void test2() {		//최댓값과 과 최솟값을 손쉽게 구하깔기 .활용 
		System.out.println("Byte :" +Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);		
		System.out.println("Short :" +Short.MIN_VALUE+"~"+Short.MAX_VALUE);
		System.out.println("Int :" +Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
		System.out.println("Long :" +Long.MIN_VALUE+"~"+Long.MAX_VALUE);
	}
	void test3() {
		System.out.printf("이름:%s","깔끔한청년\n"); 		//printf (괄호안의 첫번째 문자열 형식대로 내용을 출력)  
		System.out.printf("목표:%s","포기하지않고꾸준히");
	}
	
}
