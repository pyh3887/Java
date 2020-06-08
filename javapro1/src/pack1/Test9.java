package pack1;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		// 반복문 for

		
		int a;
		int sum = 0;
//		for(a = 1; a <= 5; a++) { //for(초기지, 목적치, 증감치){ 수행문...}

		for (a = 1; a <= 10; a += 1) {
			System.out.print(a + "\t");
			sum += a;
//			a = 7;  x for문 안에서는 변수에 영향을 줘선 안됌

		}
		System.out.println("\nfor 탈출후 a :" + a);
		System.out.println("합은 :" + sum);

		System.out.println();
		for (int i = 65; i <= 90; i++) { // i값을 문자로 변환 아스키코드로 출력
			System.out.print((char) i + " ");

		}
		System.out.println(); // i값을 문자로 치환 int 값이기 때문에 숫자로 출력
		for (int i = 'A'; i <= 'Z'; i++) {
			System.out.print(i + " ");
		}

		System.out.println();
		for (int i = 10; i > 1; i -= 2) {
			System.out.print(i + " ");
		}

		System.out.println();
		for (int ytn = 0, tvn = 5; ytn <= 5; ytn++, tvn++) { // 초기 변수값 두개 선언
			System.out.println(ytn + " " + tvn);
		}

		System.out.println();
		int aa = 1;
		for (; aa <= 5; aa++) { // 초기 변수값을 먼저줌
			System.out.println(aa + " ");

		}

		System.out.println();

		// 문1) 키보드로부터 숫자를 입력받아 (2~ 9 사이만 허용) 구구단 출력
		// 2 * 1 = 2....
		
		// 문2) 1 ~ 100사이의 숫자 중 3의 배수이면서 5의 배수의 갯수 그들의 합

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int gu = sc.nextInt();
		if (gu < 2 || gu > 9) {
			System.out.println("숫자는 2~9 사이만 허용 됩니다");
		} else {

			int x = 1;
			int y = gu * x;

			for (x = 1; x < 10; x++) {
				System.out.println(gu + "*" + x + "=" + (gu * x));
			}

		}

		int i, z = 0;

		int sum1 = 0;

		for (i = 1; i <= 100; i++) {

			if (i % 3 == 0 && i % 5 == 0) {

				sum1 += i;
				z++;

			}

		}
		System.out.println(sum1);
		System.out.println(z);

	}

}
