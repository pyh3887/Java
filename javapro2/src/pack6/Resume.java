package pack6;

public interface Resume {

	String SIZE = "A4"; // public final static....

	void setIrum(String irum);

	void setPhone(String phone);

	void print();

	default void playJav(boolean b) {
		if (b) {
			System.out.println("자바프로그래밍 가능");
		} else {
			System.out.println("자바 불가능");
		}

	}

	static void changeData() {
		System.out.println("스태틱 메소드 처리 가능");
	}
}
