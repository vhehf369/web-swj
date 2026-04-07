package ex3_generic;

public T get(int index) {
	return fruits[index];
}

public int size() {
	return size;
}

public class FruitsExample {
	public static void main(String[] args) {
		FruitBox<Fruit> box = new FruitBox<>();
		
		//제네릭 + 다형성
		box.add(new Fruit());
		box.add(new Apple());
		box.add(new Banana());
	}
}


