package practice;

public class Regular extends Employee {
	
	private int salary;
	
	public Regular(String name, int nai , int salary) {
		super(name ,nai);
		this.salary = salary;
	}

	@Override
	double pay() {
		return salary;
	}

	@Override
	void print() {
		System.out.println("정규직 : ");
		display();
		System.out.println("급여 : " + pay());
		
	}
	
	
	
	
	

}
