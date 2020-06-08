package etc_pack;

//import pack3.Bank;
//import pack3.Animal;
//improt java.lang.System; 생략가능
import pack3.*;

public class Bankmain2 {

	public static void main(String[] args) {
		// Bank 클래스 package와 다른 package 에서 bank 를 호출
		
		Bank john = new Bank();
//		System.out.println(john.imsi);  default기 때문에 같은패키지안에서만 유효
		System.out.println(john.imsi2); //public
		System.out.println(john.getMoney());
		

	}

}
