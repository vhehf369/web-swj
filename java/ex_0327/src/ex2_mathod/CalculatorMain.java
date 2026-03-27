package ex2_mathod;

import java.util.Scanner;

public class CalculatorMain {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		
		int result = c.getResult(2, 3, "*");
		System.out.println(result);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("첫번째 숫자 : ");
//		int a = sc.nextInt();
//		System.out.println("두번째 숫자 : ");
//		int b = sc.nextInt();
//		System.out.println("기호 : ");
//		String z = sc.nextLine();
//		
//		c.getResult(a, b, z);
	}
}
