package ex5_polymorphism_exam01;

public class Payment {

	public int pay(int amount) {
		System.out.println(amount + "원을 결제합니다.");
	}
}

public class CardPayment extends Payment {
    
    @Override
    public void pay(int amount) {
        System.out.println("카드로 " + amount + "원을 결제합니다.");
    }
}