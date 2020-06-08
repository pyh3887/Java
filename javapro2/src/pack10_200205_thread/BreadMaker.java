package pack10_200205_thread;

public class BreadMaker extends Thread {

	private BreadPlate plate ;

	public BreadMaker(BreadPlate plate) {
		this.plate = plate;
	}

	@Override
	public void run() {		
		for(int i = 0 ; i < 15; i++) {	//15번동안 makeBread실행
			plate.makeBread();
		}
	}

}
