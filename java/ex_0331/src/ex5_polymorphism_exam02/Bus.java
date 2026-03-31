package ex5_polymorphism_exam02;

public class Bus extends Vehicle{
	
	@Override
	public void run() {
		System.out.println("버스가 달린다");
	}
}

public class Texi extends Vehicle{
	
	@Override
	public void run() {
		System.out.println("택시가 달린다");
	}
}