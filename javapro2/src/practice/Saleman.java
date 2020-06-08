package practice;

public class Saleman extends Regular {

	private int sales;
	private double commission;

	public Saleman(String name, int nai, int salary, int sales, double commission) {
		super(name, nai, salary);
		this.sales = sales;
		this.commission = commission;
	}

	@Override
	double pay() {
		return super.pay() + (sales * commission);
	}

	@Override

	void print() {
		System.out.println("영업직 : ");
		display();
		System.out.println("수령액 : " + pay());

	}

}
