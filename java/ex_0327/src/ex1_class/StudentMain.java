package ex1_class;

public class StudentMain {
	public static void main(String[] args) {
		Student minsu = new Student();
		minsu.name = "민수";
		minsu.age = 20;
		minsu.score = 70;
		
		Student gildong = new Student();
		gildong.name = "길동";
		gildong.age = 27;
		gildong.score = 80;
		
		Student younghee = new Student();
		
		younghee.name = "영희";
		younghee.age = 30;
		younghee.score = 60;
		
		//배열에는 같은 타입의 데이터만 넣을 수 있다.
		//데이터의 타입은 배열 앞에 명시한다.
		Student[] students = {minsu, gildong, younghee};
		
		System.out.println(students[0].name);
		
		//배열에 들어있는 내용을 모두 출력하기
		for(int i = 0; i < students.length; i++) {
			System.out.println("이름 : " + students[i].name);
			System.out.println("나이 : " + students[i].age);
			System.out.println("점수 : " + students[i].score);
		}
	}
}
