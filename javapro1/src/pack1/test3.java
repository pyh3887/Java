package pack1;

public class test3 {

	public static void main(String[] args) {

		// 관계, 논리 연산자, 기타

		// 관계연산자
		int a = 5;
		System.out.println(a > 3);
		System.out.println(a < 3);
		System.out.println(a == 3);
		System.out.println(a != 3); // != 같지않다

		// 논리연산자
		System.out.println();
		int b = 10;
		System.out.println(a > 3 && b <= 10); // && 논리곱 and의 의미
		System.out.println(a > 3 && b == 7);

		System.out.println();

		System.out.println(a > 6 || b <= 10); // && 논리합 or 의 의미
		System.out.println(a > 7 || b < (5 + 10));

		System.out.println();
		int ii = 8, ij;

//		System.out.println(ii + " " + ij); The local variable ij may not have been initialized

		System.out.println("ii : " + ii + " " + Integer.toBinaryString(ii));

		ij = ii << 1; // 시프트 연산자 1000 << 10000 좌측으로 1bit 이동. 남는 우측은 0 으로 채움
		System.out.println("ij : " + ij);

		ij = ii >> 2; // 시프트 연산자. 우로 2bit 이동 . 남는 좌측은 부호와 같은 값으로 채움
		System.out.println("ij : " + ij);

		ij = ii >>> 3; // 시프트 연산자. 우로 2bit 이동. 남는 좌측은 0 으로 채움
		System.out.println("ij : " + ij);

		System.out.println();

		// 삼항 연산자

		int re = (ii <= 5) ? 100 : 50 + 20; // 변수= (조건)?참값 :거짓값
		System.out.println("re : " + re);

		int x, y, z;
		x = y = z = 5;
		System.out.println(x + " " + y + " " + z);

		System.out.println();

		aa(); // method 를 부른다
		bb(11);

		System.out.println("프로그램 종료");

	}

	public static void aa() { // 성격이 비슷한 명령문들을 모아놓은 집단 - method
		System.out.println(" aa 메소드 수행");
		bb(3);
	}

	public static void bb(int mbc) {
		System.out.println(" bb 메소드 수행");
		System.out.println("mbc : " + mbc);

	}

}
