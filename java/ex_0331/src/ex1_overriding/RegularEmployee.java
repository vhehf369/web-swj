package ex1_overriding;

public class RegularEmployee extends Employee {
	int salary;   // 월급 필드

    // ★★★ 여기서 생성자 만들어야 함 ★★★
    public RegularEmployee(String name, int salary) {
        super(name);          // 부모(Employee)의 생성자 호출
        this.salary = salary; // 자기 필드에 값 넣기
    }

    // getpay() 오버라이딩 (월급 반환)
    @Override
    public int getpay() {
        return salary;
    }
}
