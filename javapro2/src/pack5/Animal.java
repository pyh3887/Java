package pack5;

public abstract class Animal {

	abstract public String callName();	//반드시 써야할 추상메소드 오버라이딩 강요. 

	abstract public String eat();

	abstract public String action();
	
	
	
	
	public void print() {
		
		System.out.println("동물 클래스의 print 일반메소드");		
		
	}
	
	
}
