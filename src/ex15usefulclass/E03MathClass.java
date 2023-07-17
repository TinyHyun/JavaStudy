package ex15usefulclass;

/*
Java의 규칙: java.lang 패키지 하위의 모든 클래스는 자동으로 import된다.
			또한 정의하는 모든 클래스는 object를 상속받게 되어있다.
			따라서 java.lang패키지의 모든 클래스는 별도의 선언없이 사용할 수 있고,
			object에서 제공하는 메서드는 오버라이딩이 가능하다.
*/
import java.lang.*; // => 생략가능

public class E03MathClass extends Object { // => extends 생략가능 

	/*
	Math클래스
	- java.lang 패키지에 정의된 클래스
	- 수학과 관련된 일련의 작업들을 처리하는 메서드가 정의되어있다.
	- 메서드는 static으로 선언되어 있어 인스턴스 생성없이 클래스명으로 호출 가능하다.
	*/
	public static void main(String[] args) {

		System.out.println("원주율: "+ Math.PI);
		
		float f = -3.14f;
		double d = -100.9;
		int num = -10;
		
		System.out.println("### 절대값 ###");
		System.out.println("Math.abs: "+ Math.abs(f));
		System.out.println("Math.abs: "+ Math.abs(d));
		System.out.println("Math.abs: "+ Math.abs(num));
		
		System.out.println("## 올림 ###");
		//소수점의 숫자가 크든 작든 무조건 올림 처럼 한다.
		System.out.println("Math.ceil: "+ Math.ceil(3.4));//4
		System.out.println("Math.ceil: "+ Math.ceil(-3.4));//-3
		System.out.println("Math.ceil: "+ Math.ceil(3.9));//4
		
		System.out.println("### 내림 ###");
		//무조건 내림 처리한다.
		System.out.println("Math.floor: "+ Math.floor(3.4));//3
		System.out.println("Math.floor: "+ Math.floor(-3.4));//-4
		System.out.println("Math.floor: "+ Math.floor(3.9));//3
		
		System.out.println("### 반올림 ###");
		//round의 경우 가까운 정수쪽으로 올림/버림을 결정한다. x.5이상이면 올림처리, 미만이면 버림처리한다.
		System.out.println("Math.round: "+ Math.round(3.49999));//3 => 버림처리
		System.out.println("Math.round: "+ Math.round(3.54444));//4 => 올림처리
		
		//음수인 경우 헷갈리면 그림을 그려서 생각하자
		System.out.println("Math.round: "+ Math.round(-1.5));//-1
		System.out.println("Math.round: "+ Math.round(-1.6));//-2
		System.out.println("Math.round: "+ Math.round(-3.5));//-3
		System.out.println("Math.round: "+ Math.round(-3.51));//-4
		
		System.out.println("### 최대/최소 ###");
		System.out.println("Math.max: "+ Math.max(100, 99));
		System.out.println("Math.min: "+ Math.min(100, 99));
		
		System.out.println("### 난수 ###");
		//0~1사이의 실수값을 반환한다. 따라서 정수값을 만들고 싶을 때 특정한 값을 곱해주면된다.
		System.out.println((int)(Math.random()*45)+1);
		
		System.out.println("### 거듭제곱 ###");
		System.out.println("2의 10승은? "+ Math.pow(2, 10));
	}

}
