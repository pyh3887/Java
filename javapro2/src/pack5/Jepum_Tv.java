package pack5;

public class Jepum_Tv extends Jepum {

	public Jepum_Tv() {
		System.out.println("Tv 생성자");
	}

	@Override
	public void volumeControl() { // 추상을 구체화해야함. 강요
		System.out.println("Tv 소리조절");

	}

}
