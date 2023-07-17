package ex16exception;

import java.io.IOException;

public class Ex01ExceptionBasic1 {

	public static void main(String[] args) {

		/*
		Syntax에러(구문에러)
		: 실행자체가 되지 않는 코드로 오류를 수정해야만 정상적으로 실행된다.
			즉 코드에 문법적인 오류가 발생되었음을 의미한다.
		*/
//		Int number = 10;
//		if(true);
//		{}
//		else
//		{}
		
		//위 코드를 정상적으로 수정하면 아래와 같다.
		int number = 10;
		if (true) {
			System.out.println("참이다.");
		}
		else {
			System.out.println("거짓이다.");
		}
		
		/*
		▲외부자원을 사용할 때 발생되는 예외 처리
		처리방법1] "예외던지기"를 수행한다.
			main메서드에서 throws IOExcption을 기술하면 해당 메서드 내에서 발생되는 예외를 무시하겠다는 의미가된다.
		
		처리방법2] 예외가 발생한 지점을 try~catch문으로 직접 감싸서 처리한다.
		*/
		System.out.println("문자하나를 입력하세요.");
		/*
		예외가 발생할 수 있는 지역을 try문으로 먼저 묶어준다.
		예외가 발생되면 JVM(자바가상머신)은 해당 예외에 관련된 객체를 만들어 프로그램쪽으로 전달한다.
		이때 catch절에서 예외객체를 잡아 주는 것을 "예외처리"라고 한다.
		만약 예외객체를 잡아주지 못하면 프로그램이 비정상적인 종료로 이어지게된다. 
		*/
		try {
			int iChar = System.in.read();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
