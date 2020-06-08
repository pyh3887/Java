package pack5;

public class MyGajok {

	public static void main(String[] args) {
		// 상속 연습

		GrandFa gr = new GrandFa(); // GrandFa 나이 80
		
		System.out.println(" 가보 :" + gr.gaboo);
		System.out.println(" 가훈 :" + gr.gahun);
		System.out.println(gr.say());
		gr.eat();
		System.out.println("할아버지 나이 : " + gr.getNai());
		
		System.out.println("1-----------------------");

		GrandFa gr2 = new GrandFa(82); // gr2 할아버지 나이 82
		System.out.println(gr2.say());
		System.out.println("할아버지 2 나이 : " + gr2.getNai());
		
		System.out.println("2-----------------------");

		System.out.println("\n아버지 --------------------");
		Father fa = new Father(); // father 의 생성자 > argument판단후 할아버지 생성자로 접근
		System.out.println(" 가보 :" + fa.gaboo);
		System.out.println(" 가훈 :" + fa.gahun);
		System.out.println(fa.say());
		fa.eat();
		System.out.println("아버지 나이 : " + fa.getNai());
		System.out.println();
		fa.showdata();

		System.out.println("\n	나--------------------");
		Me me = new Me();
		me.Biking();
		System.out.println(" 가보 :" + me.gaboo);
		System.out.println(" 가훈 :" + me.gahun);
		System.out.println(me.say());
		me.eat();
		System.out.println("내 나이 : " + me.getNai());
		
		System.out.println("------------");
		me.medata();
		
	}

}
