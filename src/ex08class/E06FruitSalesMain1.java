package ex08class;

//과일판매자를 추상화 한 클래스
class FruitSeller{
	
	//멤버변수
	//판매자가 가지고 있는 사과의 갯수
	int numOfApple = 100;
	//판매자가 가지고 있는 돈
	int myMoney = 0;
	//멤버상수: 사과의 단가를 표현한다.
	final int APPLE_PRICE = 1000;
	/* 
	멤버변수의 경우 초기값이 없는 상태로 정의한 후 인스턴스를 생성하고 차후 초기화할수있다.
	하지만 멤버상수(final)는 인스턴스 생성과 상관없이 정의하는 시점에 반드시 초기화 해야한다.
	즉 1000을 지우면 에러가 발생한다.
	*/
	
	
	//멤버메서드
	/*
	판매자가 사과를 판매하는 행위를 표현한다.
	1. 구매자로부터 금액을 전달받는다.(메서드 호출시 매개변수를 통해 받는다.)
	2. 금액 / 단가 = 판매될 사과의 갯수를 계산한다.(5000 / 1000 = 5개) 
	3. 보유한 사과의 갯수에서 판매할 갯수만큼 차감한다.
	4. 판매수익이 증가한다.(5000원 증가)
	5. 구매자에게 사과 5개를 반환한다.
	*/
	public int saleApple(int money) {
		int num = money / APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	
	//판매자의 현재상태를 출력한다.
	public void showSaleResult() {
		System.out.println("[판매자]남은사과갯수: "+ numOfApple);
		System.out.println("[판매자]판매수익: "+ myMoney);
	}
}

//과일구매자를 추상화 한 클래스
class FruitBuyer{
	
	//멤버변수
	//구매자가 가지고 있는 금액
	int myMoney = 5000;
	//구매자가 가지고 있는 사과의 갯수
	int numOfApple = 0;
	
	//멤버메서드
	/*
	구매자가 판매자에게 사과를 구매하는 행위를 표현한 멤버메서드
	1. 판매자에게 금액을 지불한다.
	=> 여기에서 seller객체의 saleApple()메서드가 호출된다.
	
	2. 판매자가 금액에 해당하는 사과의 갯수를 반환하면 해당 갯수만큼 보유한 사과가 증가한다.
	=> numOfApple += 메서드 호출();
	
	3. 판매자에게 지불한 금액만큼 차감한다.
	*/
	public void buyApple(FruitSeller seller, int money) { 
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	
	//구매자의 현재상태 출력
	public void showBuyResult() {
		System.out.println("[구매자]사과갯수: "+ numOfApple);
		System.out.println("[구매자]현재잔액: "+ myMoney);
	}
}

//main
public class E06FruitSalesMain1 {

	public static void main(String[] args) {
		
		//판매자와 구매자의 인스턴스를 생성한다.
		FruitSeller seller = new FruitSeller();
		FruitBuyer buyer = new FruitBuyer();
		
		System.out.println("구매행위가 일어나기 전의 상태");
		//재고수량:100개
		seller.showSaleResult();
		buyer.showBuyResult();
		
		//5000원을 내고 사과를 구매한다.
		buyer.buyApple(seller, 5000);
		
		System.out.println("구매행위가 일어난 후의 상태");
		//재고수량 95개, 수익금 5000원
		seller.showSaleResult();
		//구매수량 5개, 보유금액 0원
		buyer.showBuyResult();
	}

}
