package pack5;

public class PolyProduct { // 가전제품의 super 클래스

	private int volume = 0;

	public void volumeControl() { // 라디오,tv모두 볼륨컨트롤로
									// 하지만 둘의 소리조절방법들은다름
		// 오버라이드 기대

	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

}
