package pack5;

public class AniSpider extends Animal {

	@Override // 어노테이션 : 메타
	public String callName() {

		return "사자";
	}

	@Override
	public String eat() {

		return "동물";
	}

	@Override
	public String action() {

		return "밤";
	}

	@Override
	public void print() {
		System.out.println("사자 클래스에서 선택적으로 오버라이드");
	}

	public void eatOther() { // 사자 고유메소드
		System.out.println("가끔은 물도 마심");

	}

}
