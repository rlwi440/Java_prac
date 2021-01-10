package ncs.Test9;

public class Cargoplane  extends Airplane{

	public Cargoplane() {
		super();
	}

	public Cargoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void flight(int distance) {
		this.setFuelSize(this.getFuelSize()-(50*(distance/10)));
		//일정 거리 만큼 운항, 연료 감소
		//10 운항시 연료 50 감소

	}
	

}
