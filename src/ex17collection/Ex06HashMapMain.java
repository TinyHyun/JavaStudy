package ex17collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
HashMap <K, V>
: Map<T> 인터페이스를 구현한 컬렉션
- Key, Value의 쌍으로 객체를 저장한다.
- Key값은 중복될 수 없다. 만약 중복되면 기존의 데이터를 덮어쓰기한다.
- Key값으로 검색되므로 다른 컬렉션에 비해 속도가 빠르다.
- 저장 순서는 유지되지 않는다.
*/

public class Ex06HashMapMain {

	public static void main(String[] args) {

		//Map컬렉션 생성. Key와 Value를 모두 String으로 선언
		HashMap<String, String> map = new HashMap<String, String>();
		
		/*
		객체저장
		: 객체저장시 기존에 저장된 동일한 Key값이 존재하면 저장된 객체가 반환된다.
		만약 처음 입력이라면 null을 반환한다.
		*/
		System.out.println("name이라는 키값으로 저장된 이전의 값: "+ map.put("name", "홍길동"));
	
		int number = 20;
		//int형은 String으로 변환할 수 없으므로 타입에러가 발생된다.
		//map.put("age", number); => 에러발생
		//정수는 아래와 같이 문자열로 변경한 후 저장할 수 있다.
		map.put("age", String.valueOf(number));
		map.put("gender", "남자");
		map.put("address", "가산디지털단지");
		//현재까지 4개의 데이터가 저장된다.
		System.out.println("저장된 객체수: " + map.size());
		
		
		/*
		중복저장
		: 기존에 입력된 Key값 name이 이미 있으므로 "홍길동"이 반환된다.
		기존의 값은 "최길동"으로 수정된다.
		*/
		System.out.println("name이라는 키값으로 저장된 이전의 값: "+ map.put("name", "최길동")); //덮어씀
		//중복 저장되므로 4개가 출력된다.
		System.out.println("키값으로 중복 저장 후 객체수: "+ map.size());
	
		/*
		출력하기
			1. 키 값을 알고있을 때
			: get(Key값)으로 출력한다.
		*/
		System.out.println("키값을 알때: "+ map.get("name"));
	
	
		/*
			2. 키 값을 모를 때(혹은 너무 많아 명시하기 힘들 때)
			: KeySet()을 통해 전체 Key를 Set컬렉션으로 얻어온다.
			해당 반환값을 확장 for문을 통해 반복하고, 이를 통해 Value를 추출할 수 있다.
		*/
		Set<String> keys = map.keySet();
		System.out.println("[확장 for문 적용]");
		for(String key : keys) {
			//get(Key값)을 통해 Value를 출력한다.
			String value = map.get(key);
			System.out.println(String.format("%s:%s", key, value));
		}
		
		/*
			3. 이터레이터를 통한 출력
			: 이터레이터를 통해 출력할때도 KeySet()을 통해 Key를 먼저 얻어온 후 반복출력한다.
		*/
		System.out.println("[이터레이터 사용하기]");
		//Map의 전체 Key를 얻어온 후
		Set<String> key2 = map.keySet();
		//Key를 통해 이터레이터를 생성
		Iterator<String> it = key2.iterator();
		//Key가 있는지 확인 후..
		while(it.hasNext()) {
			//존재하면 Key를 얻어온다.
			String key = it.next();
			//Key를 통해 value를 추출한다.
			String value = map.get(key);
			System.out.println(String.format("%s:%s", key, value));
		}
		
		/*
		value만 얻어와야 할때
		: values() 메서드를 통해 값을 추출할 수 있다.
		그리고 확장 for문을 통해 출력한다.
		*/
		System.out.println("[value 값들만 출력하기]");
		Collection<String> values = map.values();
		for(String value : values) {
			System.out.println(value);
		}
		
		/*
		존재 유무 확인
		: Map컬렉션은 Key와 Value가 있으므로 메서드도 2개로 나눠져있다.
		*/
		System.out.println(map.containsKey("name") ? "name키값 있다." : "name키값 없다.");
		System.out.println(map.containsKey("account") ? "account키값 있다." : "account키값 없다.");
		
		System.out.println(map.containsValue("남자") ? "남자 있다." : "남자 없다.");
		System.out.println(map.containsValue("여자") ? "여자 있다." : "여자 없다.");
		
		/*
		삭제
		: Key를 통해 삭제하고 삭제에 성공하면 해당 value가 반환된다.
		*/
		System.out.println("삭제된 객체: "+ map.remove("age"));
		System.out.println("[age 키값을 삭제 후 출력]");
		for(String key : keys) {
			System.out.println(String.format("%s:%s", key, map.get(key)));
		}
		
		/*
		전체삭제
		: removeAll()은 없고 clear()만 사용할 수 있다.
		*/
		map.clear();
		System.out.println("전체삭제 후 객체수: "+ map.size());
	}

}































