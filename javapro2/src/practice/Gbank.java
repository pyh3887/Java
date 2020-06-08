package practice;

public class Gbank {

	private int don = 10000;

	public void setDon(int don) {
		this.don = don;
	}

	public int getDon() {
		return don;
	}

	public synchronized void plus(int plus) {

		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}

		setDon(don + plus);
	}

	public synchronized void minus(int minus) {
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO Auto-generated catch block

		}
		setDon(don - minus);

	}

}
