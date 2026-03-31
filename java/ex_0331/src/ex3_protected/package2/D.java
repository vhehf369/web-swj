package ex3_protected.package2;

public class D extends A{
	
	public D() {
		super(); //A클래스의 생성자 호출
	}

	public method1() {
		//상속받은 필드나 메서드를 사용할 수 있다
	}
	
	public void method2() {
		A a = new A();
		a.field = "value";
		a.mathod();
	}
}
