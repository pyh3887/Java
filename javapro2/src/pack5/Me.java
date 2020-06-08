package pack5;

public class Me extends Father {
	public final int ABC = 10; // 수정불가 final 멤버 대문자
	private int nai = 6;

	public Me() {
		System.out.println("내 생성자!");

	}

	public void Biking() {
		System.out.println("자전거로 전국일주");

	}

	@Override

	public String toString() {

		String ss = "자바 만세";
		return ss;
	}

	public void medata() {

		System.out.println("아버지의 나이 :" + super.getNai());
		System.out.println("내나이 :" + nai);

	}

}
