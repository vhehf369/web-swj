package ex1_array;

import java.util.Scanner;

public class ArrayExample {
public static void main(String[] args) {
	
	char[] cards = {'1','L','O','2','V','3','E'};
	String myWord = "";
	
	//배열에서 문자만 뽑아서 단어 만들기
	//아스키 코드 활용하기
	for(int i = 0; i < cards.length; i++) {
		int word = cards[i];
		if((word >= 65 && word <= 90) || (word >= 97 && word <= 122)) {
			myWord += (char)word;
		}
	}
	System.out.println("단어 : " + myWord);
	
	//변수 money에 10 ~ 5000원 사이의 난수를 발생시켜 넣는다.
	//단, 1의 자리 숫자는 반드시 0이 되도록 한다.
	//발생된 난수 money를 동전으로 바꾸면 각 동전이 몇 개 필요한지 코드로 작성하기
	//가능한 적은 수의 동전을 사용하도록 한다.
	//1의 자리가 없는 난수 : 1 ~ 500 사이의 난수를 뽑고 10을 곱한다.
	
	//10 ~ 5000사이의 난수
	int money = ((int)(Math.random()*500)+1)*10;// 1<= x < 501
	//0.0 * 500 <= x * 500 < 1.0 * 500
	//int에 의해 0 <= (int)(x * 500) <= 499
	//1 <= (int)(x * 500) + 1 <= 500
	//10 <= {(int)(x * 500) + 1} * 10 <= 5000
	//10~5000
	
	int[] coin = {500,100,50,10};
	
	System.out.println("잔돈 : " + money);
	//발생된 난수를 큰 동전부터 나누기
	for(int i = 0; i < coin.length; i++) {
		int res = money / coin[i];
		System.out.println(coin[i] + "원 : " + res);
		money = money % coin[i];
	}
	
	//키보드에서 배열의 길이를 입력받는다.
	//입력받은 배열의 길이만큼 알파벳을 요소로 넣는다.
	//배열의 모든 요소를 출력한다.
	//배열의 길이 : 5
	//ABCDE
	//배열의 길이가 : 10
	//ABCDEFGHIJ
	
	//배열의 선언과 생성 -> 길이를 키보드로 입력받기
	
	//배열의 길이만큼 반복하여 요소에 알파벳 넣기(아스키코드 활용하기)
	//int[] arr;
	Scanner sc = new Scanner(System.in);
	System.out.println("배열의 길이 : ");
	int z = sc.nextInt();
	
	//길이가 len인 문자형 배열(비어있음)
	char[] c = new char[z]; // z크기만큼 빈공간을 만든다.
	
	char ch = 'A';
	//배열의 길이만큼 반복하여 빈공간에 알파벳을 채운다.
	//for(초기식;조건식;증감식;){ } -> 반복
	
	for(int i = 0; i < c.length; i++) {
		c[i] = ch++;
		System.out.print(c[i]);
	}
	
	//로또번호 구하기
	//1~45사이의 난수를 발생시켜 로또번호 6자리를 만드는 코드 작성하기
	//구한 로또번호를 배열에 담기
	//번호가 중복되는지 비교하기
	//Math.random() -> 0.0 <= x < 1.0
	//Math.random()*45 -> 0.0 <= x < 45.0
	//Math.random()*45+1 -> 1.0 <= x < 46.0
	//(int)Math.random()*45+1 -> 1 <= x < 46

	int [] lotto = new int[6];
	//배열의 길이만큼 반복
	outer:for(int i = 0; i < lotto.length;) {
		//난수를 하나 뽑아 배열에 저장
		lotto[i] = (int)(Math.random()*45) + 1;
		
		//중복이 있는지 검사
		for(int j = 0; j < i; j++) {
			//같은게 있다면
			if(lotto[i] == lotto[j]) {
				//다시 뽑아야 한다
				continue outer;
			}
			System.out.print(lotto);
		}
	}
	
	
}
}