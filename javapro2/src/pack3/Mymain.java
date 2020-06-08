package pack3;

public class Mymain {

	public static void main(String[] args) {
		// 응용 프로그램이 시작
		// int kbs = 9;
		// System.out.println("kbs : " + kbs);

		Car mycar1 = new Car();	//실질적 개채생성 + 생성자 호출
		
		System.out.println(mycar1); // pack3.Car@7d6f77cc
		// car mycar1 = null;
		System.out.println(mycar1.wheel); // 멤버필드
		mycar1.abc(); // 메소드
		// mycar1.airbag; //private 멤버이므로 접근불가
		int air = mycar1.getAirbag();
		System.out.println("air :" + air);
		System.out.println("air :" + mycar1.getAirbag());
		mycar1.setAirbag(123,4);
		System.out.println("air :" + mycar1.getAirbag());
	}

}
