package ex04controlstatement;

public class QuIfElseChange {

	public static void main(String[] args) {

		/* 문제3) 아래 코드의 삼항연산자를 if~else문으로 변경하시오. 단, 실행결과는 동일해야 합니다. */
		int num1=50, num2=100;
		int big, diff;

		big = (num1>num2)? num1:num2; //조건?참:거짓;
		System.out.println(big);

		diff = (num1>num2)? num1-num2: num2-num1;
		System.out.println(diff); 

	}

}
