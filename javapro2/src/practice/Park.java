package practice;

public class Park extends Thread {

	@Override
	public void run() {
		Gbank a = new Gbank();
		a.plus(3000);
		System.out.println("입금후 금액 :" + a.getDon());

	}

}
