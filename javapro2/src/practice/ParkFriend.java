package practice;

public class ParkFriend extends Thread {

	@Override
	public void run() {
		Gbank g = new Gbank();

		g.minus(2000);
		System.out.println("출금후 : " + g.getDon());

	}

}
