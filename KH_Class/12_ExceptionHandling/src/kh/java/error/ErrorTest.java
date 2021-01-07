package kh.java.error;
/**
 * 개인적으로 해야할일 줄맟춤 System.out.println
 * Error
 * 예외처리 등 프로그램적 으로 해결될수 없는 심각한 오류 
 * 
 *
 */
public class ErrorTest {

	public static void main(String[] args) {
		ErrorTest  e =new ErrorTest ();
//		e.test1();
		e.test2();		
		System.out.println("-----------프로그램 정상 종료 ----------");
	}
	public void test2() {
		System.out.println("test2 호출 !");
		test2();		// 종료조건 없는 재귀호출
		//java.lang.StackOverflowError
	}
	public void test1() {
		long[] arr= new long[Integer.MAX_VALUE];
		//java.lang.OutOfMemoryError: Requested array size exceeds VM limit
	}
}
