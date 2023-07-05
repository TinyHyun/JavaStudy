package ex04controlstatement;

public class QuPyramid01 {

	public static void main(String[] args) {

		/*
		문제1) 다음과 같은 모양을 출력하는 프로그램을 while문으로 작성하시오. 
			*
			* *
			* * *
			* * * *
			* * * * *
		*/
		
		//i를 1로 초기화
		int i = 1;
		//i를 5번 반복한다.
		while(i<=5) {
			//j를 1로 초기화
			int j = 1;
			//j가 i보다 작거나 같을 때 까지 반복
			while(j<=i) {
				//j가 i보닥 작거나 같을 때 출력
				System.out.print("*");
				//출력 후 j를 1씩 증가시킨다.
				j++;
			}
			//줄바꿈 처리
			System.out.println();
			//i를 1씩증가시킨다.
			i++;
		}
	}

}
