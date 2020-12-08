package kh_java_operator;

import java.util.Scanner;

public class OperatiorTest {

	public static void main(String[] args) {
		OperatiorTest  ot= new OperatiorTest ();
		//ot.Test1();
		//ot.Test1_1();
		ot.Test1_2();
		//ot.Test2_1();
		//ot.Test2();
		//ot.Test3();
		//ot.Test4();
	}
	/**
	 * 단항 연산자
	 */
	public void Test1() {
		int a=10;
	
		System.out.println(+a +","+ -a);
		
		boolean bool =(a!=10);	//true ,false
		System.out.println(!bool);
		
		System.out.println((long)Integer.MAX_VALUE+1);   
		
		//증감 연산자 : ++ --
		//++a --a 전위 증감연산자 : 먼저 1증감후, 인접연산에 사용된다
		//a++ a-- 후위 증감연산자 : 인접연산에 먼저 사용된후 , 1증감한다.
		//a--;
		System.out.println("a =" +a);
		
//		System.out.println(++a + 1);
		System.out.println(a++ + 1);
		
		int k=1;
		int m= k++;
		System.out.println("k="+k + ",m="+m);
	}
	public void Test1_1() {
		int x =10;
		int y=10;
		int z=++x;
		
		System.out.printf("x=%d,y=%d,z=%d%n",x,y,z); 
		
		z=y++;
		System.out.printf("x=%d,y=%d,z=%d%n",x,y,z);
		
		x=20;
		z= x++  + --y;
		System.out.printf("x=%d,y=%d,z=%d%n",x,y,z);
		
		int m =20;
		int n  =m++  +m;
		System.out.printf("m=%d,n=%d%n",m,n);		//m값 21 n41
		
				
	}
	/**
	 * @실습문제 : 연산자문제 직접내기
	 * 
	 */
	public void Test1_2() {
		int x=10;
		int y=10;
		int z;
		
		System.out.println("--------------------");
		x++;
		y++;
		System.out.println("x=" + x);				
		
		System.out.println("--------------------");
		y--;
		--y;			
		System.out.println("y=" + y);	
		
		System.out.println("--------------------");
		z=x++;
		System.out.println("z=" + z);	
		System.out.println("x=" + x);   
		System.out.println("--------------------");
		z= ++x+y++;
		System.out.println("z=" + z);	
		System.out.println("x=" + x);  
		System.out.println("y=" + y);
	}
	public void Test2() {
		int a=10;
		int b=4 ;
		System.out.println(a-b);//6
		System.out.println(a+b);//14
		System.out.println(a/b);//2
		System.out.println(a%b);//2
		System.out.println(a*b);//40
		//((a+((b*a)/b)) -(a%b))
		System.out.println(a+(b*a/b)-(a % b));//18 
		
		System.out.println(a>b);	//크다 gr greater t
		System.out.println(a<b);	//작다  lt less than
		System.out.println(a>=b);	//크거나 같아 ge(greater than) or (equal to)
		System.out.println(a<=b);	//작거나 같다 le(less than )or (equa to)
	}
	/**
	 * 이항연산자 
	 * 논리 비교 연산자 && (펭귄) ||
	 * - && AND
	 *  a && b :a가 참이면서 b가 참인가? 참(true/false)
	 * -|| OR
	 * (a||b) : a혹은 b가 참인가 ?
	
	 * 좌/우항은 하나라도 참,둘다 거짓인경우는 거짓 
	 */
	public void Test2_1() {
		int i=3;
		System.out.println(i==0 && i<10);

		System.out.println(i==0 || i<10);	//~ 와 같다면 
		
		int a=1;
		int b=1;
		//System.out.println(a>0 && ++b>0);
		System.out.println(a==0 && ++b>0); //f 
		System.out.println("a= "+a +",b= "+b);
		
		a=1;
		b=1	;
		//System.out.println(a>0||++b>0 );
		System.out.println(a==0||++b>0 );
		System.out.println("a=" +a +"b="+b);	
	}
	/**
	 * 삼항 연산자
	 * (논리식)? (true일때 값):(false일때 값);
	 */
	public void Test3() {
		System.out.println(10>3 ?"ㅎㅎㅎㅎ": "ㅋㅋㅋ");
		
		int a =10;
		int b =3;
		int c= a ==b ? a:b;
		System.out.println("c= "+c);
		//a가 
		String s =(a%b ==0) ? "a는 b의 배수입니다.": "a는 b의배수가 아닙니다 .";
		System.out.println(s);
		
		//짝수 /홀수여부
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 :");
		int num = sc.nextInt();
		System.out.println(num %2 ==0 ? "짝수 ":"홀수" );
		System.out.println(num %2 !=0  ? "짝수 ":"홀수" );	
	}
	/**
	 * 복합대입연산자
	 */
	
	public void Test4() {
		int n=10;
		n+=5;
		System.out.println("n=" +n);	//n 공간에 ㅜ +5 결과를 대입하라 .
		n-=5;
		System.out.println("n=" +n);
		n*=3;
		System.out.println("n=" +n);
	
		n/=9;
		System.out.println("n=" +n);
		n%=3;
		System.out.println("n=" +n);
	
	}
}
