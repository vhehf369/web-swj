package ex1_operator;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		//상자 하나에는 농구공이 5개가 들어갈 수 있다
		//만일 농구공이 23개라면 몇개의 상자가 필요한가?
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("공의 개수 : ");
		int ball = sc.nextInt();
		
		int box = ball % 5 == 0 ? ball/5 : ball/5 + 1;
		
		System.out.println("필요한 박스의 개수 : " + box);
		
		//--------------------------------------------------------------------------
		//사각형의 가로와 세로의 길이를 입력받아
		//넓이와 둘레 구하기
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("가로의 길이 : ");
		int width = s.nextInt();
		
		System.out.print("세로의 길이 : ");
		int height = s.nextInt();
		
		int area = width * height;
		int round = (width + height) * 2;
		
		System.out.println("너비 : " + area);
		System.out.println("둘레 : " + round);
		
		//학생은 하루에 일정한 금액의 용돈을 받는다.
		//하루에 받는 용돈 : money
		//날짜 수 : day
		//총 받은 용돈에서 사용한 금액 used를 뺀 남은 돈을
		//출력하는 코드 작성하기
		
		//각 값들은 키보드에서 입력받는다.
		
		Scanner c = new Scanner(System.in);
		
		System.out.print("하루에 받는 용돈 : ");
		int money = c.nextInt();
		
		System.out.print("날짜 수 : ");
		int day = c.nextInt();
		
		System.out.print("사용한 금액 : ");
		int used = c.nextInt();
		
		int total_money = money * day;
		int own_money = total_money - used;
		//or int own_money = (money * day) - used;
		
		System.out.println("남은 돈 : " + own_money);
		
		//국어,영어,수학에 대한 점수를 키보드에서 입력받는다.
		//1. 세 과목에 대한 합계 출력하기
		//2. 평균 출력하기
		//3. 세 과목의 점수가 각각 60점 이상이고, 평균이 60점 이상일 때 합격
		//아니면 불합격 처리
		//60 60 60 -> 합격
		//30 80 100 -> 불합격
		
Scanner d = new Scanner(System.in);
		
		System.out.print("국어 점수 : ");
		int kr = d.nextInt();
		
		System.out.print("영어 점수 : ");
		int eng = d.nextInt();
		
		System.out.print("수학 점수 : ");
		int math = d.nextInt();
		
		int total = kr + eng + math;
		double avg = total / 3;
		
		
		boolean q = kr >= 60 && eng >= 60 && math >= 60 && avg >= 60 ? true : false;
		System.out.println("합격 여부 : " + q);
	}
}
