package ex09package.study.buyer;

import ex09package.study.seller.FruitSeller4;

public class FruitBuyer4 {

	//멤버변수
		//구매자가 가지고 있는 금액
		int myMoney;
		//구매자가 가지고 있는 사과의 갯수
		int numOfApple;
		
		
		public FruitBuyer4(int _myMoney, int _numOfApple) {
			myMoney = _myMoney;
			numOfApple = _numOfApple;
		}
		
		public void buyApple(FruitSeller4 seller, int money) { 
			numOfApple += seller.saleApple(money);
			myMoney -= money;
		}
		
		//구매자의 현재상태 출력
		public void showBuyResult() {
			System.out.println("[구매자]사과갯수: "+ numOfApple);
			System.out.println("[구매자]현재잔액: "+ myMoney);
		}
}
