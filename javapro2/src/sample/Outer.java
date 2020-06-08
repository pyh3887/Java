package sample;

//내부 클래스 : 클래스 내에 클래스를 선언

public class Outer {

	private int a;
	private Inner inner;

	public Outer() {
		System.out.println("아우터 생성자");
		a = 10;
		inner = new Inner();

	}

	public void aa() {

		System.out.println("Outer 의 aa 메소드");
		System.out.println("----aa생성자-----");
		bb();
		System.out.println("----bb메소드-----");
		inner.cc();
		System.out.println("----cc메소드-----");
		System.out.println("Outer 의 a는" + a + "Inner의 b는" + inner.b);
		
		
	}

	private void bb() {

		System.out.println("Outer 의 bb 메소드");
	}

	class Inner { // 어느클래스안에 꼭필요한 메소드가 있으면 이너클래스

		private int b;

		public Inner() {
			System.out.println("Inner 클래스 생성자");
			b = 20;
		}

		public void cc() {
			System.out.println("Inner 의 cc 메소드");
			System.out.println("Inner : " + b + ", Outer : " + a);
			bb();

		}

		// 내부 클래스 내에 내부 클래스 선언
		class InnerInner {

		}

	}

	public static void main(String[] args) {

		Outer outer = new Outer();
		outer.aa();

		System.out.println();
		// Outer.Inner inner = outer.new Inner(); //보통 이렇게 쓰지않는다.
		// inner.cc();

	}
}
