package ex04controlstatement;

import java.io.IOException;

public class QuNumberYN {

	public static void main(String[] args) throws IOException {

		/* 
		 문제1) 하나의 문자를 입력받아 숫자인지 여부를 판단하는 프로그램을 삼항연산자를 이용하여 구현하시오. 
		 (System.in.read()를 사용하세요)
		*/
		System.out.print("문자를 입력하세요: ");
		int c = System.in.read();
		
		String str = (c >= '0' && c <= '9') ? "숫자입니다." : "숫자가아닙니다.";
		System.out.println(c+"은(는) "+ str);
		
	}

}
