package ex4_for;

import java.util.Scanner;

public class ForExample {
	public static void main(String[] args) {
		//지역 변수 : 특정 영역 내에서 만들어진 변수는 해당 영역 내에서만 사용할 수 있다.
		//안에서 만든 변수는 바깥에서 사용할 수 없다.
		//바깥에서 만든 변수는 안쪽에서 사용할 수 있다.
//		int i;
//		for(i = 1; i <= 3; i++) {
//			System.out.println(i+" ");
//		}
//		
//		System.out.println("외부 i의 값 : " + i);
		for(int i = 1; i <= 3; i++) {
			System.out.println(i+" ");
		}
		
		//System.out.println("외부 i의 값 : " + i);
		
		System.out.println("----------------------------------------");
		//5부터 1까지 출력하기
		//5 4 3 2 1
		for(int i = 5; i > 0; i--) {
			System.out.print(i+" ");
		}
		
		int sum = 0;
		for(int i = 1; i <= 10; i++); {
			sum += i; //sum = sum + 1
		};
		
		System.out.println("1 ~ 10까지의 총 합 : " + sum);
		System.out.println("--------------------------");
		
		//1부터 10까지 3의 배수만 출력하는 for문 작성하기
		//1부터 10까지 순회하는 역할
		for(int i = 1; i<=10; i++) {
			if(i % 3 == 0) {
				System.out.println(i + " ");
			}
		}
		//1부터 20까지 홀수만 출력하세요
		
		
		//정수형 변수를 하나 초기화 한다.
		//해당 정수에 해당하는 구구단 출력하기
		// 3 x 1 = 3
		//...
		// 3 x 9 =27
		
		int dan = 3;
				
		//내가 반복하고 싶은것 : 곱하기 9번
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d x %d = %d",dan, i, dan * i);
					}
		//키보드에서 정수를 하나 입력받고
		//1부터 입력받은 정수까지의 총 합 구하기
		//예를 들어 5를 입력받으면 1 ~ 5까지의 총합인 15를 출력해야 한다.
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int y = sc.nextInt();
		
		int total = 0;
		for(int i = 1; i <= y; i++) {
			total += y;
		}
		//10개의 정수를 입력받고 그 수들 중 짝수가 몇개인지 구하세요
		int count = 0;
		for
	}
}
