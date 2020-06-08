package practice;

public class Tempoary extends Employee {

	private int ilsu;
	private int ildang;

	public Tempoary(String name, int age, int ilsu, int ildang) {
		
		
		super(name, age);
		this.ilsu = ilsu;
		this.ildang = ildang;

	}

	@Override
	double pay() {
		int don;
		don = ilsu * ildang;
		return don;

	}

	@Override
	void print() {
		System.out.print("임시직 : ");
		display();
		System.out.println("월급 : " + pay());

	}

}
