package kh_java_array;

/**
 * 배열복사
 *  1. 얕은 복사
 *  -배열 변수 (주소값)의 복사
 *	2.깊은복사
 *-배열객체의 값복사
 */
public class ArrayCopyTest {
	public static void main(String[]args) {
		ArrayCopyTest a= new ArrayCopyTest();
//		a.test1();
//		a.test2();
		a.test3();
		a.test4();
	}
	/**
	 * 깊은복사 3 
	 * clone ()
	 */
	public void test4() {
		double [] arr1 = new double[] {0.123,0.741,0.324};
		double [] arr2=arr1.clone();
		arr1[1]=0.567;
		 
		for(int i=0; i<arr1.length; i++) {
			System.out.printf("%.3f ----- %.3f%n",arr1[i],arr2[i]);
		}
		
	}
		/**
	 * 깊은복사 2: System.arraycopy(원본배열 ,시작인덱스,도착지 배열,시작인덱스 ,복사할길이));
	 */
	public void test3() {
		char[] arr1 = {'a','b','c','d','e'};
		char [] arr2 = new char[arr1.length];
		
		
		System.arraycopy(arr1 , 0, arr2, 0, arr1.length);
		arr1[3]= 'x';
		for (int i=0 ; i<arr1.length; i++) {
			System.out.printf("%c---- %c%n",arr1[i],arr2[i]);
		}
	}
	/**
	 * 깊은복사 1: 반복문을 통해 직접 값 복사하기 
	 *  
	 */
	public void test2() {
		int [] arr1= {1,2,3};
		int [] arr2= new int[ arr1.length];
		
	 
		for (int i =0 ; i<arr1.length;i++) {
			arr2[i]=arr1[i];
		}
		arr1[1]*=100;
			
			//출력 
			for (int i1 =0 ; i1<arr1.length;i1++) {
				System.out.printf("%d-----%d%n",arr1[i1],arr2[i1]);
			}
			System.out.println(arr1.hashCode());
			System.out.println(arr2.hashCode());
			System.out.println(arr1== arr2);
		}
	

	/**
	 * 얕은복사 : 주소값만 복사 , 같은 배열을 공유
	 */
	public void test1() {
		int [] arr1= {1,2,3};
		int[] arr2=arr1;
		for(int i= 0;i <arr1.length; i++) {
			System.out.printf("%d-----%d%n",arr1[i],arr2[i]);
		}
		System.out.println(arr1.hashCode());
		System.out.println(arr2.hashCode());
		// 배열 주소값 비교 
		System.out.println(arr1==arr2);
		//얇은 복사의 활용 
		pirntArr(arr1);
		
	}
	public void pirntArr(int [] arr) {
		System.out.println(arr.hashCode());
		for(int i=0 ; i<arr.length; i++) {
			System.out.println(arr[i]+ " ");
		}
		
	}

}
