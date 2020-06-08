package pack5;

public class JepumMain {
	
	public static void main(String[] args) {
		
//		Jepum jepum = new Jepum() { 추상클래스기 때문에 인스턴스x
								//메소드 오버라이딩을 강요한것임
								//곧 추상메소
		Jepum jepum = null;
		Jepum_Tv tv = new Jepum_Tv();
		jepum = tv;
		jepum.volumeControl();		//
		
		Jepum_Radio radio = new Jepum_Radio();
		Jepum ra = radio;
		jepum.volumeControl();
		
		
		
		
		
		
		
		
				
		
			
		
		
	}
	
}
