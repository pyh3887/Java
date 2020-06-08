package practice;

import java.util.Scanner;

public class Machine {
	private CoinIn co = new CoinIn();
	private int cupcount;

	void showdata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("동전을 입력하세요");
		co.setCoin(sc.nextInt());
		System.out.println("몇 잔을 원하세요");
		cupcount = sc.nextInt();
		System.out.println();
		System.out.println(co.calc(cupcount));
	}
	
	

}
