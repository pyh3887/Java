package pack3;

public class ProMain {

	public static void main(String[] args) {
		
		System.out.println("뭔 짓을 하다가....");
		
		
		Programmer tom = new Programmer();   //프로그래머 톰
		
		//tom.Programmer(); X
		System.out.println("tom : " + tom.spec);	//
		tom.displayData();
		tom.nickname = "자바도사";
		tom.displayData();
		tom.setAge(28);
		tom.displayData();
		System.out.println("나이는" + tom.getAge());
		System.out.println(Programmer.moto);
//		tom.PI = 10;
		System.out.println(tom.PI);
		System.out.println(Programmer.PI);
		Programmer.staticMethod();
		
		System.out.println("--------------");
		
		
		Programmer oscar = new Programmer();	// 프로그래머 오스카
		oscar.displayData();
		oscar.setAge(30);
		oscar.nickname = "C 도사";
		oscar.displayData();
		
		System.out.println(oscar.getAge());
		
		
		
		//oscar = null;	//참조하고 있는 인스턴스의 주소를 잃음
		//oscar.displayData();
		
		
		
		
		
		
		

	}

}
