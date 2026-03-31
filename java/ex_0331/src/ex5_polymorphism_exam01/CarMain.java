package ex5_polymorphism_exam01;

public class CarMain {
	public static void main(String[] args) {
		//자동차 객체 만들기
		Car c = new Car();
		
		c.speed = 100;
		c.brand = "포르쉐";
		c.run();
		
		// 처음엔 기본 타이어 (Tire)
        c.speed = 100;
        c.brand = "포르쉐";
        c.run();                    // ← 타이어가 회전합니다.

        // 한국타이어로 교체
        c.tire = new HankookTire();
        c.run();                    // ← 한국 타이어가 회전합니다.

        // 금호타이어로 교체
        c.tire = new KumhoTire();
        c.run();                    // ← 금호 타이어가 회전합니다.
	}
}
