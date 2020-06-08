package pack3;


public class Bank {
	private int money = 1000;
	int imsi = 1;
	public int imsi2 = 2;

	public Bank() {
		
	}

	public Bank(int money) {
		this.money += money;

	}

	public void dePosit(int amount) { // 입금
		if (amount > 0)
			money += amount;

	}

	public void withDraw(int amount) { // 출금
		if ((amount > 0) && (money - amount >= 0))
			money -= amount;
		else
			System.out.println("출금액이 잔고액보다 많습니다.");

	}

	public int getMoney() {	//잔금 확인
		return money;
	}

}
