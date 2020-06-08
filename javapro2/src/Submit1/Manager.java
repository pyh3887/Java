package Submit1;

public class Manager extends Regular {

	private int incentive;

	public Manager(String name, int age, int salary) {

		super(name, age, salary);

	}

	@Override
	double pay() {
		if (super.pay() >= 2500000) {
			return super.pay() * 0.6;
		}
		if (super.pay() > 2000000) {
			return super.pay() * 0.5;
		}
		if (super.pay() < 2000000) {
			return super.pay() * 0.4;
		}
		return incentive;

	}

	@Override
	void print() {
		System.out.println();
		System.out.print("영업직 : ");
		display();		
		System.out.print(" " + (pay() + super.pay()));

	}

}
