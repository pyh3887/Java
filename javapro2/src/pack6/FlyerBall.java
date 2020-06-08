package pack6;

public class FlyerBall extends FlyerAdapter{
	
	@Override
	public void fly() {
		System.out.println("야구공이 날라감");
	}
	
	public static void main(String[] args) {
		FlyerBall a = new FlyerBall();
		a.fly();
				
	}
}
