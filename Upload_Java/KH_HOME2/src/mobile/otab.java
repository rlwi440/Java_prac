package mobile;

public class otab extends Mobile{
	
	public otab() {
		super();
		// TODO Auto-generated constructor stub
	}

	public otab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}

	@Override
	public int operate(int time) {
		setBatterySize(-(time*12));		//빼기 맞는지 모르겠다..
		return getBatterySize();
	}

	@Override
	public int charge(int time) {
		setBatterySize(+(time*8));		//더하기 증가
		return getBatterySize();
	}
}
