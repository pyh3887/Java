package pack5;

public class PolyTv extends PolyProduct{
	
	@Override
	public void volumeControl() {
		System.out.println("Tv 사운드 조절 후 :" + getVolume());
		
		
	}
	
	public void tvshow() {
		System.out.println("TV 고유 메소드");
	}
	

}
