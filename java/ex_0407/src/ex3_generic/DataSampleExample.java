package ex3_generic;

public class DataSampleExample {
	public static void main(String[] args) {
		//데이터리스트 객체 만들기
		//제네릭 타입에 전달할수 있는것은 클래스밖에 안된다.
		DataList<Integer>  list = new DataList();
		
		list.add(10);
//		list.add("문자열");
//		list.add(3.14);
		
		//배열에 들어있는 내용을 출력
//		for(int i = 0; i < list.size(); i++) {
//			Object data = list.get(i);
//			
//			if(data instanceof Integer) {
//				System.out.println("정수 : " + (int)data);
//			} else if (data instanceof Double) {
//				System.out.println("실수 : " + (double)data);
//			} else if (data instanceof String) {
//				System.out.println("문자열 : " + (String)data);
//			}
//		}
		
		//데이터 출력
		int sum = 0;
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		
		System.out.println(sum);
		
		//실수타입 객체를 만들고 데이터 3개 넣은 후 출력하기
	}
}
