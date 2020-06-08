package Submit1;

public abstract class Employee {

	String irum;
	int nai;

	public Employee(String name, int age) {
		irum = name;
		nai = age;

	}

	abstract double pay();

	abstract void print();

	void display() {
		System.out.print(irum + " " + nai + " ");
	}

}
