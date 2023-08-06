package ex00study;

import java.util.Scanner;

public class Kuromi1 {

	public static void main(String[] args) {

		//P.160 02번 문제
//		
//		int sum = 0;
//		
//		for(int i=1 ; i<=100 ; i++) {
//			if(i%3 == 0) {
//				sum += i;
//			}
//		}
//		System.out.println("1~100까지의 수 중 3의 배수의 합: " + sum);
	
		
		///////////////////////////////////////////////////////////////////
		
		
		//P.161 03번 문제
//		while(true) {
//			int num1 = (int)(Math.random() * 6) + 1;
//			int num2 = (int)(Math.random() * 6) + 1;
//		
//			System.out.println("(" + num1 + ", " + num2 + ")");
//			System.out.printf("(%d, %d)\n", num1, num2);
//		
//			if((num1 + num2) == 5) {
//				break;
//			}
//		}
		
		
		///////////////////////////////////////////////////////////////////
		
		
		//P.161 04번 문제
//		for(int x=1 ; x<=10 ; x++) {
//			for(int y=1 ; y<=10 ; y++) {
//				if((4 * x)+ (6 * y) == 60) {
//					System.out.printf("(%d, %d)\n", x, y);
//				}
//			}
//		}
		
	
		///////////////////////////////////////////////////////////////////
		
		
		//P.161 05번 문제
//		for(int x=1 ; x<=5 ; x++) {
//			for(int y=1 ; y<=5 ; y++) {
//				if(x >= y) {
//					System.out.printf("*");
//				}
//				else {
//					System.out.printf(" ");
//				}
//			}
//			System.out.println();
//		}
		
		
		///////////////////////////////////////////////////////////////////
		
		
		//P.161 06번 문제
//		for(int x=1 ; x<=5 ; x++) {
//			for(int y=5 ; y>0 ; y--) {
//				if(x < y) {
//					System.out.printf(" ");
//				}
//				else{
//					System.out.printf("*");
//				}
//			}
//			System.out.println();
//		}
		
		
		///////////////////////////////////////////////////////////////////
		
		
		//P.161 07번 문제
//		boolean run = true;
//		int balance = 0;
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		while(run) {
//			System.out.println("-------------------------------------");
//			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
//			System.out.println("-------------------------------------");
//			System.out.print("선택 > ");
//			
//			int putNum = Integer.parseInt(scanner.nextLine());
//			
//			switch(putNum) {
//			case 1:
//				balance += Integer.parseInt(scanner.nextLine());
//				System.out.println("예금액 > " + balance);
//				break;
//			case 2:
//				balance -= Integer.parseInt(scanner.nextLine());
//				System.out.println("출금액 > " + balance);
//				break;
//			case 3:
//				System.out.println("잔고 > " + balance);
//				break;
//			case 4:
//				run = false;
//				break;
//			}
//			
//		}
//		System.out.println("프로그램 종료");
	}

}



























