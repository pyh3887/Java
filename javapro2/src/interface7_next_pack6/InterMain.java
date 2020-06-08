package interface7_next_pack6;

public class InterMain {
	public static void main(String[] args) {

		InterRadio radio = new InterRadio();
		radio.volUp(5);
		radio.volDown(3);
		radio.show();
		radio.volOff();
		radio.volResume();

	}

}
