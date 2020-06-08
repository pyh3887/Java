package pack3;

//메소드 오버로딩(메소드 재명명) : 동일한 이름의 메소드를 여러 개 선언 가능(단, 조건이 있음)

public class Animal {

	private int leg = 4;
	private int age;
	private String name;
	public final static int MOUTH = 1;

	public Animal() {
		// 생성자는 내용이 없을경우 생략가능. (컴파일러가 만들어줌)
		System.out.println("동물 생성자");

	}
	public Animal(int leg) {	//생성자 오버로딩
		this.leg = leg;
		System.out.println("동물 생성자");

	}
	public Animal(String name) {	//생성자 오버로딩
		this.name = name;
		System.out.println("동물 생성자");

	}

	public void display() {
		System.out.println("leg:" + leg + ", age:" + age + ", name:" + name);

	}

	public void display(int age) { // 메소드 오버로딩 : 이름은 같으나 인자의 갯수가 다르다. 기능은 비슷
		this.age = age;
		System.out.println("leg:" + leg + ", age:" + age + ", name:" + name);

	}

	public void display(String name) { // 메소드 오버로딩 : 이름은 같으나 인자의 type이 다르다. 기능은 비슷
		this.name = name;
		System.out.println("leg:" + leg + ", age:" + age + ", name:" + name);

	}

	public void display(String name, int age) { // 메소드 오버로딩 : 인자의 개수가 2개로 다르다. 기능은 비슷
		this.name = name;
		this.age = age;
		System.out.println("leg:" + leg + ", age:" + age + ", name:" + name);

	}

	public void display(int nai, String name) { // 메소드 오버로딩 : 인자의 순서가 다르다. 기능은 비슷
		this.name = name;
		age = nai;
		System.out.println("leg:" + leg + ", age:" + age + ", name:" + name);

	}

}
