package ex07string;

public class E02StringMethod4 {

	public static void main(String[] args) {

		/*
		시나리오1] 주민등록번호를 이용하여 성별을 판단하는
		프로그램을 charAt()을 이용해서 작성하시오.
		190419-3000000 => 남자
		190419-4000000 => 여자
		*/
		String num1 = "190419-3000000";
		String num2 = "190419-4000000";
		
		
		
		System.out.println("\n========================================\n");
		
		/*
		시나리오2]주민등록번호로 성별을 구분하는 프로그램을 indexOf()를
		이용해서 작성하시오.
		*/
		
		
		System.out.println("\n========================================\n");
		
		/*
		시나리오3] 해당 문자열이 이메일 형식인지 검사하는
		프로그램을 contains()를 이용해서 작성하시오.
		hong@daum.net => 이메일형식임
		not@naver => 이메일형식이아님
		*/
		String email1 = "hong@daum.net";
		String email2 = "not@naver";
		
		if(email1.contains("@") && email1.contains(".")) {
			System.out.println("email1는 이메일 형식임");
		}
		else {
			System.out.println("email1는 이메일 형식이 아님");
		}
		
		if(email2.contains("@") && email2.contains(".")) {
			System.out.println("email2는 이메일 형식임");
		}
		else {
			System.out.println("email2는 이메일 형식이 아님");
		}
		
		
		
		System.out.println("\n========================================\n");
		
		/*
		시나리오4] 다음 파일명에서 확장자를 잘라내는 프로그램을
		작성하시오. 
		파일명 : my.file.images.jpg
		*/
		String file = "my.file.images.jpg";
		
		
	}

}
