package pack1;

public class Test4 {

	public static void main(String[] args) {
		

//		논리연산자 처리 시 주의사항

		
		boolean a = false, b = true, c;
		c = a || b;
		System.out.println(c);

		c = a && b; // a가 거짓이기 때문에 b처리 x
		System.out.println(c);

		System.out.println("------------");

//		System.out.println(aa());

		boolean b1, b2;
		b1 = aa();

		System.out.println(b1);
		System.out.println(bb());

		System.out.println("주의할점 ---------");
//		b2 = aa() || bb();  // bb처리가 안되기때문에 bb는 쓸모없는 코드가됌
		b2 = bb() || aa();
		System.out.println(b2);

		System.out.println();

		b2 = aa() && bb();
//		b2 = bb() & aa ();
		System.out.println(b2);

		System.out.println("~~~~~~~~~~~~~");
		b2 = aa() | bb();
		System.out.println(b2);

		System.out.println();

		b2 = bb() & aa();
		System.out.println(b2);

		System.out.println("------종료------");

	}

	public static boolean aa() {
		System.out.println("aa출력");
		return true;
	}
	

	public static boolean bb() {
		System.out.println("bb출력");
		return false;
	}

}
