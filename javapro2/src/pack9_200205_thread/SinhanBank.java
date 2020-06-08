package pack9_200205_thread;

public class SinhanBank {

	private int money = 10000; // 통장의 잔고. thread의 공유자원

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public synchronized void saveMoney(int save) { // 입금. thread의 동기화
		int m = getMoney();
		try {
			Thread.sleep(2000);		// 출력 속도를 조정

		} catch (Exception e) {

		}
		setMoney(m + save);
	}

	public synchronized void minusMoney(int save) { // 출금
		int m = getMoney();
		try {
			Thread.sleep(3000);		//출력 속도를 조정 

		} catch (Exception e) {
			// TODO: handle exception
		}
		setMoney(m - save);

	}
}
