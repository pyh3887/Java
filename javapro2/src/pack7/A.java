package pack7;

public class A { // 바깥쪽 클래스

	int field1;

	public A() {
		System.out.println("A 생성자");

	}

	private void method1() {
		System.out.println("method1 수행 : " + field1);

	}

	class B { // 인스턴스 멤버 클래스 클래스 A의 내부클래스 : 외부와 긴밀한 접점이있을때 주로사용한다.

		int field2;

		public B() {
			System.out.println("B 객체 생성자");
		}
		private void method2() {
			// TODO Auto-generated method stub
			System.out.println("method2 수행 : " + field2);
		}
	}
	static class C { // 내부안의 내부클래스 자주쓰진않음.
		int field3;

		public C() {
			System.out.println("C 정적 객체 생성자");
		}
		private void method3() {
			System.out.println("method2 수행 : " + field3);
		}
	}
	void a_method4() { // A클래스 메소드
		System.out.println("a_method4가 진행");
		class D { // local method
			int field4 = 4;

			public D() {
				System.out.println("D 생성자");
			}

			private void method4() {
				System.out.println("method4 수행 : " + field4);

			}

		}
		D d = new D();
		d.field4 = 4;
		d.method4();

	}

	// 허용범위 ==========
	B b2 = new B();
	C c2 = new C();
//	D d2 = new D();	 메소드 안에 있기때문에.

	private void test1() { // 일반 메소드
		B b3 = new B();
		C c3 = new C();

	}

	static C c4 = new C(); // 내부클래스는 밖에 있는 클래스의 자원을 마음대로 사용할 수 있지만, 중첩클래스는 static 키워드가 안붙었다면 사용할 수 없다.

	static void test2() {
//		B b4 = new B();	스태틱 메소드가 아니기때문에
		C c5 = new C();

	}

	public static void main(String[] args) {
		A a = new A();
		a.field1 = 1;
		a.method1();

		System.out.println("인스턴스 멤버 클래스 -------------");
		A.B b = a.new B(); // 내부클래스 선언시 타입. 외부클래스. 내부클래스 순
		b.field2 = 2;
		b.method2();

		System.out.println("정적 인스턴스 멤버 클래스 -------------");
		A.C c = new A.C();
		c.field3 = 3; // 정적클래스기 때문에 필드값 바로호출이가능하다.
		c.method3();
		C c2 = new C();
		c2.field3 = 4;
		c2.method3();
		System.out.println("로컬 클래스 멤버 -----------");
		a.a_method4();

		System.out.println();
		a.test1();
		a.test2();

		A.test2(); // static 메소드기 때문에 권장

	}

}
