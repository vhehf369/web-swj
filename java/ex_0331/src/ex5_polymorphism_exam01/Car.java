package ex5_polymorphism_exam01;

public class Car {

	Tire tire;
	int speed;
	String brand;
	
	public void run() {
		tire.roll();
	}
}
