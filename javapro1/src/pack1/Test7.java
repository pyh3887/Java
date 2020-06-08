package pack1;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {

		int num = 5;

		if (num >= 3) {
			System.out.println("크군요");
			System.out.println("참일 때");

		}

		num = 5;

		if (num < 3) {
			System.out.println("작군요");
			System.out.println("난 참~~");
		} else {
			System.out.println("크지않아요");
		}

		System.out.println();
		int jum = 75;
		String re = "평가 결과";
		if (jum >= 90) {
			re = "수";
		} else if (jum >= 80) {
			re = "우";
		} else if (jum >= 70) {
			re = "미";
		} else if (jum >= 60) {
			re = "양";
		} else {
			re = "가";
		}
		System.out.println(re);

		// 문) 키보드로부터 상품명 ,수량 , 단가를 입력받아 각각 입력받아 금액(수량*단가)를 출력
		// 조건 : 금액이 5만원 이상이면 금액에 10%를 그 외는 금액에 5%를 세금으로 출력
		// 출력 > 상품명: *** 금액 : *** 세금 : ***

		System.out.println();

		Scanner sc = new Scanner(System.in);
		System.out.println("상품명 : ");
		String product = sc.next();
		System.out.println("수량 : ");
		int ma = sc.nextInt();
		System.out.println("단가 : ");
		int pr = sc.nextInt();

		int aa = ma * pr;
		double se = 0.01;

		System.out.println();

		if (aa >= 50000) {
			se = aa * 0.1;

		} else {
			se = aa * 0.05;

		}
		System.out.println("상품명 : " + product + " 금액 : " + aa + " 세금 : " + se);

		System.out.println();

		System.out.println("종료");

	}

}