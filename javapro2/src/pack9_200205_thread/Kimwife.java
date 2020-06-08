package pack9_200205_thread;

public class Kimwife extends Thread {

	@Override
	public void run() {
		SinhanBankMain.myBank.minusMoney(3000);
		System.out.println("아내 출금 후 잔고 :" + SinhanBankMain.myBank.getMoney());

	}

}
