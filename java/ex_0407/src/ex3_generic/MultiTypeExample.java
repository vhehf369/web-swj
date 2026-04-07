package ex3_generic;

//제네릭타입은 두개 이상도 작성할수 있다.
class pairBox<T,U>{
	private T first;
	private U second;
	
	public void set(T first, U second) {
		this.first = first;
		this.second = second;
	}
	
	//getter 만들기
	public T getFirst() {
		return first;
	}
}
public class MultiTypeExample {
	public static void main(String[] args) {
		PairBox<String, Integer> box1 = new PairBox();
		box1.set("홍길동", 20);
		System.out.println(box1.getFirst());
		System.out.println(box1.getSecond());
		
		PairBox<String,Double> box2 = new PairBox();
		box2.set
	}
}
