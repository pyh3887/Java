package aa.bb.pack4;

public class PohamcarMain {

	public static void main(String[] args) {

		PohamCar tom = new PohamCar("톰");
		tom.turnHandle(30);	// 30을 turnHandle의 q 에 넣음
		System.out.println(tom.ownername + "의 회전량은" + tom.turnMessage + " " + tom.handle.quantity);
		//ownername 생성자에 입력 			turnMessage값은 Pohamhandle클래스의  메소드		handle.quantity는 들어온값 30
		System.out.println();
		tom.turnHandle(0);	
		System.out.println(tom.ownername + "의 회전량은" + tom.turnMessage + " " + tom.handle.quantity);
												// quantity 값이 0이기 때문에 직진
		
		System.out.println();
		PohamCar kildong = new PohamCar("길동");
		kildong.turnHandle(-10);
		System.out.println(kildong.ownername + "의 회전량은" + kildong.turnMessage + " " + kildong.handle.quantity);
		
	}
	

}
