package ex04controlstatement;

public class QuPyramid04 {

	public static void main(String[] args) {

		/*
		 문제4) 다음과 같은 모양을 출력하는 프로그램을 for문으로 작성하시오.
		 	*
			* *
			* * *
			* * * *
			* * * * *
			* * * * 
			* * * 
			* * 
			* 
		*/
		
		//가장 많이 돌출된 부분을 상수로 지정
		final int MAX_NUM = 5;
		//전체 반복횟수는 가장많이 돌출된 부분에서 1을 뺀다.
		int repeatNum = MAX_NUM * 2 - 1;
		//감소 횟수
		int descNum = -1;
		
		//앞에서 구한 전체 반복 횟수만큼 반복한다.
		for(int i=1 ; i<=repeatNum ; i++) {
			//최대값까지는 증가시킨다.
			if(i <= MAX_NUM) {
				//증가한다.
				for(int j=1 ; j<=i ; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			else {
				//그 다음부터는 감소한다.
				descNum = MAX_NUM - (i - MAX_NUM);
				for(int j=1 ; j<=descNum ; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		System.out.println("\n===============================\n");
		
		for(int i=1 ; i<=5 ; i++) {
			for(int j=1 ; j<=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=4 ; i>0 ; i--) {
			for(int j=1 ; j<=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
