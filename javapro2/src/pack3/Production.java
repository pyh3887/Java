package pack3;

public class Production {

	private String name;
	private int price;
	private String productionDay;

	public Production(String name, int price) {		//받은값을 private name, private price 로 변환
		this.name = name;	//받은값을 멤버필드로 치환
		this.price = price;	//받은값을 멤버필드로 치환

	}

	public void display() {
		System.out.println("상품명 : " + name + " 가격 :" + price + " 생산일 :" + productionDay);

	}

	public void display(String name) {
		this.name = name;
		System.out.println("상품명 : " + name + " 가격 :" + price + " 생산일 :" + productionDay);

	}

	public void display(String name, int price) {
		this.name = name;
		this.price = price;

		System.out.println("상품명 : " + name + " 가격 :" + price + " 생산일 :" + productionDay);

	}	//오버로딩의 성립조건!
		// 메소드의 이름이 같아야한다 (주로 성격이 비슷한 메소드끼리 오버로딩함)
		// 메소드의 argument(인수) 값이 달라야한다
		// argument 의 개수와 순서로도 조정가능하다.
		

	public void setProductionDay(String productionDay) {
		this.productionDay = productionDay;
	}

	
}
