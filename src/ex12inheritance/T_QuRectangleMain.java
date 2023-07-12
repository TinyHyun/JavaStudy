package ex12inheritance;

/*
문제3) QuRectangle1Main.java
정사각형을 의미하는 Square1클래스와 직사각형을 의미하는 Rectangle1클래스를 정의하고자 한다.
그런데 정사각형은 직사각형의 일종이므로, 다음의 형태로 클래스의 상속관계를 구성하고자 한다. 아래의 소스를 참조하여 구현하시오.
실행결과]
직사각형 면적: 12
정사각형 면적: 49
*/

//직사각형을 표현한 클래스
class Rectangle1 {
	
	//멤버변수: 가로, 세로 길이
	private int width;
	private int height;
	
	//private멤버변수를 외부에서 반환받기 위한 getter선언
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}


	//생성자
	public Rectangle1(int width, int height) {
		
		this.width = width;
		this.height = height;
	}
	
	
	public void showAreaInfo() {
		System.out.println("직사각형 면적: "+ (width*height));
	}
}

//정사각형을 표현한 클래스(정사각형은 직사각형의 일종)
class Square1 extends Rectangle1 {
	//정사작형은 밑변과 높이의 길이가 같으므로 하나의 값으로 두개의 길이를 대체할 수 있따.
	
	//멤버변수: 여기서는 확장이 필요없다.

	//생성자: 하나의 값으로 2개를 초기화한다.
	public Square1(int w) {
		super(w, w);
	}
	
	//부모클래스에서 private으로 선언된 멤버변수 이므로 직접적인 접근은 불가능하다.
	//따라서 getter를 통해 값을 얻어온 후 연산해야한다.
	@Override
	public void showAreaInfo() {
		System.out.println("정사각형 면적: "+ (getWidth()*super.getHeight()));
	}

}

	
	
public class T_QuRectangleMain {
	public static void main(String[] args) {
		Rectangle1 rec = new Rectangle1(4, 3);
	rec.showAreaInfo();
		Square1 sqr = new Square1(7);
	sqr.showAreaInfo();
	}
}



