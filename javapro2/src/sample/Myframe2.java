package sample;

import java.awt.Frame;

public class Myframe2 extends Frame {

	public Myframe2() {
		super("상속연습");
		dispwindow();
		
	}
	
	void dispwindow() {
		
		//super.setSize(500,300);	//부모 클래스
		//this.setSize(500,300);	//현재 클래스에서 setSize 메소드가 있다고 오해를할수있음.
		setSize(500, 300);	
		setLocation(200,150);
		setVisible(true);
	}
	

	public static void main(String[] args) {

		 new Myframe2();

	}

}
