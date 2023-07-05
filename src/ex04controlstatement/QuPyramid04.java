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
		
		for(int i=1 ; i<=5 ; i++) {
			for(int o=1 ; o<=i ;o++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
