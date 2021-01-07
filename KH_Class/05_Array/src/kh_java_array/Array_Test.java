package kh_java_array;

public class Array_Test {
	public static void main(String []args) {
		Array_Test a = new Array_Test();
//		a. test0();
//		a.test1();
//		a.test2();
//		a.test3();
//		a.test4();
//		a.test5();
//		a.test6();
		a.test7();
	}
	/**
	 * 배열의 특징
	 * 배열의길이는 변경할수 없다.
	 */
	public void test7() {
		int[] arr = new int[10];
		System.out.println(arr.length);
		//hashCode 비교  객체 주소값에 접급할수있는 key 값
		System.out.println(arr.hashCode());
		//toString : 객체를 문자열 정보로 표현 
		System.out.println(arr);
		System.out.println(arr.toString());
		
		arr = new int[7];
		System.out.println(arr.length);
		System.out.println(arr.hashCode());
		//참조형 변수의 기본값 null 
		arr =null ; //삭제
//		System.out.println(arr.length);	//NullPointerException
	}
	
	
	
	/**
	 * string[]  
	 */
	 public void test6() {
//		 String [] nameArr = new String[3];
//		 nameArr[0]= "홍길동";
//		 nameArr[1]= "신사임당";
//		 nameArr[2]= "홍석리";
		 String [] nameArr= {"홍길동","신사임당","장영실"};
		 for(int i=0; i<nameArr.length; i++) {
			 System.out.println(nameArr[i]);
		 }
	 }		 

	 public void test5() {	
		 /**
		  * 복습구간 문제 
		  */ 
	       char [] arr = new char[26];
	        
	        for(int i = 0; i<arr.length; i++) {
	            arr[i] = (char) (i+'a');
	            if(i==arr.length-1) {
	                System.out.print(arr[i]);
	            }
	            else {
	                System.out.print(arr[i]+",  ");
	            }
	        }
	 }

	/**
	 * 배열 의 요소에 담긴 값이 규칙이있다면 ,반복문을 사용할수있다 .
	 * {1,2,3,4,5,}
	 * {'a','b','c'}
	 * 
	 */
	public void test4() { 
		int [] arr =new int[100];
		for(int i=0; i<=arr.length; i++) {
			arr[i]=i+101;
			System.out.println(arr[i]);
		}
	}
	/**
	 * 초기화 
	 * 배열변수 선ㅇ + 배열 할당(heap) +인덱스별 값대입 
	 */
	public void test3() {
		 char[] ChArr= {'a','b','c'};	
		 
		
	}
	
	
	
	public void test2() {		
		// 배열 선언 
		double [] arr;
		//배열 할당 : heap영역에 배열객체를 생성하고, 주소값을 arr에 대입 
		arr =new double [3];
		//double[ ]arr=new double[3];
		//배열 요소( 각 인덱스)에 값 대입 
		arr[0]= 1.1;
		arr [1]= 2.2;
		arr [2]= 3.3;	//배열 마지막 인덱스 : arr.length -1
		
		for (int i= 0; i <arr.length; i++)
			System.out.println(arr[i]);
	}
	public void test0() {
		//동일한 자료형을 가진 여러값
		int kor =80;
		int math = 70;
		int eng =90; 
		int society =75;
		int science = 45; 
		
		//총점  평균 
		int total = kor+math +eng +society+science;
		double avg=(double)total/ 5;
		System.out.printf("총점은%d점 ,평균 %.2f\n", total,avg );
	}
	/**
	 * 배열: 동일한 자료형의 값이 여러개인 경우 
	 */
	public void test1() {
		//1.배열 변수  선언 
		int[] arr; 
// 		int arr[]; 
		//2.배열  할당 : 배열길이를 반드시 지정할것.
		//메모리 heap영역에 int 값을  담을수 있는 공간 할당
		//배열은 각  타입별  초기값을 미리 처리됨.
		//기본형 -int 0,double 0.0 char ' ' , boolean false
		//참조형 : null (값없음)
		arr = new int[5];
		
		//int [] arr = {80,70,90,75,43};
		// 배열 각 번지수 참조 
		System.out.println("-----------------------");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println("------------------------");
		//3. 배열 각번지에 값대입 
		arr[0] = 80;
		arr[1] = 70;
		arr[2] = 90;
		arr[3] = 75;
		arr[4] = 43;
		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		for(int i= 0; i<5; i++) {
			System.out.println(arr[i]);
		}
		//4. 총점 평균 
		//int total =arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
		
		int[]arr1 = {80,70,90,43,75};
		int sum=0;
		double avg =0.0;
		//의미를 찾기 힘든 magic number 대신 변수, 상수를 사용하자 
		for(int i=0; i<arr1.length; i++) {
			sum+=arr1[i];
		
		avg=sum/arr1.length;
		System.out.println("총합 :" +sum + "평균 : " +avg);
		
		}
		
	}

}
