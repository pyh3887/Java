package pack6;

public class FlyerUtil {

	public static void show(Flyer f) { // 프로모션이 가능한 클래스 타입이같으면 모두가 들어올수있음
								// Flyer 와 같은 타입이면 하위 클래서 모두가능.

		f.fly();
		System.out.println("동물인가요?" + f.isAnimal());

	}

}
