package compony;

public class Test02 {
	public static void main(String[] args) {
		
		int sum=Integer.parseInt(args[0]);
		compony c=new compony(100);
		System.out.println("연 기본급 합 :"+c.getIncome());
		System.out.println("세 후 :" +c.getAfterTaxIncome());

		System.out.println("연 보너스 합 :"+c.getBonus());
		System.out.println("세 후 :" +c.getAfterTaxIncome());
		System.out.printf("연 지급액 합 : %.f",c.getAfterTaxIncome()+c.getAfterTaxBonus());
	}
}
