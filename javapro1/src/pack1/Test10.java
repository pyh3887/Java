package pack1;

public class Test10 {
	

	
	public static void main(String[] args) {
		// 다중 for , etc

		for (int m = 1; m <= 3; m++) {

			System.out.println("m: " + m);

			for (int n = 1; n <= 4; n++) {
				System.out.print("n : " + n + " ");
			}

			System.out.println("---------------");

		}

		System.out.println();

		for (char i = 65; i <= 90; i++) {

			System.out.print(i + ":");
			for (char j = i; j <= 'Z'; j++) {
				System.out.print(j);
			}

			System.out.println();
		}

		System.out.println();
		// continue, break
		for (int aa = 1; aa <= 10; aa++) {
			if (aa == 3)
				continue; // continue는 밑에값을 찍지않고 그대로 진행됌
			System.out.println(aa);
			// if(aa == 5) System.exit(0); //전체가 끝나버림
			// if(aa == 5) return; //return은 메인의 끝으로 감 메소드 블럭 탈출
			if (aa == 5)
				break; // for문 무조건 탈출
			System.out.println("nice");
		}

		System.out.println("--------------");

		int kk = 0;
		for (;;) {
			kk++;

			System.out.println("출력");
			if (kk == 5)
				break;
		}
		System.out.println("labe이 있는 경우");
		kbs: for (int i = 1; i <= 5; i++) {
			mbc: for (int j = 1; j <= 5; j++) {
				System.out.println(i + " " + j + " ");
				if(j == 3) continue kbs;
				if(j == 3) break kbs;

			}
		System.out.println("----------");

			
		}
		System.out.println("종료");
	}
}
