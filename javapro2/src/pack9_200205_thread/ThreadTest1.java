package pack9_200205_thread;

public class ThreadTest1 extends Thread { // 동시에 수행하게하는것처럼 느끼게하지만 동시수행 x
	public ThreadTest1() {

	}

	public ThreadTest1(String name) {
		super(name);
	}

	public void run() { // run 메소드 오버라이딩을 해서 thread 실행
		for (int i = 0; i <= 20; i++) {
			System.out.print(i + "(" + super.getName() + ") ");
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//
//			}
		}
	}

	public static void main(String[] args) {
		// 메인(demon) 스레드에 의해 main() 수행
		try {
			// process 단위 수행
			// Process p1 = Runtime.getRuntime().exec("calc.exe");
			// Process p2 = Runtime.getRuntime().exec("notepad.exe");

			// thread로 메소드 단위 수행
			/*
			 * ThreadTest1 t1 = new ThreadTest1(); ThreadTest1 t2 = new ThreadTest1();
			 * t1.run(); System.out.println(); t2.run();
			 */
//			ThreadTest1 t1 = new ThreadTest1();
//			ThreadTest1 t2 = new ThreadTest1();
			ThreadTest1 t1 = new ThreadTest1("일");
			ThreadTest1 t2 = new ThreadTest1("둘");
			t1.start(); // 순차적으로 실행 x	thread 는 main과 무관하게 run이 종료되면 종료
			t2.start();
			t2.setPriority(MAX_PRIORITY); // max = 10  t2에게 우선순위를 요청
			t1.join();	// 사용자 스레드가 종료될 때 까지 메인 스레드(demon)을 대기시킴
			t2.join();	//
			
			System.out.println("프로그램 종료");

		} catch (Exception e) {
			System.out.println("err : " + e);
		}

	}

}
