package staticclass;

public class Outer {

	int a = 10; //일반 필드
	static int b = 20; //정적 필드(클래스 변수)
	
	//바깥클래스와 완전히 단절된것은 아니고, 필요하면 객체를 전달받아 사용할 수 있다.
	static class Inner{
		//정적내부클래스는 Outer객체에 연결되어 있지 않기 때문이다.
		void print() {
			//System.out.println(a); 오류
			System.out.println(b); //가능
		}
		
		void print(Outer outer) {
			System.out.println(outer.a);
		}
	}
}
