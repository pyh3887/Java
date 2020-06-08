package pack5;

public class HouseDog extends Dog {

	private String Where = "집";

	public HouseDog(String name) {
		super(name);
	}

	public void show() {
		System.out.println("거주 : " + Where + "안");

	}

	@Override
	public void print() {
		System.out.println(getName() + "는 " + Where + "에 살고 있다");
	}

}
