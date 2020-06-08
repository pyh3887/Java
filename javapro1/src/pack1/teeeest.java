package pack1;

import java.util.Scanner;

public class teeeest {
	public static void main(String[] args) {

//	int i=1;
//	int aa = 2;
//	int bb = 1;
//	int coc = 0;
//	int sum2 = 0;
//	
//	while (i < 100) {
//		while (bb <= aa) {	
//			if (aa % bb == 0) {
//			coc += 1;
//			bb++;
//		}
//		
//				if (coc == 2) {
//					sum2 += aa;
//					aa++;
//					bb=1;	
//			}
//				i++;
//			
//		}
//
//
//	}
//	System.out.println(sum2);

		// 문4) 키보드로 숫자 입력 : 5
		// 5까지의 합 출력
		// 계속할까요? (y/n) 묻게하고 y면 다시 키보드로 정수 받아 합 출력하고 n이면 탈출

		Scanner sc = new Scanner(System.in);
		boolean a=true;
		while (a) {
//			int a = sc.nextInt();
//			int count = 0;
//			int sum;
//
//			for (sum = 1; sum <= a; sum++) {
//
//				count += sum;
//
//			}
//			System.out.println(count);
			System.out.println("계속할까요 (y/n)");

			String b = sc.next();

			switch (b) {
			case "y":
				System.out.println("ooo");
				continue;

			case "n":
				System.out.println("zzzz");
				a = false;
				break;

			}
			System.out.println("d");
		}

//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b;
//		int count = 0;
//		int sum = 0;
//		while (sum <= a) {
//			sum++;
//			if (sum == a)
//				break;
//			count += sum;
//			
//			
//		}
//		System.out.println(count);
//		System.out.println("계속할까요(y/n)");
//		String b1 = sc.next();
//		while (b1 = "y") {
	}
}
