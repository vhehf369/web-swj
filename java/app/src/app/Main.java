package app;

	import java.util.Scanner;
	import member.Member;
	import service.MemberService;

	public class Main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // 사용자 입력 받기
	        System.out.print("이름을 입력하세요: ");
	        String name = sc.nextLine();

	        System.out.print("나이를 입력하세요: ");
	        int age = sc.nextInt();

	        // Member 객체 생성
	        Member member = new Member(name, age);

	        // MemberService 객체 생성 후 회원 등록
	        MemberService service = new MemberService();
	        service.register(member);

	        sc.close();
	    }
	}
