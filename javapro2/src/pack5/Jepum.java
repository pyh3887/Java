package pack5;

public abstract class Jepum {

	public int volume = 0;

	public Jepum() {
		System.out.println("Jepum 추상클래스 생성자");
	}

	abstract public void volumeControl(); // 추상메소드 new객체생성x
											// 부모클래스의 의미만지님
											// 바디가 없고 서브클래스에서
											// 강요
	public void volumeshow() {
		System.out.println("소리 크기 :" + volume);
	}
}
