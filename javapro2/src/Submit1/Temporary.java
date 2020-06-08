package Submit1;

public class Temporary extends Employee {

	private int ilsu;
	private int ildang;

	public Temporary(String name, int age, int ilsu, int ildang) {

		super(name, age);
		this.ilsu = ilsu;
		this.ildang = ildang;
	}

	@Override
	double pay() {

		return ilsu * ildang;

	}

	@Override
	void print() {
		System.out.print("임시직 : ");
		display();
		System.out.println(" " + pay());

	}
	
}
