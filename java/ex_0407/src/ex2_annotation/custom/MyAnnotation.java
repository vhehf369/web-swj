package ex2_annotation.custom;

public class MyAnnotation {
	//@Retention : 어노테이션 정보를 언제까지 유지할 것인지 정한다
	//SOURCE : 소스코드에만 남기고 컴파일 후 사라진다.
	//CLASS : 클래스 파일에는 남지만 실행 중에는 못읽는다.
	//RUNTIME : 실행중에도 읽을 수 있다.

	@Target({TYPE,FIELD,TYPE_USE,METHOD})
	@Retention(RUNTIME)
	public @interface MyAnnotaion {
		
		//어노테이션도 값을 가질수 있다.
		String value(); //메서드처럼 보이지만 어노테이션 가지는 속성
		String name() default "홍길동";
		int age default 0;
	}
	import java.lang.annotation.Target;

	}
}
