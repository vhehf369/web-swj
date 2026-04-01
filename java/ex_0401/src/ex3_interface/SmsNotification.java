package ex3_interface;

public class SmsNotification implements Notification{

	@Override
	public void send(String massage) {
		System.out.println("[SMS]" + massage + "를 전송합니다.");	
	}
}
