package pack10_200205_thread;

public class BreadEater extends Thread {

	private BreadPlate plate;

	public BreadEater(BreadPlate plate) {
		this.plate = plate;
	}

	@Override
	public void run() {
		for (int i = 0; i < 15; i++) {		//15번동안 eatBread실행
			plate.eatBread();
		}
	}

}
