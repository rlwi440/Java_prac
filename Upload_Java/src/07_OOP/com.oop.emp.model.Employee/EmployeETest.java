package com.oop.emp.model.Employee;

import java.util.Scanner;
public class EmpTest {
	/**
	 * 	While문 사용 공부 완료 다시 재복습 !!
	 * 1. 새 사원 정보 입력 => empInput() 메소드 실행 2. 사원 정보 삭제 => 참조변수에 null대입할 것. 3. 사원정보 출력
	 * => empOutput() 메소드 실행 9. 끝내기
	 * @author 깔끔한 청년
	 * @Date 2020.12.18
	 * @param args
	 */
public static void main(String[]args) {
	Scanner sc= new Scanner(System.in);
	
	int selcetor = 0;
	Employee ki =new Employee();
		while(true) {
			System.out.println("******사원정보 입력*******");
			System.out.println("1.새사원 정보입력");
			System.out.println("2.사원정보 삭제");
			System.out.println("3.사원정보출력");
			System.out.println("9.끝내기");
			System.out.println("**********************");
			System.out.println("번호를 선택하세요 : ");
			if(selcetor==1) {
				ki.empInput();
				continue;			
			}else if(selcetor==2) {
				if(ki!=null);
				ki=null;
			}else if(selcetor==3) {
				ki.empOutput();
				continue;
			}else if(selcetor==9) {
				System.out.println("프로그램을 종료합니다 .");
				break;
			
			}
			
		}
	}
}

		
