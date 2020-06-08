package pack3;

public class CallbyMain {

	public static void main(String[] args) {
		// 메소드 호출시 매개변수 전달 call by value ? call by reference

		Callby1 my = new Callby1();
		Callby2 your = new Callby2();
		System.out.println("원래 a : " + my.a + ", b :" + my.b);
		
		System.out.println();
		your.ex(my.a, my.b);	//callby1의 멤버 필드만 받음
		System.out.println(("1.수행후 a:" + my.a + ", b:" + my.b));
		
		System.out.println();
		your.ex(my);	//Callby1 의 주소를 my 인스턴스로 넘김 그래서 값이바뀜
		System.out.println("2.수행후 a:" +my.a + ", b:" + my.b);
		
		your.ex(my.c);
		System.out.println("3.수행후 c0, c1:" + my.c[0] + " " + my.c[1]);
		//배열은 참조형이기 때문에 역시 주소를 넘기기 때문에 callby1에 영향을끼침 c의값은바뀜.
		
		
		

	}

}
