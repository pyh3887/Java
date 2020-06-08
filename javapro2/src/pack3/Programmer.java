package pack3;

public class Programmer {

	// public String nickname = "";
	public String nickname; // 초기값은 null
	private int age; // 초기값은 0
	String spec = "자바,C,파이썬";
	public static String moto = "미치자"; // 저장공간이 작음 언제든 가져다 쓸수있음 대체로 많이 쓰거나 꼭필요한 글씨 쓰러지면 static 클래스이름 . 멤버변수 = STATIC
	public final static double PI = 3.14; // 멤버 변수 + final 고정값 수정할수없음

	public Programmer() {
		System.out.println("생성자. 생략도 가능 객체 만들어졌음");
		age = 20;

	}

	public void displayData() {
		String re = reSpeck();
		System.out.println("별명이 " + nickname + "은" + age + "살" + re);

	}

	private String reSpeck() {
		return "보유 기술은 " + spec;

	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}
	
	public static void staticMethod() {
//		System.out.println("age : " +age);  //static 은 쓸수없다	
		System.out.println("moto : " +moto);
	}
}
