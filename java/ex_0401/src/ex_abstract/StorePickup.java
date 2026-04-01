package ex_abstract;

public class StorePickup extends Delivery {

	@Override
	public void ship() {
		System.out.println("매장 픽업");
	}

}
