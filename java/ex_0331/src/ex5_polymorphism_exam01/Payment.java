package ex5_polymorphism_exam01;

public class Payment {

	public int pay(int amount) {
		System.out.println(amount + "원을 결제합니다.");
	}
}

class CardPayment extends Payment{
	@Override
	
}

class Order {
	Payment payment;
	
	public void proccessPayment(int amount)
}

public class PayMentMain {
	public static void main(String[] args) {
		
	}
}