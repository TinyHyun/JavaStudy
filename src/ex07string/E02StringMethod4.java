package ex07string;

public class E02StringMethod4 {

	public static void main(String[] args) {

		/*
		시나리오1] 주민등록번호를 이용하여 성별을 판단하는
		프로그램을 charAt()을 이용해서 작성하시오.
		190419-3000000 => 남자
		190419-4000000 => 여자
		*/
		String num = "190419-3000000";
		
		if(num.charAt(7)=='1' || num.charAt(7)=='3') {
			System.out.println("남자입니다.");
		}
		else if(num.charAt(7)=='2' || num.charAt(7)=='4') {
			System.out.println("여자입니다.");
		}
		else if(num.charAt(7)=='5' || num.charAt(7)=='6') {
			System.out.println("외국인입니다.");
		}
		else {
			System.out.println("주민번호를 잘못입력하셨습니다.");
		}
		
		
		
		System.out.println("\n========================================\n");
		
		/*
		시나리오2]주민등록번호로 성별을 구분하는 프로그램을 indexOf()를
		이용해서 작성하시오.
		*/
		String jumin = "190419-200000";
		int index = jumin.indexOf("-")+1; // 주민번호에 -다음으로 오는 인덱스의 숫자를 알기위해서 1을 더한다.
		
		if(jumin.charAt(index)=='1' || jumin.charAt(index)=='3') {
			System.out.println("남자입니다.");
		}
		else if(jumin.charAt(index)=='2' || jumin.charAt(index)=='4') {
			System.out.println("여자입니다.");
		}
		else if(jumin.charAt(index)=='5' || jumin.charAt(index)=='6') {
			System.out.println("외국인입니다.");
		}
		
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
		int filename = file.lastIndexOf(".")+1;
		String fileExt = file.substring(filename);
		System.out.println("파일확장자: "+ fileExt);
		
	}

}
