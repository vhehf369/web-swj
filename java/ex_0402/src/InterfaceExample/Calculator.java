package InterfaceExample;

public class Calculator {
	// Calculator 인터페이스 정의
	interface Calculator {
	    void add(int x, int y);
	}

	public class Main {
	    public static void main(String[] args) {
	        // 익명 객체 생성
	        Calculator calc = new Calculator() {
	            @Override
	            public void add(int x, int y) {
	                System.out.println("합: " + (x + y));
	            }
	        };

	        // 두 수의 합 출력
	        calc.add(10, 20);
	    }
	}

}
