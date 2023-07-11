package ex12inheritance;

//상속관계가 있는 클래스에서 자식클래스를 통해 인스턴스를 생성할 때
// 반드시 부모클래스의 인스턴스를 먼저 생성해야 한다.
class Car1 {
	
   	int gasoline;

	public Car1(int gas) {
		
		gasoline = gas;
	}
}

class HybridCar1 extends Car1 {
	
   	int electric;
   	
   	//인수 1개를 부모로 전달하고 멤버변수를 초기화한다.
   	public HybridCar1(int ga, int hy) {
   		
   		super(ga);
   		electric = hy;
   	}
}

class HybridWaterCar1 extends HybridCar1 {
	
	//부모클래스로 2개의 인수를 전달하고, 1개는 멤버변수를 초기화환다.
   	int water;
 
   	public HybridWaterCar1(int g, int e, int w) {
   		
   		super(g, e);
   		water = w;
   	}
   	
   	public void showNowGauge() {
   		
     	System.out.println("남은가솔린:"+gasoline);
     	System.out.println("남은전기량:"+electric);
     	System.out.println("남은워터량:"+water);
   	}
}


public class T_QuConstructorAndSuper {

	public static void main(String[] args) {

		HybridWaterCar1 hcar = new HybridWaterCar1(10,20,30);
		hcar.showNowGauge();
	}

}
