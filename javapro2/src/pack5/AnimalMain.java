package pack5;

public class AnimalMain {

	public static void main(String[] args) {
		AniCow cow = new AniCow();
		System.out.println(cow.callName() + " " + cow.action() + "에 " + cow.eat() + " 먹음");
		cow.print();

		System.out.println();

		AniLion lion = new AniLion();
		System.out.println(lion.callName() + " " + lion.action() + "에" + lion.eat() + "먹음");
		lion.eatOther();
		
		AniSpider spider = new AniSpider();
		
		
		AnimalFind.find(cow);
		AnimalFind.find(lion);
		AnimalFind.find(spider);
	}

}
