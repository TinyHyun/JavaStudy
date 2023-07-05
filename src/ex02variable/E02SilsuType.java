package ex02variable;

public class E02SilsuType {

	public static void main(String[] args) {
		
		/*
		실수자료형
		- 정수형보다는 실수형이 더 큰 자료형이다. 0과 1사이에 무수히 많은 실수가 존재하기 떄문이다.
		- 따라서 long(정수형)과 float(실수형)을 연산하면 float의 결과가 나오게 된다. 
		*/
		long long1 = 100;
		float float1 = 200;
		//long + float = float타입의 결과 출력
		float result1 = long1 + float1;
		//float타입으로 300.0의 결과가 출력된다. ≠ 3000
		System.out.println("long1 + float1 = "+ result1); 
		
		/*
		float(실수)와 long(정수형)의 연산결과를 long형으로 받고 싶다면...
		방법1 : float를 long으로 강제형변환 후 연산한다.
		방법2 : 계산결과 전체를 long으로 강제형변환 한다. 
		*/
		long result2 = long1 + (long)float1;
		System.out.println("형변환 후 연산 = "+ result2);
		
		long result3 = (long)(long1 + float1);
		System.out.println("계산 후 형변환 = "+ result3);
		
		/*
		- 실수형의 기본은 double이다.
		- 소수점이 있는 데이터를 컴파일러는 무조건 double로 인식한다.
		- 단, 소수점이 없는 데이터는 float에 대입할 수 있다.
		- 소수점이 있는 데이터는 float에 대입하려면 접미사 F(혹은 f)를 붙여야한다.
		- 형변환 후 대입도 가능하지만 권장하지 않는다.
		*/
		float f3 = 100;
//		float f4 = 3.14; => 3.14자체를 double로 인식하기 때문에 에러발생!
		float f4 = (float)3.14;  //강제형변환 후 대입은 권장하지 않는다.
		System.out.println("f4 = "+ f4);
		
		//접미사를 통해 float형 자료임을 명시한다. (권장사항)
		float f5 = 3.14F;
		System.out.println("f5 = "+ f5);
		
		//float + float = float타입의 결과 출력. 기본규칙을 따른다.
		float f6 = f3 + f4;
		System.out.println("f6 = "+ f6);
		
		//float + double = double타입의 결과 출력. double이 float보다 크다.
		double d1 = 3.14;
		double d2 = f6 + d1;
		System.out.println("d2 = "+ d2);
		/*
		CPU는 실수 계산에 기본적인 오차를 가지고 있다.
		이는 Java의 문제가 아니라 컴퓨터 자체의 문제이므로 정확한 계산을 위해서는 약간의 보정을 필요로 한다. 
		*/
	}

}
