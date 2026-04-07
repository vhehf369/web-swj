package ex3_generic;

import exam.ArrayPrinter;

public class Main {
	public static void main(String[] args) {
//		GenEx<String> v1 = new GenEx<String>();
//		
//		v1.setValue("java");
//		
//		System.out.println(v1.getValue());
		
		//제네릭 타입이 정수인 객체 v2
		//값 넣고 출력하기
		
		//제네릭 타입이 문자형인 객체 v3
		//값 세팅하고 출력하기
		
		Sample<String> sample = new Sample<String>();
		sample.addElement("This is String", 5);
		System.out.println(sample.getElement(5));
		
		Printer p = new Printer();
		
		//타입 추론
		//제네릭 메서드를 호출할때 전달할 값으로 타입을 자동 판단한다.
		p.printValue("안녕하세요");
		p.printValue(100);
		p.printValue(3.14);
		
		//명시적으로 타입을 적는 방법
		p.<String>printValue("안녕");
		p.<Integer>printValue(100);
		
		System.out.println(p.getValue("자바"));
		System.out.println(p.getValue(1000));
		
		
		
		String name[] = {"김철수", "이영희", "박민수"};
		Integer nums[] = {10,20,30};
		
		ArrayPrinter.printArray(name);
		ArrayPrinter.printArray(nums);
	}
}
