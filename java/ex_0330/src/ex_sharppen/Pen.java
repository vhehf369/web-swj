package ex_sharppen;

public class Pen {
	private int amount;
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
}

class SharpPen extends Pen {
	private double width;
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
}

class BallPen extends Pen {
	private String color;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}

class FountainPen extends BallPen {
	public void refill(int n) {
		setAmount(n);
	}
}