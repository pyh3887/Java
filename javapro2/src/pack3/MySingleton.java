package pack3;

public class MySingleton {

	int kor = 10;
	// ...
	
					// 싱글톤 패턴 : 생성자를 무한으로 생성하지않고(웹:서버다운 방지)
					// 한개의 인스턴스에 전역적 접근허용

	private static MySingleton singleton = new MySingleton();

	public static MySingleton getInstance() {

		return singleton;
	}

}
