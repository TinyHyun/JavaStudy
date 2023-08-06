package ex00study;

public class Kuromi3 {

	public static void main(String[] args) {

		int[] scores = { 83, 90, 87 };
		
		System.out.println("scores[0]: " + scores[0]);
		System.out.println("scores[1]: " + scores[1]);
		System.out.println("scores[2]: " + scores[2]);
	
		
		int sum = 0;
		for(int i=0 ; i<3 ; i++) {
			sum += scores[i];
		}
		System.out.println("총합: "+ sum);
		
		double avg = (double)sum / 3;
		System.out.println("평균: " + avg);
		
		int[] scores1;
		scores1 = new int[] { 83, 90, 87 };
		int sum1 = 0;
		for(int i=0 ; i<3; i++) {
			sum1 += scores1[i];
		}
		System.out.println("총합: "+ sum1);
		
		int sum2 = add(new int[] { 83, 90, 87 });
		System.out.println("총합: "+ sum2);
		System.out.println();

	}

	public static int add(int[] scores1) {
		int sum2 = 0;
		for(int i=0 ; i<3; i++) {
			sum2 += scores1[i];
		}
		return sum2;
	}

}
