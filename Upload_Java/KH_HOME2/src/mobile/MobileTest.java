package mobile;

public class MobileTest {
	public static void main(String[] args) {
		Mobile lmobile =new Ltab("Ltab",500,"AP-01");
		Mobile omobile =new otab("Otab",1000, "AND-20");
		System.out.println("Mobile\tBattery\tos");
		System.out.println("-----------------------------");
		System.out.printf("%s\t%d\t%s%n",lmobile.getMobileName(),
				lmobile.getBatterySize(),lmobile.getOsType());
		System.out.printf("%s\t%d\t%s%n",omobile.getMobileName(),omobile.getBatterySize(),omobile.getOsType());
		System.out.println("\n");
		lmobile.charge(10);
		omobile.charge(10);
		System.out.println("10분충전");
		System.out.println("Mobile\tBattery\tos");
		System.out.printf("%s\t%d\t%s%n",lmobile.getMobileName(),
				lmobile.getBatterySize(),lmobile.getOsType());
		System.out.printf("%s\t%d\t%s%n",omobile.getMobileName(),omobile.getBatterySize(),omobile.getOsType());
		System.out.println("\n");
		System.out.println("\n");
		lmobile.charge(5);
		omobile.charge(5);
		System.out.println("5분통화");
		System.out.println("Mobile\tBattery\tos");
		System.out.printf("%s\t%d\t%s%n",lmobile.getMobileName(),
				lmobile.getBatterySize(),lmobile.getOsType());
		System.out.printf("%s\t%d\t%s%n",omobile.getMobileName(),omobile.getBatterySize(),omobile.getOsType());
		
	}
}
