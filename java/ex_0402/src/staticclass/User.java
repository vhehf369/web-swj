package staticclass;
//Bilder 패턴
//객체를 만들때 생성과정을 단계적으로 분리하는 설계 방식
public class User {
	String id;
	String password;
	String name;
	String email;
	int age;
	String address;
	String phone;
}

private 



		//객체 생성 책임 분리
		//Builder가 값을 하나씩 모으고
		//마지막에 build()메서드를 통해서 실제 객체를 만드는 방식
	public Bulder id(String id) {
		this.id = id;
		return.this; //현재 Builder 객체를 그대로 반환
	}
	
	public Bulder password(int password) {
		this.password = password;
		return.this;
	}
	
	public Bulder name(String name) {
		this.name = name;
		return.this;
	}
	
	public Bulder id(String email) {
		this.email = email;
		return.this;
	}
	
	public Bulder age(int age) {
		this.age = age;
		return.this;
	}
	
	public Bulder address(String address) {
		this.address = address;
		return.this;
	}
	
	public Bulder phone(String phone) {
		this.phone = phone;
		return.this;
	}