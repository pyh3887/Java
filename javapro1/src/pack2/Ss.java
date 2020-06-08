package pack2;

public class Ss {

	public static void main(String[] args) {
		int hap = 0; // 총합을 저장할 변수
		int temp = 1; // 양수 <-> 음수를 반복하기 위해 만든 임시 변수
		for (int j = 1; j < 100; j += 2) { // 1부터 99까지 2씩 증가
			if (temp > 0) { // temp가 양수라면
				hap = hap - j; // 음수로 저장시키고
				temp = -temp;
				System.out.println(hap);

			} else {
				hap = hap + j; // temp가 현재 음수 양수로 저장
				temp = -temp; // temp를 양수로 반전
			}
		}
		System.out.println("hap : " + hap);
	}

}
