package ex00study;

public class Kuromi {
	
	public static void main(String[] args) {
		
		//자동형변환
		byte byteValue = 10;
		int intValue = (int)byteValue;
		System.out.println("intValue: " + intValue);
		
		char charValue = '가';
		intValue = (int)charValue;
		System.out.println("가의 유니코드: " + intValue);
		
		intValue = 50;
		long longValue = (long)intValue;
		System.out.println("longValue: "+ longValue);
		
		longValue = 100;
		float floatValue = (float)longValue;
		System.out.println("floatValue: "+ floatValue);
	
		floatValue = 100.5F;
		double doubleValue = (double)floatValue;
		System.out.println("doubleValue: "+ doubleValue);
		
		
		//강제형변환
		int intValue2 = 44032;
		char charValue2 = (char)intValue2;
		System.out.println("charValue2: " + charValue2);
		
		long longValue2 = 500;
		intValue2 = (int)longValue2;
		System.out.println("intValue2: " + intValue2);
		
		double doubleValue2 = 3.14;
		intValue2 = (int)doubleValue2;
		System.out.printf("%d, %.1f\n", intValue2, doubleValue2);
		
		
		//정수 타입의 연산
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		long result = value1 + value2 + value3;
		System.out.printf("%d\n", result);
		
		int n = 3;
		String s = String.valueOf(n); // 3 -> "3"
	}
}






































