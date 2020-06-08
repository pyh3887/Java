package practice;

public class EmployeeMain {
	public static void main(String[] args) {
		Tempoary tempoary = new Tempoary("홍길동", 23, 20, 150000);

		tempoary.print();
		
		Regular reg = new Regular("신기해", 25, 300000);
		reg.print();
		
		Saleman sale = new Saleman("손"
				+ "오공", 27,  2800000,30000 , 0.25);
		sale.print();
				
		
	}

}

