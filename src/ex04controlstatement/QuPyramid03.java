package ex04controlstatement;

public class QuPyramid03 {

	public static void main(String[] args) {

		/*
		 문제3) 다음과 같은 모양을 출력하는 프로그램을 for문으로 작성하시오.
				 	 *
			       * * *
			     * * * * *
			   * * * * * * *
			 * * * * * * * * *
		*/
		int num = 5;
		
		for(int i=0 ; i<num ; i++) {
			//공백을 주기위한 반복문
			for(int j=1 ; j<=num-i ; j++) {
				System.out.print(" ");
			}
			//*을 출력하기 위한 반복문
			for(int k=0 ; k<i*2+1 ; k++) { // => 1개 3개 5개 이렇게 출력해야해서 i*2+1을 한다.
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
