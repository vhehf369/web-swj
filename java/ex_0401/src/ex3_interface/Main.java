package ex3_interface;

public class Main {
	public static void main(String[] args) {
		Notification[] notiy = {
				new SmsNotification(),
				new EmailNotification()
		};
		
		for(Notification n : notiy) {
			n.send("안녕하세요.");
		}
		
		Button button = new Botton();
		
		
	}
}
