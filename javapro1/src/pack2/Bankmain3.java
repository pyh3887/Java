package pack2;

import pack3.Bank;

public class Bankmain3 {

	public static void main(String[] args) {
		// 다른 project의 클래스는 import 불가. 물리적으로 복사해야됌
		
		Bankmain3 john = new Bank();
		System.out.println(john.getMoney());
		john.dePosit(3222);
		john.withDraw(5000);
		System.out.println(john.getMoney());
		
	
	}

}
