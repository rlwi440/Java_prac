package com.kh.print;

public class printTest {

	public static void  main(String[] args ) {
		printTest p =new printTest();
		p.test1();
		p.test2();
		p.test3();
		p.test4();
	}
	
	/**
	 * escape 문자 
	 * n 개행 . 스크린 커서 위치를 다음줄의 처음으로 옮기 10
     \t 수평탭. 스크린 커서를 다음 탭으로 옮김
     \r 캐리지리턴. 스크린커서의 위치를 현재 줄의 처음으로 옮긴다. 개행하지 않는다.
       이 기호 다음에 오는 문자를 덮어 쒸운다. 13
     \\ : 역슬래시 문자를 출력할때 사용.
     \" : 큰 따옴표를 출력할때 사용
     \' : 작은 따옴표를 출력할때 사용
	 **/
	public void test1() {
		System.out.println("안녕");	//출력 후 개행
		System.out.print("하\n");	//출력
		System.out.print("세요\n");
		System.out.print("나는");
		System.out.print("그는 말했다. \"춥다...\"");
		System.out.print("\n나는 아직어렵다. \"실력이없다...\"");
	}
	
	public void test2() {
		System.out.print("\n shakeIt 알람\n");
		System.out.print("--------------\n");
		System.out.print("흔들기\t 쏴리질러 \t터치하기\t원터치\n");
		System.out.print("--------------\n");
	}
	public void test3() {
		System.out.println("홍길동    \n신사임당\n세졷대왕\n");
		System.out.println("\n나는"+"\t깔끔한청년"+"이다.");
		System.out.println("홍길동\n\t\"신사임당\"\n\t세종대왕\\\"\\\'\\/");
	}
	public void test4() {
		System.out.println("나는"+"나다");
		System.out.println("총"+123+"개입니다.");
		System.out.println(12+34+"56");
		System.out.println("12"+3*7);
		}	
	}
