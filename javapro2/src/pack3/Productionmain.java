package pack3;

public class Productionmain {

	public static void main(String[] args) {

		Production REFE = new Production("냉장고", 300000);	//production생성자에 값추가
		
		REFE.display();	// display() 오버로딩된 메소드중 argument값이 없는 메소드실행, productionDay값은 private null값
		
		System.out.println("1---------------------");
		REFE.setProductionDay("2020-01-28");	//setProcuctionday 메소드로 값입력
		REFE.display();	// set 으로 값을 집어넣은뒤 productionDay 값 나옴(2020-01-28로 변환되어있음) 
		System.out.println("2---------------------");
		REFE.display("tv");	// 두번째 오버로딩 메소드로 들어감
		System.out.println("3---------------------");
		REFE.display("드라이기", 10000);	//세번째 오버로딩 메소드로 들어감
			
	}

}

