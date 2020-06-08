package pack5;

public class AniCow extends Animal {

	@Override // 어노테이션 : 메타
	public String callName() {

		return "소";
	}

	@Override
	public String eat() {

		return "여물";
	}

	@Override
	public String action() {

		return "낮";
	}
}
