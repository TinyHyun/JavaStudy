package ex06array;

import java.util.Scanner;

/*
문제2) 파일명 : QuArray1To10.java
다음 절차에 따라 프로그램을 작성하시오.
1. 크기가 10인 정수타입의 배열을 선언한다.
2. 반복문을 이용하여 배열을 채운다. 
	이때 배열은 1,2,3,4....순서대로 채운다.
3. 2번에서 채운 배열을 출력한다.
4. 위에서 채운 배열의 첫번째 값에서 마지막값까지 누적해서 더한다.
5. 누적해서 더한 값을 출력한다. 

실행결과]
초기화된 배열 요소
1 2 3 4 5 6 7 8 9 10 

배열전체요소의합:55
*/

public class T_QuArray1To10 {

	public static void main(String[] args) {

		int[] arr1 = new int[10];
		int[] arr2 = new int[10];
		
		Scanner scanner = new Scanner(System.in);
		
		//배열의 첫번째 인덱스와 마지막 인덱스를 지정한다.
		int indexStart = 0;
		//배열의 크기가 변경될 수 있으므로 length를 사용한다.
		int indexEnd = arr2.length - 1; 
		
		//배열의 크기만큼 반복해서 입력받는다.
		for (int i=0 ; i<arr1.length ; i++) {
			System.out.print("정수입력: ");
			int inputNum = scanner.nextInt();
			
			//첫번째 배열은 입력한 순서대로 채워준다.
			arr1[i] = inputNum;
			
			//두번째 배열은 홀,짝을 구분해서 앞,뒤로 채운다.
			if (inputNum % 2 == 0) {
				//짝수인 경우 뒤에서부터 채워준다.
				arr2[indexEnd] = inputNum;
				//인덱스를 1차감해서 9,8,7...과 같이 처리한다.
				indexEnd--;
			}
			else {
				//홀수인 경우 앞에서부터 채워준다.
				//후위연산하면 배열에 먼저 적용된 후에 증가되므로 한 줄로 입력과 증가를 처리할 수 있다.
				arr2[indexStart++] = inputNum;
			}
		}
		/*
		증감연산자는 변수 앞에 위치할 결우 해당 변수의 값이 먼저 변경된다.
		하지만 뒤에 위치할 경우 다른 코드가 먼저 실행된 후 변수의 값이 변경된다.
		*/
		
		//첫번째 배열
		for (int i=0 ; i<arr1.length ; i++) {
			System.out.print(arr1[i] + " ");
		}
		//배열 출력 후 줄바꿈 해준다.
		System.out.println();
		
		//두번째 배열
		for(int a : arr2) {
			System.out.print(a + " ");
		}
	}

}
