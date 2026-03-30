package ex_sharppen;

public class PenMain {
	public static void main(String[] args) {
		SharpPen sharp = new SharpPen();
		sharp.setAmount(100);
		sharp.setWidth(0.5);
		
		BallPen ballpen = new BallPen();
		ballpen.setAmount(100);
		ballpen.setColor("빨강");
		
		FountainPen fountain = new FountainPen();
        fountain.setAmount(50);
        fountain.setColor("파랑");
        fountain.refill(80);
        
        System.out.println("샤프 남은 양: " + sharp.getAmount());
        System.out.println("샤프 두깨: " + sharp.getWidth());
        System.out.println("볼팬 남은 양: " + ballpen.getAmount());
        System.out.println("볼팬 색깔: " + ballpen.getColor());
        System.out.println("만년필 리필까지남은양: " + fountain.getAmount());
        System.out.println("만년필 색깔: " + fountain.getColor());
	}
}
