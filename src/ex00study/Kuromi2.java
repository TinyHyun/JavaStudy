package ex00study;

public class Kuromi2 {

	public static void main(String[] args) {

		String name1 = "테스트";
		String name2 = "테스트";
		
		if(name1 == name2) {
			System.out.println("같다.");
		}
		else {
			System.out.println("다르다");
		}
		
		String name3 = new String("테스트");
		String name4 = new String("테스트");
		
		if(name3 == name4) {
			System.out.println("같다");
		}
		else {
			System.out.println("다르다");
		}
		
		if(name1 == name3) {
			System.out.println("같다.");
		}
		else {
			System.out.println("다르다.");
		}
		
		boolean result = name1.equals(name4);
		System.out.println(result);
	}

}
