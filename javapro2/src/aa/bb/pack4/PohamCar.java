package aa.bb.pack4;

public class PohamCar { // 여러개의 부품(클래스)들을 조립해 완성차를 만드는 클래스

	int speed = 0;
	String ownername, turnMessage;		// PohanHandle 의 메소드의 값임
	PohamHandle handle; // 클래스의 포함 (has a)관계 handle의 타입선언 

	public PohamCar(String name) {
		ownername = name;
		handle = new PohamHandle();		// name 을받아 생성자가 만들어지는순간
										// PohamHandle 객체 생성 받아들임

	}

	void turnHandle(int q) {
			
		if (q > 0)
			turnMessage = handle.rightTurn(q);	//PohanHandle의 rightTurn값을 turnMessage에 치환
		if (q < 0)
			turnMessage = handle.leftTurn(q);	//PohanHandle의 leftTurn값을 turnMessage에 치환
		if (q == 0)
			turnMessage = handle.straight(q);	//PohanHandle의 straight값을 turnMessage에 치환

	}
}
