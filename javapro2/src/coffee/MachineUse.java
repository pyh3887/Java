package coffee;

import java.util.Scanner;

public class MachineUse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CoinIn james = new CoinIn();
		System.out.print("동전을 입력하세요 : "); // coinIn calc 에 넘김
		int a = sc.nextInt();
		System.out.print("몇 잔을 원하세요 : ");
		int b = sc.nextInt();
		james.calc(a,b);
		
		
		
		
		

	}

}
