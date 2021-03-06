package Account;

public class AccountTest2 {

	public static void main(String[] args) {
		//1) Account 객체형 배열을 5개 선언한다.
		Accont[] ac = new Accont[5]; 
		/*
		 * 2) for 문을 이용하여 5개의 Account 객체를 배열에 생성 한다. - 계좌번호: 221-0101-211X(X 부분은 1부터
		 * 5까지의 정수가 셋팅 된다) - 잔액 및 이자율은 모두 100000원, 4.5% 이다.
		 */
		for(int i=0; i<ac.length; i++) {		
			ac[i]=new Accont("221-0101-211"+i,100000,4.5);
		}
		//4) for문을 이용하여 생성된 배열의 모든 정보를 출력 한다.(출력 시 accountInfo()함수 이용)
		for(int i=0; i<ac.length;i++) {
			ac[i].accountInfo();
			System.out.println();
		}
		System.out.println();
		//5) for문을 이용하여 모든 Account 객체의 이자율을 3.7% 변경 하고 이자를 화면에 출력 한다.
		for (int i = 0; i < ac.length; i++) {
			ac[i].setInterestRate(3.7);
			ac[i].accountInfo();
			System.out.printf("  이자율 : %.0f원",ac[i].calculateInterest());
			
			System.out.println();
		}
	}
}
