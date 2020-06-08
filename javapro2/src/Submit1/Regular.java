package Submit1;

public class Regular extends Employee {

	private int salary;

	public Regular(String name, int age, int a) {

		super(name, age);
		salary = a;

	}

	@Override
	double pay() {

		return salary;
	}

	@Override
	void print() {

		System.out.print("정규직 : ");
		display();
		System.out.println(" " + pay());
		

	}
	
}
