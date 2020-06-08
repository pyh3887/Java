package pack1;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) throws Exception {
		// 프로그램 진행 도중 외부에서 값을 얻기
		// System.out.println(args.length);
		if (args.length == 0) {
			System.out.println("외부에서 값 얻기실패");
			System.exit(0);
		}

		System.out.println("외부에서 넘어온값: " + args[0] + " " + args[1]);
		System.out.println();
		System.out.println("키보드로 값 받기");

		System.out.print("문자 입력:");

//		int mun = System.in.read(); //표준입력장치로 문자 얻기

//		System.out.println("mun:" + mun + " " + (char)mun);

		System.out.println();

		Scanner sc = new Scanner(System.in);
		System.out.print("상품명 입력 : ");
		String product = sc.next();
		System.out.println("상품명은 " + product);

		System.out.print("가격 입력 : ");
		int price = sc.nextInt();
		System.out.println("가격은 " + price);
		System.out.println("프로그램 정상종료");

	}

}
