package ex2_mathod;

public class MathodMain {
	public static void main(String[] args) {
		//클래스 안에 정의된 메서드 사용하기
		
		//1. 객체가 정의되어야 한다.
		MathodExample m = new MathodExample();
		
		//2. 객체를 통해서 메서드를 호출해야 한다.
		//변수명.메서드명();
		m.printInfo();
		
		//두 수를 더하여 반환하는 add 메서드 작성하기
		
		//메서드의 호출
		int result = m.add(10, 7);
		System.out.println(result);
		System.out.println(m.add(2, 4));
		
		System.out.println(m.circleArea(3));
		
		//메서드의 호출
		//m.circleArea(3);
		
		m.circleRound(4);
		
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		int t = m.countEven(a);
		System.out.println(t);
		
		int result2 = m.countChar("apple", 'p');
		System.out.println("p의 개수 : " + result2);
	}
}
