package ex_abstract;

public class AirPlane extends Transport {

	int airportfee; //공항 이용료
	int fuelCharge; //유류할증비
	
	//필드는 생성자를 통해서 초기화
	public AirPlane(String name, int baseFare, int airportfee, int fuelCharge) {
		super(name, baseFare);
		this.airportfee = airportfee;
		this.fuelCharge = fuelCharge;
	}
	//총요금 : 기본 요금 + 공항 이용료 + 유류할증비
	@Override
	int calculateFare() {
		return baseFare + airportfee + fuelCharge;
	}
}
