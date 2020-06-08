package pack5;

//public class final Father extends GrandFa  클래스에 final을 걸었기때문에 상속불가.
public class Father extends GrandFa { // 부모,super /자식,sub

	private int nai = 55;
	private int house = 1; // 현재 클래스의 고유 필드 멤버
	public String gaboo = "꽃병"; // 은닉화
	protected String gahun = "다형성을 이해하자";

	public Father() {
		super(); // 부모생성자 호출. argument에 의해 선택적으로 호출
		System.out.println("아버지 생성자입니다.");
	}

	@Override // annotation : 부모 메소드와 동일해야함을 강요

//	public final int getNai() //final 때문에 하위 클래스에서는 오버라이딩 불가

	public int getNai() { // 부모 메소드와 동일한 메소드(이름,argument 동일)
		// return nai; // 를 선언: 메소드 오버라이딩
		return this.nai;

	}

	@Override
	public String say() {
		// TODO Auto-generated method stub
//		return super.say();
		System.out.println("자바 프로그래머 전문가가 되자");
		return "자바 프로그래머 전문가가 되자";
	}


	public void showdata() {
		String gaboo = "쇼데이터의 가보다";
		System.out.println("gabo : " + gaboo); // 자식 gaboo
		System.out.println("gabo : " + this.gaboo); // 자식 gaboo
		System.out.println("gabo : " + super.gaboo); // 부모 gaboo
		System.out.println("gabo : " + this.getNai()); // 자식 nai
		System.out.println("gabo : " + super.getNai()); // 부모 nai
		say();
		this.say();
		super.say();

	}
	
	public int grandfanai() {
		return super.getNai();
	}
}
