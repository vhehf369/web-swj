package ex2_super_method;

public class SuperSonicAirplane extends AirPlane{
	public 
	
	//상수 선언
	//NORMAL = 1
	//
	
	static final int NORMAL = 1;
	static final int SUPERSONIC = 2;
	
	int flymode = NORMAL;
	
	//fly()메서드를 오버라이딩한다
	//flymode가 SUPERSONIC이라면 "초음속 비행을 합니다."
	//그게 아니면 부모의 fly()메서드 호출하기
	
	@Override
	public void fly() {
		if(flymode == SUPERSONIC) {
			System.out.println("초음속 비행을 합니다");
		}else {
			super.fly();//부모의 메서드 호출
		}
	}
}
