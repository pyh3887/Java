package pack5;

public class Polybus extends PolyCar {

	private int passenger = 10;
	

	public void show() {
		System.out.println("버스");
	}

	@Override

	public void displaydata() {

		System.out.println("버스의 승객 수는" + passenger);
		System.out.println("버스의 속도는" + speed);
	}
	
	
	
}

