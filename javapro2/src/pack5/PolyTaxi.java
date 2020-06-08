package pack5;

public class PolyTaxi extends PolyCar {

	private int passenger = 2;

	public void show() {
		System.out.println("난택시야");
	}

	@Override

	public void displaydata() {

		System.out.println("택시의 승객 수는" + passenger);

	}

}

 