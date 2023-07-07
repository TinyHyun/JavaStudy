package ex09package;

/*
ex08class 패키지의 E06FruitSalesMain3 클래스를 그대로 복사한 후 E03FruitSalesMain4로 파일명을 변경한다. 

연습문제] 해당 프로그램을 아래의 지시에 따라 패키지로 구분하여 정상 실행되도록 변경하시오.

FruitSeller4 클래스 -> ex09package.study.seller 패키지에 묶는다.
FruitBuyer4 클래스 -> ex09package.study.buyer 패키지에 묶는다.

두 클래스를 적절히 import 하여 정상동작 할수 있도록 E03FruitSalesMain4 클래스를 구성하시오.
 */ 

import ex09package.study.buyer.FruitBuyer4;
import ex09package.study.seller.FruitSeller4;

public class E03FruitSalesMain4 {

	public static void main(String[] args) {
		
		FruitSeller4 seller1 = new FruitSeller4(0, 100, 1000);
		
		FruitSeller4 seller2 = new FruitSeller4(0, 80, 500);
		
		FruitBuyer4 buyer = new FruitBuyer4(10000, 0);
		
		
		
		System.out.println("구매행위가 일어나기 전의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		//각각의 판매자에게 5000원씩 지불하고 사과를 구매한다.
		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 5000);
		
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult(); //5개를 판매한다.
		seller2.showSaleResult(); //10개를 판매한다.
		buyer.showBuyResult(); //10000원을 지불하고 사과 15개를 구매한다.
	}

}
