package ex5_polymorphism_exam01;

public class Car {

	Tire tire;
	int speed;
	String brand;
	
	// 생성자 추가 (객체 만들 때 기본 타이어 넣어줌)
    public Car() {
        this.tire = new Tire();   // 기본 타이어
        this.speed = 0;
        this.brand = "현대";
    }

    public void run() {
        tire.roll();
    }
}
