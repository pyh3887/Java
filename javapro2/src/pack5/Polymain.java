package pack5;

public class Polymain {

	public static void main(String[] args) {

		PolyCar car1 = new PolyCar();
		car1.displaydata();
		System.out.println();

		Polybus bus1 = new Polybus();
		bus1.displaydata();
		bus1.show();

		System.out.println();

		PolyTaxi taxi1 = new PolyTaxi();
		taxi1.displaydata();
		taxi1.show();

		System.out.println("--------------");
		PolyCar car2 = new Polybus(); // promotion Polybus 의 오버라이딩 된값을 쓰고싶어
		car2.displaydata();
		car2.getSpeed();
		System.out.println("ddddd");
		System.out.println(car2.getSpeed());
//		car2.show();	//overiding x

		System.out.println();

		// PolyCar car3 = new PolyTaxi();
		// car3.displaydata();
//		Polybus bus2 = new PolyCar(); //x		

		Polybus bus2 = (Polybus) car2; // cast 연산자
		bus2.displaydata();
		bus2.show();
		bus2.getSpeed();
		System.out.println("2----------"); // 생성자X ?

		System.out.println();
		// PolyTaxi taxi2 = new PolyCar();
		// PolyTaxi taxi2 = (PolyTaxi)car3; // O
		// PolyTaxi taxi3 = (PolyTaxi)car1; // 문법오류 x ,실행오류

		System.out.println("=========ff=========");
		PolyCar p[] = new PolyCar[3];
		p[0] = car1;
		p[1] = car2;
		p[2] = bus2;
		for (int i = 0; i < p.length; i++) {
			p[i].displaydata();
		}
		System.out.println();
		for (PolyCar car : p) {
			car.displaydata();

		}

	}
}