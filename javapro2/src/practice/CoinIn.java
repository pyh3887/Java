package practice;

public class CoinIn {

	private int coin;
	private int jandon;
	Machine ma;

	void setCoin(int coin) {
		this.coin = coin;
	}

	String calc(int cupcount) {
		int coffee = 200;

		jandon = coin - (cupcount * coffee);
		if (coin < 200) {

			return "요금이 부족합니다";
		} else if (cupcount * 200 > coin) {
			return "요금이 부족합니다";
		} else {

			return "커피 " + cupcount + "잔과 잔돈 " + jandon + "원";
		}

	}

}
