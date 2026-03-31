package ex1_overriding;

public class Dog extends Animal{
	@Override
	public void sound(String a) {
		System.out.println("멍멍");
	}

}
