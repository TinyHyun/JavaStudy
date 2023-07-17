package ex16exception;

import java.util.InputMismatchException;

public class Ex02PreDefineException1 {

	public static void main(String[] args) {

		System.out.println("### ArrayIndexOutOfBoundsException ###");
		
		int[] intArr = new int[2];
		try {
			intArr[0] = 100;
			System.out.println("0번방은: "+ intArr[0]);
			
			intArr[1] = 200;
			System.out.println("1번방은: "+ intArr[1]);
			
			/*
			예외가 발생되는 지점
			해당 코드가 실행될 때 예외가 발생하게 되고 JVM이 예외객체를 생성해서 프로그램으로 던진다.
			*/
			intArr[2] = 300;
			System.out.println("앗 이방은?! "+ intArr[2]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			/*
			JVM이 throw한 예외객체를 catch절에서 잡아 처리한다.
			그러면 예외가 발생되어도 프로그램이 실행은 유지된다.
			*/
			//예외메세지1: 개발자가 임의로 메세지를 출력한다.
			System.out.println("예외가 발생했어요");
			//예외메세지2: 간략한 설명을 출력한다.
			System.out.println("예외메세지: "+ e.getMessage());
			//예외메세지3: 예외에 대한 디테일한 설명을 출력한다.
			e.printStackTrace(); // => 가장 많이 사용됨
		}
		
		System.out.println("0번방 재출력: "+ intArr[0]);
		System.out.println("### ArrayIndexOutOfBoundsException 발생 후 ###");
	}
	//end of main

}
