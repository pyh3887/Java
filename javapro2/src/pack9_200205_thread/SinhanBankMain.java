package pack9_200205_thread;

public class SinhanBankMain {

	public static SinhanBank myBank = new SinhanBank();

	public static void main(String[] args) {
		System.out.println("초기 예금액 : " + myBank.getMoney());

		
		Kim kim = new Kim();
		Kimwife kimwife = new Kimwife();
		kim.start();
		kimwife.start();


	}

}
