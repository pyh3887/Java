package pack5;

public class Wolf extends Dog {

	private String Where = "산";

	public Wolf(String name) {
		super(name);
	}

	public void show() {
		System.out.println("거주(wolf) : " + Where + "안");

	}

	@Override
	public void print() {
		System.out.println(getName() + "는 " + Where + "에 살고 있다");

	}
	
	public void display() {
		print();		//현재클래스에 찾아보고 없으면 부모클래스 올라가
		this.print();	//현재클래스에 있는 print불러와
		super.print();	//무조건 부모클래스에 있는 print불러와
		
	}

}
