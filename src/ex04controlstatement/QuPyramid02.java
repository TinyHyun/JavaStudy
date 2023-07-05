package ex04controlstatement;

public class QuPyramid02 {

	public static void main(String[] args) {

		/*
		 문제2) 다음과 같은 모양을 출력하는 프로그램을 do~while문으로 작성하시오.
		 	* * * * *
			* * * *
			* * *
			* *
			*
		*/
		
		System.out.println("Me");
		int a1 = 5;
		do {
			int b = 5;
			do {
				if(a1 >= b) {
					System.out.print("*");
				}
				b--;
			}while(b>=1);
			a1--;
			System.out.println();
		}while(a1>=1);
		
		
		
		System.out.println("T");
		int i = 5;
		do {
			int j = 1;
			do {
				System.out.print("*");
				j++;
			}while(j <= i);
			System.out.println();
			i--;
		}while(i >= 1);
	}

}
