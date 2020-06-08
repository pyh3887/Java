package practice;

public class GbankMain {

	public static Gbank gbank = new Gbank();

	public static void main(String[] args) {

		System.out.println("예치금" + gbank.getDon());

		Park park = new Park();
		ParkFriend pf = new ParkFriend();

		park.start();
		pf.start();

	}

}
