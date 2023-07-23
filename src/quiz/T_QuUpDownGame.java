package quiz;

import java.util.Scanner;

/*
게임설명 : 업다운게임을 메소드를 이용해 구현한다.
컴퓨터는 1~100사이의 숫자 하나를 생성한다.
총 시도횟수는 7번을 부여한다.
사용자는 7번의 시도안에 숫자를 맞춰야 한다.
사용자가 숫자를 입력했을때 컴퓨터는 높은지/낮은지 알려준다.
7번안에 맞추면 성공, 맞추지 못하면 실패라고 출력한다.
성공/실패 후 계속 할지를 물어보고 1이면 게임 재시작, 0이면 프로그램을 종료한다.
함수를 사용하여 구현한다.
무한루프에 빠지게 된다면 scan.nextLine()을 활용하여 버퍼에 남아있는 Enter키를 제거해주도록 하자.
*/

public class T_QuUpDownGame {

	public static void main(String[] args) {

		boolean gameCount = false;
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int comNum = (int)(Math.random() * 100) + 1;
			
			for(int i=1 ; i<=7 ; i++) {
				System.out.print("1~100까지의 정수를 입력하세요: ");
				int userNum = scan.nextInt();
				
				if(userNum < comNum) {
					System.out.println("Up");
				}
				else if(userNum > comNum) {
					System.out.println("Down");
				}
				else {
					System.out.println("일치합니다!");
					gameCount = true;
					break;
				}
			}
			
			if(gameCount == false) {
				System.out.println("실패");
			}
			
			while(true) {
				System.out.println("==========================");
				System.out.print("게임을 재시작 하시겠습니까? 게임재시작(1), 게임종료(0): ");
				
				int reStart = scan.nextInt();
				
				if(reStart == 0) {
					System.out.println("게임 종료");
					return;
				}
				else if(reStart == 1) {
					System.out.println("게임 재시작");
					break;
				}
				else {
					System.out.println("잘못입력함");
				}
				scan.nextLine();
			}
		}
		
	}

}
