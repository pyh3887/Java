package pack3;

public class Bankmain {

	public static void main(String[] args) {
		// 뭔가를 하다가...

		Bank tom = new Bank();	//Bank 타입의 bank 인스턴스 참조중
		tom.dePosit(5000);
		tom.withDraw(3000);
		System.out.println("tom의 잔고 : " + tom.getMoney());
		
		
		System.out.println();
		
		Bank Oscar = new Bank(3000);
		Oscar.dePosit(1000);
		Oscar.withDraw(7000);
		Oscar.withDraw(1000);
		System.out.println("Oscar의 잔고 : " + Oscar.getMoney());

		System.out.println("주소 관련 ----------");
		System.out.println("tom 주소");
		System.out.println("tom의 주소 : " + tom);
		System.out.println("Oscar의 주소 : " + Oscar.toString()); // 객체의 주소를 출력하는 메소드 hex로
		System.out.println("Oscar의 주소 : " + Oscar.hashCode()); // decimal

		System.out.println("-----------------");
		Bank james = null; // 아무것도 참조하고있지않다.
		System.out.println(james); // 주소를 가지고있지않다.
		// james.dePosit(2000); // java.lang.NullPointerException
		james = Oscar; // 기본형 처럼 치환가능 주소도 넘어감
		System.out.println("james 주소" + james);
		james.dePosit(2000);

		System.out.println("Oscar의 잔고 : " + Oscar.getMoney());
		System.out.println("james의 잔고 : " + james.getMoney());
		// Oscar = null;

		System.out.println("--------------------");
		if (james == Oscar)
			System.out.println("둘은 같은 객체 주소 참조");

		else
			System.out.println("달라요");

		if (james == tom)
			System.out.println("둘은 같은 객체 주소 참조2");
		else
			System.out.println("달라요2");
		System.out.println("String 클래스 타입값 비교 -------------");
		
		String ss1 = "kor"; // 스트링 타입의 객체   kor 인스턴스참조
		//String ss2 = "kor"; // 객체
		String ss2 = new String();// 객체
		ss2 ="kor";		
		String ss3 = new String("kor");
		System.out.println(ss1 + " " + ss2 + " " + ss3);

		if (ss1 == ss2) // 값 비교가 아닌 주소비교중. ss1 ss3 저장되는 방법이다름.
			System.out.println("같음1");
		else
			System.out.println("다름1");
		if (ss1 == ss3)
			System.out.println("같음2");
		else
			System.out.println("다름2");

		if (ss2 == ss3)
			System.out.println("같음3");
		else
			System.out.println("다름3");
		
		System.out.println(ss1.hashCode()); // 모두가 같은 Literal pool 이라는 
		System.out.println(ss2.hashCode()); // 문자 저장공간에 하나의 인스턴스가 
		System.out.println(ss3.hashCode()); // 만들어짐
		
		//문자열 비교용 메소드 equlas() : String 객체의 값을 비교

		if (ss1.equals(ss2)) // 값 비교가 아닌 주소비교중. ss1 ss3 저장되는 방법이다름.
			System.out.println("같음1");
		else
			System.out.println("다름1");
		if (ss1.equals(ss3))
			System.out.println("같음2");
		else
			System.out.println("다름2");

		if (ss2.equals(ss3))
			System.out.println("같음3");
		else
			System.out.println("다름3");
		if(ss1.equalsIgnoreCase(ss2))
			System.out.println("같음 1");
		else
			System.out.println("다름 1");
		
		System.out.println("\n배열 관련 ---------");
		int ar1[] = {1,2,3};
		System.out.println(ar1);
		System.out.println(ar1[0] + " " + ar1[1]);
		int[][] ar2 = {{1,2,3},{4,5,6}};
		System.out.println(ar2);
		System.out.println(ar2[0]);
		System.out.println(ar2[0][0]);
		


	}
}
