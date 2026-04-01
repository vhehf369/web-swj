package ex3_interface;

public class EmailNotification implements Notification{
	
	@Override
	public void send(String massage) {
		System.out.println("[EMAIL]" + massage + "를 환영합니다.");	
	}

}
