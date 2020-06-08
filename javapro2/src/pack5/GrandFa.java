package pack5;

public class GrandFa {

	private int nai = 80; // 할아버지 개인나이.
	public String gaboo = "상감청자";
	protected String gahun = "객체를 이해하자"; // 접근지정자 protected(public과 default 사이)
											  // 상속선언 자식클래스는 다른패키지 o
	
	
	public GrandFa() {

		System.out.println("할아버지 생성자");
	}

	public GrandFa(int nai) { // 생성자 오버로딩
		this();// 현재 클래스의 생성자가 다른생성자를 호출 . argument 가 일치 , 단 다른생성자보다 먼저호출해야됌.
		this.nai = nai; // 현재 클래스안의 멤버필드를 부를때.
	}

	public String say() {
		System.out.println("할아버지 말씀 : 데이터 사이언티스트가 되거라");
		return "할아버지 말씀 : 데이터 사이언티스트가 되거라";

	}

	public void eat() {
		System.out.println("밥은 맛있게");
	}

	public int getNai() { // private nai > 게터사용
		
		return nai;
		
	}

}
