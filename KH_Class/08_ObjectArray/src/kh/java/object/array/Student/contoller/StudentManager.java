package kh.java.object.array.Student.contoller;

import java.util.Scanner;

import kh.java.object.array.Student.model.vo.StudentVO;

public class StudentManager {
private Scanner sc =new Scanner(System.in);
public static final int MAX_LENGTH=100;
//연관관계 (has a 포함관계)StudentManager has a  StudentVO 
private StudentVO[] arr= new StudentVO[MAX_LENGTH];
private int idx= 0 ;	//사용자 입력값에 따라 처리될 인덱스 변수


public void inputStudent() {
	while(idx <MAX_LENGTH) {
		System.out.println("-------" +(idx+1) + "-------");
		System.out.println("학번 :");
		int no =sc.nextInt();
		System.out.println("이름 :");
		String name =sc.next();
		System.out.println("전화번호 : ");
		String phone =sc.next();
		
		StudentVO stdt =new StudentVO(no,name,phone);
		//1. 다음에 추가할 요소의 인덱스
		//2. 현재까지 입력한 요소의 개수 
		arr[idx++] =stdt;		// 배열 추가 하는의미 배열에서 0번지 의 요소를 
		System.out.println("계속 입력하시겠습니까 (y/n) : ");
		char yn =sc.next().charAt(0);	
		if(yn=='n')	{	
			System.out.println("====입력완료 ====");
			break;
		}
	}
		
	}

	public void printStudent() {
		
	//2.idx변수를 이용해서 입력한 개수만큼 접근
	for(int i=0 ; i<idx; i++) {			// idx 입력한 요소값
		StudentVO s =arr[i];	
		System.out.printf("%-15s%-15s%-15%sn",
			s.getName(), s.getNo(), s.getPhone());
	
		}
	}
}
		

		
		
		
			
//		//MAX_LENGTH  100개공간을 모두 접근
//		for (StudentVO s : arr) {
////		System.out.println(s);
//			// null 인경우 ,탈출
//			if (s == null)
//				break;
//			System.out.printf("%-15s%-15s%-15%sn",
//					s.getName(), s.getNo(), s.getPhone());
		
