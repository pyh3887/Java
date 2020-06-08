package Submit2;

public class B extends OddDetector {
	
	
	
	public B(int n) {
		super(n);
	}

	@Override
	public boolean isodd() {

		if(n % 2 ==0) {
			return true;
		}else {
			return false;
		}
		
	}

	
	public static void main(String[] args) {
		B b = new B(17);
		System.out.println(b.isodd());
	}
}

