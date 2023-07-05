package ex04controlstatement;

public class Qu3Or7Sum {

	public static void main(String[] args) {

		/*
		문제4) 1~100까지의 숫자중 3의배수 이거나 7의배수인 숫자의 합을 구하는 프로그램을 while문으로 작성하시오. 
		단, 3과 7의 공배수인 경우 합에서 제외해야 한다. 
		출력의 결과는 누적되는 모든 수를 콘솔에 print한다 
		*/
		
		//누적합을 저장할 변수
		int sum = 0;
		//변수 i를 1로 초기화
		int i = 1;
		
		//1~100까지 반복
		while(i<=100) {
			//i가 3의 배수 이거나 7의 배수일 때
			if(i%3==0 || i%7==0) {
				//3과 7의 공배수를 제외
				if(i%(3*7) != 0) {
					//i의 값을 sum에 누적해서 더한다.
					sum += i;
					//i의 값을 출력한다.
					System.out.print(i);
					//i가 99보다 작을때까지 + 기호를 써준다. 가독성을 위해서
					if(i<99) {
						System.out.print(" + ");
					}
				}
			}
			//i를 1씩 증가시킨다.
			i++;
		}
		System.out.print("결과: "+ sum);
	}

}
