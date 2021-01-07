package kh.java.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Exception
 * 예외처리 를 통해서 정상복구될수 있는오류
 * 1. checked exception: RuntimeException 의 후손쿨래스 가 아님. 예외처리 강제화 
 * 2. unchecked exception : RuntimeException 의 후손쿨래스 
 *  처리순서 
 *  finally  절 :try 절에서 예외가 던져지든 아니든 무조건 실행되는 코드 
 *  			자원반납등의 목적으로 사용 조기리턴시 실행됨
 *			
 */

public class ExceptionTest {

	public static void main(String[] args) {
		ExceptionTest e =new ExceptionTest();
//		e.test1();
//	 	e.test2();
//		e.test3();
//		e.test4();
		try {
			e.test5();
		} catch (FileNotFoundException e1) {
		} catch (IOException e1) {			// catch 구문 하나더 생성
			
		}
		System.out.println("----- 정상 종료 -----");
	}
	
	/**
	 * CheckedException 
	 * 예외처리 강제화
	 * 1. try ~ catch
	 * 2. throws절 통해 회피
	 * 		-복수개의 예외를 던지는게 가능하다 .
	 * 		-다향성을 적용할수있다 .
	 */
	public void test5() throws IOException  {
		//1.try~catch처리
//		try {
//			
//			FileReader fr = new FileReader("test.txt");
//			System.out.println("파일을 찾았습니다.");
//			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
		
		//2.throws를 통해 예외회피
		FileReader fr = new FileReader("test.txt");
		System.out.println("파일을 찾았습니다.");
		
		
	}
	/**
	 *try 절 
	 *catch절 
	 *- 여러개의 예외클래스를 처리할 수있도록 catch 절을 여러개 작성할수있다 .
	 *- 부모 예외클래스 타입의  catch 절로 통합해서 처리 할수도 있다 (다향성ㅌ)
	 *- 여러개의 예외클래스 타입의 catch 절을 사용하는경우, 자식-부모타입순으로 작 
	 */
	public void test1() {
		
		//예외처리 
		try {
//			// 예외가 발생할수있는  코드 
//			String s =null;
//			System.out.println(s.length());
//			Scanner sc =new Scanner(System.in);		//java.util.InputMismatchException
//			System.out.println("정수입력 :");
//			int num = sc.nextInt();	//java.util.InputMismatchException
//			System.out.println(num/0);  // 수를 0 으로 나눌수없다 
//			// java.lang.ArithmeticException: / by zero
//			
		}catch(InputMismatchException e) {
			//해당예외가 발생했을경우 처리코드 
			System.out.println("정확한 입력값이을 입력해주세요.");
//			System.out.println("------정상종료 ----------");
//		} catch(ArithmeticException e) {
//			System.out.println("수를 0으로 나눌수 없습니다.");
//			System.out.println("------정상종료 ----------");
//		} catch(NullPointerException e){
//			
//			System.out.println("NPE발생!");
//			System.out.println("------정상종료 ----------");
//			e.printStackTrace(); //예외가 발생했을때의 콜스택 상황 
//		}
			//Catch 절에도 다향성 이 적용된다.
	}catch(RuntimeException e) {
		e.printStackTrace();
		}catch(Exception e) {		// 예외타입
			e.printStackTrace();
		}
	}
}
	
