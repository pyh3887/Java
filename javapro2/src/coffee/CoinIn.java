package coffee;

public class CoinIn {

	private int coin = 0;
	private int jandon = 0;
	Machine ma;

	public CoinIn() {

		ma = new Machine();

	}

	public void calc(int coin, int jan) {
		this.coin = coin;
		int coffee = 200;

		jandon = coin - (coffee * ma.showData(jan));

		if (coin < coffee || jandon < 0) {

			System.out.println("요금 부족");

		} else
			System.out.println("커피" + ma.showData(jan) + "잔과 잔돈" + jandon + "원");

	}

}
