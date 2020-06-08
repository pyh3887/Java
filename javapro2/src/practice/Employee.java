package practice;

public abstract class Employee {

	private String irum;
	private int nai;

	public Employee(String name, int age) {
		irum = name;
		nai = age;
	}

	abstract double pay();

	abstract void print();

	void display() {

		System.out.println("이름 : " + irum + " " + "나이 : " + nai);

	}

}
