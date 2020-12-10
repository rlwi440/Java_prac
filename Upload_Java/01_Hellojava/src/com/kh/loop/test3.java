package com.kh.test.loop;

public class Test3 {
	/**
	 * @author 깔끔한청년
	 * @Date 2020.12.11  
	 */
	public static void main(String[]args) {
		Test3 ki=new Test3();
		ki.test();
	}
	public void test() {

		for(int i=1;i<10;i++) {
			System.out.println(i+"단을 출력합니다" );
			for(int j=1;j<10;j++) {
				System.out.println(i+"x"+j+"="+(i*j));
			}
		 {
			System.out.println("잘못입력하셨습니다. 프로그렘종료");
		}
	}

	}
}
