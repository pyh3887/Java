package sample;

import java.awt.Frame;	//Frame 클래스 호출

public class Myframe1 {		//포함!

	private Frame fr;	//fr 인스턴스에 클래스 주소참조

	public Myframe1() {
		System.out.println("생성");
		fr = new Frame("포함 연습용");	//객체생성 
		displaywindow();
	}

	public void displaywindow() {

		System.out.println("윈도우");
		fr.setSize(500, 300);
		fr.setLocation(200, 150);
		fr.setVisible(true);
	}

	public static void main(String[] args) {

//		Myframe1 frame1 = new Myframe1();	//frame1 객체변수선언한이유:클래스내에 멤버
//		frame1.displaywindow();				//지정하기위해.
		new Myframe1();
	}	
}
