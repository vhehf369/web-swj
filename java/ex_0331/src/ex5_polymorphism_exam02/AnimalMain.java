package ex5_polymorphism_exam02;

//추상 클래스
class abstract Animal{
	
	//추상클래스에도 일반적인 필드나 메서드가 들어갈 수 있다.
	int feed;
	
	public void breath() {
		syso
	}
	
	//추상메서드
	public abstract void sound() {
	}
}

//추상클래스를 상속받은 클래스는 추상 메서드를 반드시
//오버라이딩해서 내용을 구현해야 한다.
public class AnimalMain {
	public static void main(String[] args) {
		zoo z = new Zoo();
		
		//추상클래스는 객체를 직접 생성할 수 없다.
		Animal a = new Animal();
		
		z.printSound(new Dog());
		z.printSound(new Cat());
	}
}
