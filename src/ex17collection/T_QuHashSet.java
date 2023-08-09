package ex17collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

/*
문제2] QuHashSet.java 
컬렉션 set에 저장된 객체를 이름으로 검색하자. 
해당 정보가 있으면 해당 어벤져스의 정보를 출력하고 없으면 "해당 영웅은 없어요ㅜㅜ" 라는 메시지 출력해야 한다. 
검색 부분은 Iterator를 통해 구현하도록 한다.
set계열의 컬렉션은 기본적으로 중복저장을 허용하지 않는다. 
그러나 아래와 같이 새롭게 정의한 클래스에 대해서는 equals(), hashCode() 메소드를 적절히 오버라이딩 처리해야 
중복을 제거할 수 있다. 메소드 오버라이딩을 통해 hero4 는 입력되지 않도록 Avengers1 클래스를 업데이트 하시오.

실행결과]
중복 제거용 equals()메소드 호출
[최초 전체 정보출력]
Avengers1 [본명=스티브로져스, 닉네임=캡틴아메리카, 능력=비브라늄 방패]
Avengers1 [본명=브루스배너, 닉네임=헐크, 능력=강한피부&점프]
Avengers1 [본명=토니스타크, 닉네임=아이언맨, 능력=Mark-48 수트]
검색할 이름을 입력하세욤:브루스배너
Avengers1 [본명=브루스배너, 닉네임=헐크, 능력=강한피부&점프]
요청하신 정보를 찾았습니다
*/


class Avengers1 {
	String name;
	String heroName;
	String weapon;

	public Avengers1(String name, String heroName, String weapon) {
		this.name = name;
		this.heroName = heroName;
		this.weapon = weapon;
	}

	@Override
	public String toString() {
		return "Avengers1 [본명=" + name + ", 닉네임=" + heroName + ", "
				+ "능력=" + weapon +"]";
	}

	@Override
	public int hashCode() {
		//방법1: 멤버변수의 hash값을 얻어온 후 적당히 연산한다.
		int retCode1 = 
				this.name.hashCode() + this.heroName.hashCode() + this.weapon.hashCode();
		
		//방법2: Objects 클래스의 hash() 메서드를 사용한다.
		int retCode2 = Objects.hash(this.name, this.heroName, this.weapon);
	
		return retCode1;
	}
	
	@Override
	public boolean equals(Object obj) {
		//매개변수로 전달된 객체를 다운캐스팅 한다.
		Avengers1 av = (Avengers1)obj;
		if(av.name.equals(this.name) && av.heroName.equals(this.heroName)
				&& av.weapon.equals(this.weapon)) {
			//3개의 멤버변수를 비교하여 동일한 객체가 발견되면 true를 반환한다. 그러면 set에는 저장되지 않는다.
			return true;
		}
		else {
			//다른 객체라면 false를 반환하고 set에 저장된다.
			return false;
		}
	}
}


public class T_QuHashSet {

	public static void main(String[] args) {

		HashSet<Avengers1> set = new HashSet<Avengers1>();

		Avengers1 hero1 = new Avengers1("토니스타크", "아이언맨", "Mark-48 수트");
		Avengers1 hero2 = new Avengers1("스티브로져스", "캡틴아메리카", "비브라늄 방패");
		Avengers1 hero3 = new Avengers1("브루스배너", "헐크", "강한피부&점프");
		Avengers1 hero4 = new Avengers1("토니스타크", "아이언맨", "Mark-48 수트");
		
		set.add(hero1);
		set.add(hero2);
		set.add(hero3);
		set.add(hero4);		 

		System.out.println("[최초 전체 정보출력]");
		for(Avengers1 av : set) {
			System.out.println(av.toString());			
		}
		
		System.out.print("검색할 이름을 입력하세요: ");
		Scanner scanner = new Scanner(System.in);
		String sName = scanner.next();
		
		//검색 결과 확인용 boolean문
		boolean isFind = false;
		
		//이터레이터 객체 생성
		Iterator<Avengers1> it = set.iterator();
		//반환할 객체가 있는지 확인한다.
		while(it.hasNext()) {
			/*
			이터레이터는 next() 메서드를 통해 객체를 출력한다.
			한번 호출할때마다 다음 객체로 이동하게 되므로 루프내에서 한번 이상 호출하면
			예외가 발생할 수 있어 반드시 아래와 같이 사용해야한다. 
			*/
			Avengers1 av = it.next();
			//해당 루프의 객체와 이름을 비교한다.
			if(sName.equals(av.name)){
				System.out.println(av);
				isFind = true;
			}
		}
		
		if(isFind == false) {
			System.out.println("해당 영웅은 없어요..ㅜㅜ");
		}
		
		
	}
}


