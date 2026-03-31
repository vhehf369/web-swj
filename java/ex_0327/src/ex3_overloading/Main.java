package ex3_overloading;

public class Main {
	public static void main(String[] args) {
		OverloadingExample o = new OverloadingExample();
		Calc p = new Calc();
		
		//메서드 오버로딩의 장점
		//같은 이름으로 여러가지 타입의 매개값을 처리할 수 있다.
		int result = o.plus(1,  2);
		double result2 = o.plus(1.0, 2.0);
		int result3 = o.plus(3);
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		
		p.square(3, 5);
		
		System.out.println(p.square(7));
		//result3 = p.square(7);
		//System.out.println(result3);
	}
}
