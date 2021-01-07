package kh.java.io.byte_.system;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * byte 기반의 표준입출력
 * system in :사용자 키보드 입력 
 * System out :콘솔
 * 이클립스에서는 Ctrl+z 입력하면 -1을 리턴 ->종
 */
public class SystemioTest {

	public static void main(String[] args) {
		SystemioTest s =new SystemioTest();
		s.test1();
		s.test2();
		System.out.println("=======실행종료=======");
	}
	/**
	 * 2004년 JDK 1.5버전이 나오기전
	 * Scanner 클래스가 등장전의 사용자가 입력값처리는 다음과 같다 
	 */
	public void test2() {
		//보조스트림: 기본스트림에 연결해서 사용. 보조스트림 여러개 연결할수있다 .
		// 마지막 연결된 보조스트림으로 입출력 제어 및 자원반납을 한다 .
		//System.in -> 브릿지스트림(보조) -> 보조 스트림 
	BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
	String data = " "; 
	System.out.println("키보드를 입력하세요 : ");
	try {
		int sum=0;
		while((data= br.readLine())!= null) {
//			System.out.println(data);
			sum +=Integer.parseInt(data);
			System.out.println(sum);
		}
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		//자원반납
		//표준입출력을 사용하는 스트림클래스는 반납하면 안된다.
		//한번 닫힌 표준입출력은 재사용할수 없다.
//		try {
//			br.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
 }
	/**
	 * System.in 
	 * read() :int -> 대상으로 부터 1byte로 읽어와서 int로 리턴하는 메소드 
	 * 256가지 (0~256) +1(-1 읽어올 값이 없는경우)
	 */
	public void test1() {
		System.out.println("키보드로 입력값을 주세요 : ");
		int data = 0; //읽어온 값을 처리할 변수
		
		try {
			
			while((data = System.in.read()) != -1) {
				System.out.println("input = " + data);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
