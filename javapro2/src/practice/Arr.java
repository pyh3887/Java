package practice;

import java.util.Scanner;

public class Arr {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int m;
		int avg = 0;
		for (int i = 1; i <= n; i++) {
			m = sc.nextInt();
			for(int j = 1; j <= n; j++) {
				avg += a[j];
			}
		}
		System.out.println(avg);
	}
}
