package pack5;

public class DogMain {
	public static void main(String[] args) {
		
		
		Dog dog = new Dog();
		dog.print();
		System.out.println(dog.callName());
		System.out.println("1----------------");
		
		
		HouseDog hd = new HouseDog("집 개");
		hd.print();
		hd.show();
		System.out.println(hd.callName());
		System.out.println("2----------------");
		Wolf wd = new Wolf("늑대");
		wd.print();
		wd.show();
		System.out.println(wd.callName());
		wd.display();
		
		System.out.println("3------------------");
		System.out.println();
		
		Wolf bushdog = wd;	//bush dog = wolf를 받음
		bushdog.print();
		
		System.out.println();
		Dog dog2 = wd;	//Dog > wolf(promotion) wd = wolf but wolf extends dog 이기 때문에 치환가능.
		dog2.print(); //자식클래스를 오버라이딩 메소드 실행. 단 오버라이딩되어있는 메소드만가능
		//dog2.display(); //호출불가능 wolf 고유 메소드
		
		//bushdog = dog2; //부모타입의 객체변수는 자식에게 치환x
		wd = (Wolf)dog2; 	//Casting
		wd.print();
		
		
		
		System.out.println("4--------------");
		Dog coyote = new Dog("코요태");
		coyote.print();	//coyote 는 Dog를 가짐
		coyote = bushdog;	//프로모션  
		coyote.print();		//Wolf print()
		coyote = hd;	//프로모션 
		coyote.print();	//HouseDog print()
		
		
		
		
	}
}
