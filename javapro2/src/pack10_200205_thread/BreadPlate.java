package pack10_200205_thread;

public class BreadPlate {
	private int breadCount = 0;

	public BreadPlate() {
		// TODO Auto-generated constructor stub
	}

	public synchronized void makeBread() {
		if (breadCount >= 10) {
			try {
				System.out.println("빵생산 초과");
				wait();	// 빵이 10개가 넘어가면 비활성화	
			} catch (Exception e) {
				
			}
		}
		breadCount++;
		System.out.println("빵 생성 후 갯수 :" + breadCount + "개");
		notify();	//다시활성화
	}

	public synchronized void eatBread() {
		if (breadCount < 1) {
			try {
				System.out.println("빵이 없음 대기");
				wait();	//빵이 1개보다 낮아질시 비활성화
			} catch (Exception e) {
			
			}
		}
		breadCount--; // 빵을 소비
		System.out.println("빵 소비 후 갯수 :" + breadCount + "개");
		notify();
	}
}