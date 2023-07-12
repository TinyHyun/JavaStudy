package ex12inheritance;

/*
문제4) QuRing1Make.java
다음 Point1클래스를 이용하여 다음 문제를 해결하시오.
해당 문제는 상속(Inheritance)을 통해 구현하는것이 아니라 구성(Composition)관계를 이용하여 해결한다.
Point1 클래스를 기반으로 원을 의미하는 Circle1클래스를 정의하자.
그리고 Circle1클래스를 기반으로 Ring1클래스를 정의하자.
문제설명]
그래프 상에 원을 표현하기 위해선 중심점과 반지름이 필요하다.
링을 표현하기 위해선 원 2개가 필요하다.
실행결과]
안쪽원의 정보 :
반지름 : 3	
[x좌표:1, y좌표1]
바깥쪽원의 정보 :
반지름 : 9
[x좌표:2, y좌표2]
*/

class Point1 {
	
	//멤버변수: 중심점 표현을 위해 x,y좌표값을 설정
	int xDot, yDot;
	
	//생성자
	public Point1(int x, int y) {
		xDot=x;
		yDot=y;
	}
	
	//멤버변수인 좌표값을 출력
	public void showPoint1Info() {
		System.out.println("[x좌표:"+xDot+", y좌표"+yDot+"]");
	}
}

//Point1클래스를 기반으로 원(Circle1) 클래스 표현하기
class Circle1{	
	//멤버변수
	int radian;//반지름
	Point1 center;
	
	//생성자
	public Circle1(int radian, int x, int y) {
		//멤버변수 반지름을 초기화
		this.radian = radian;
		//Point1 인스턴스를 생성 및 초기화
		center = new Point1(x, y);
	}
	
	//원의 정보를 출력하는 멤버메서드
	public void showCircleInfo() {
		//포인트 정보를 먼저 출력한다.
		center.showPoint1Info();
		//반지름을 출력한다.
		System.out.println("반지름:"+ this.radian);
	}
}

//원 2개를 겹쳐서 링을 표현하는 클래스
class Ring1{
	//멤버변수
	Circle1 innerCircle1;//안쪽의 원
	Circle1 outerCircle1;//바깥쪽의 원

	//생성자
	public Ring1(int inX, int inY, int inRad, int outX, int outY, int outRad) {
		
		innerCircle1 = new Circle1(inRad, inX, inY);
		outerCircle1 = new Circle1(outRad, outX, outY);
	}
	
	//링의 정보를 출력하는 멤버메서드
	public void showRing1Info() {
		
		//링은 원2개의 정보를 동시에 출력하면 된다.
		System.out.println("안쪽원의 정보:");
		innerCircle1.showCircleInfo();
		
		System.out.println("바깥쪽원의 정보:");
		outerCircle1.showCircleInfo();
	}
	
}
public class T_QuRingMake {
	public static void main(String[] args) {
		Ring1 c = new Ring1(1,1,3,2,2,9);
		c.showRing1Info();
	}
}

