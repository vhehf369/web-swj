package ex2_mathod;

import java.util.Scanner;

public class TimesTableMain {
	public static void main(String[] args) {
		//1. 클래스의 객체를 생성한다.
		TimesTable t = new TimesTable();
		Scanner sc = new Scanner(System.in);
		System.out.println("단 입력 : ");
		
		//2.객체를 통해서 메서드를 호출한다.
		//2-1. return을 통해 반환값을 받는경우 연산결과를 변수에 대입한다.
		//2-2. 반환값이 없는 경우 호출만 한다.
		t.showTable(sc.nextInt());
		
	}
}
