package ex06array;

public class E06ArrayInit {

	public static void main(String[] args) {

		/*
		1차원, 2차원 배열은 크기만 지정된 경우에는 전체 원소가 0으로 초기화된다.
		double타입인 경우 0.0으로 초기화된다.
		*/
		System.out.println("배열 선언 후 초기화 하지 않은 상태");
		
		int[] arr = new int[3];
		System.out.println("arr[0]= "+ arr[0]); //0출력
		
		int[][] arr2 = new int[3][4];
		System.out.println("arr2[0][0]= "+ arr2[0][0]); //0출력
		
		double[][] arr3 = new double[3][4];
		System.out.println("arr3[0][0]= "+ arr3[0][0]); //0.0출력
		
		
	/////////////////////////////////////////////////////////////////////////	
		
		
		/*
		1차원 배열의 경우 원소의 갯수에 의해 전체 크기가 결정된다.
		2차월 배열도 마찬가지이나 다른점이라면 가장 큰 행과 열을 통해 크기가 결정되므로 빈 공강이 발생할 수 있다.
		이때 빈공간은 0으로 채울 수 없으므로 null로 채워진다.
		즉, 배열의 크기에서 제외되는 부분이 발생한다. 
		*/
		System.out.println("배열 선언과 동시에 초기화 한 상태");
		
		int[] arrDim = {1,2,3};
		System.out.println("arrDim[0]= "+ arrDim[0]); //1출력
		
		int[][] arr2Dim = {
				{1}, // => [0][1]의 자리는 null로 초기화된다.
				{2,3}
		};
		System.out.println("arr2Dim[0][0]+ "+ arr2Dim[0][0]); //1출력
		System.out.println("arr2Dim[0][1]+ "+ arr2Dim[0][1]); //null로 초기화되므로 출력시 예외가 발생한다.
	}

}
