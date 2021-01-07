package kh.java.test.array;

public class Test1 {

	public static void main(String[] args) {
		/**
		 * 길이가 100인 배열을 선언하고 1부터 100까지 의값 을 순서대로 배열 
		 * @author 깔끔한청년
		 * @Date 2020.12.14 
		 * 
		 */
			Test1 ki =new Test1();
			ki.test();
	}
	public void test() {
			int[]arr =new int[100];		//길이값 100 
			int sum=0;		 //저장 공간
			for(int i=1; i<arr.length; i++) {
				sum +=i;
				System.out.println(sum);
		}
		
	}

}
