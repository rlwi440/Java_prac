package ncs.Test9;

public class Airplane extends Plane {
	

	public Airplane() {
		super();
	}

	public Airplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	@Override
	public void flight(int distance) {
		this.setFuelSize(this.getFuelSize()-(30*(distance/10)));
		//일정 거리 만큼 운항, 연료 감소
		//10 운항시 연료 30 감소
	}
}
