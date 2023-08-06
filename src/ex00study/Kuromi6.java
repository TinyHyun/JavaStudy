package ex00study;

public class Kuromi6 {

	public static void main(String[] args) {

		String[] strArr = new String[3];
		strArr[0] = "Java";
		strArr[1] = "Java";
		strArr[2] = new String("Java");
		
		System.out.printf("%b\n" , strArr[0]==strArr[1]);
		System.out.printf("%b\n" , strArr[0]==strArr[2]);
		System.out.printf("%b\n" , strArr[0].equals(strArr[2]));
		
		
		
		
		////////배열복사////////
		
		int[] oldIntArray = { 1, 2, 3 };
		int[] newIntArray = new int[5];
		
		for(int i=0 ; i<oldIntArray.length ; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		for(int i=0 ; i<newIntArray.length ; i++) {
			System.out.printf("%d, ", newIntArray[i]);  // => int[] 배열의 초기값은 0
		}
		System.out.println();
		
		
		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

		for(int i=0 ; i<newStrArray.length ; i++) {
			System.out.printf("%s, ", newStrArray[i]); // => String[] 배열의 초기값은 null
		}
		System.out.println();
	
		
		
		
		///////향상된 for문////////
		
		int[] scores = { 95, 71, 84, 93, 87 };
		
		int sum = 0;
		for(int score : scores) {
			sum = sum + score;
		}
		System.out.printf("점수 총합= %d\n" , sum);
		
		
		double avg = (double)sum / scores.length;
		System.out.printf("점수 평균: %.1f\n" , avg);
	
	
	
		//P.200 04번 문제
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };
		
		
		for(int i=0 ; i<array.length ; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		
		System.out.printf("max: %d", max);
	}

}





















