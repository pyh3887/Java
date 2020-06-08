package pack1;

public class Test11 {

	public static void main(String[] args) {

		// 반복문 while

		int w = 1;

		while (w <= 5) {

			System.out.print("w:" + w + " ");
			w++; // 반복문 탈출 문장이 반드시 필요
		}

		System.out.println("\n반복문 탈출 후 w : " + w);

		System.out.println();

		w = 0;
		while (true) {
			++w;
			if (w == 10)
				break;
			if (w == 5)
				continue;
			System.out.println("w=" + w + " ");

		}

		System.out.println(); // 먼저 찍고 조건 판단 아니기 때문에 빠져나옴
		w = 10;
		do {
			System.out.println("w=" + w + " ");
			w++;
		} while (w <= 5);

		System.out.println();

		// 문1) 1 ~ 100사이의 숫자 중 3의 배수이나 2의 배수가 아닌 수를 출력하고 합과 갯수도 출력
		// 문2) -1, 3 ,-5 ,7, -9 ,11 ~99까지의 합
		// 문3) 1~ 1000 사이의 소수와 그 갯수를 출력
		// 소수 : 1보다 크고 1 과 그 수 자체로만 나누어 떨어지는 수
		// 방법 1: while

		// 방법 2: for

		// 문4) 키보드로 숫자 입력 : 5
		// 5까지의 합 출력
		// 계속할까요? (y/n) 묻게하고 y면 다시 키보드로 정수 받아 합 출력하고 n이면 탈출

		// 문5)

		// 1번
		int ca = 0;
		int ba = 0;
		int sum = 0;

		while (ca <= 100) {
			++ca;
			if (ca % 3 == 0 && ca % 2 != 0) {

				System.out.print(ca + " ");
				ba++;
				sum += ca;

			}

		}
		System.out.println();
		System.out.println(sum);
		System.out.println("개수 :" + ba);
		System.out.println();

		// 2번
		int sum1 = 1;
		int plus = 0;
		int minus = 0;
		int count = 1;

		for (int i = 1; i < 100; i++) {
			if (i % 2 != 0) {

				if (count % 2 != 0) {
					minus += i * -1;
					System.out.print(minus);

				} else {
					plus += i;
					
				}
				count+=1;

			}	
		
		}
		System.out.println();
		System.out.println(plus);
		System.out.println(minus);
		System.out.println(plus + minus);

		// 3번
//		int sum5 = 0;
//	
//		for (int co = 2; co < 1000; co++) {
//			int count = 0;
//
//			for (int i = 1; i <= co; i++) {
//				if (co % i == 0) {
//					count += 1;
//
//				}
//
//			}
//			if (count == 2) {
//				sum5 += co;
//				System.out.println(co);
//
//			}
//
//		}
//		System.out.println(sum5);
//		
//	
//		System.out.println();
//
//		
	}
}
