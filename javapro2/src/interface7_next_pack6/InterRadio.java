package interface7_next_pack6;

//public class InterRadio implements InerVol2{ interVol2 는 1을 상속하고있다.
public class InterRadio implements InterVol, InterVol2 { // 다중상속의 의미 
	private int v = 0;

	@Override
	public void volUp(int v) {
		this.v += v;

	}

	public void volDown(int v) {
		this.v -= v;

	}

	@Override
	public void volOff() {
		System.out.println("라디오 끄기");

	}

	@Override
	public void volResume() {
		System.out.println("라디오 켜기");
	}

	public void show() {
		System.out.println("현재 볼륨은" + v);
	}

}
