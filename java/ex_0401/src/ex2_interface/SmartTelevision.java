package ex2_interface;

//서도 다른 인터페이스에 정의된 추상메서드를 전부 구현해야 한다.
public class SmartTelevision implements RemoteControl, Searchable{

	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}
	
	@Override
	public void turnOn() {
		System.out.println("스마트tv를 켭니다.");	
	}
	
	@Override
	public void setVolume(int volume) {
		System.out.println("스마트TV 볼륨을 " + volume + "으로 설정합니다.");	
	}
}
