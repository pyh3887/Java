package Submit1;

public class Salesman extends Regular {

	private int sales;
	private double commission;

	public Salesman(String name, int age, int salary, int a, double b) {

		super(name, age, salary);
		sales = a;
		commission = b;

	}

	@Override
	double pay() {
		return (super.pay() + sales * commission);

	}

	@Override
	void print() {

		System.out.print("영업직 : ");
		display();
		System.out.print(" " + pay());

	}

}
