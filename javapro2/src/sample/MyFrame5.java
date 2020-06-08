package sample;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame5 extends Frame {
	MyClass myclass;
	Ourclass ourclass;
	int x, y; // 마우스로 폼 바닥을 찍었을 대 해당 지점 좌표
	String str[] = { "김치국", "공기밥", "김밥", "주먹밥", "박치기" };

	public MyFrame5() {

		setTitle("내부 클래스 사용");
		setSize(600, 400);
		setLocation(200, 200);
		setVisible(true);

		myclass = new MyClass();
		ourclass = new Ourclass();

		addWindowListener(myclass);
		addMouseListener(ourclass);
	}

	class MyClass extends WindowAdapter { // 내부 클래스 /windowLister은 오버라이딩을 너무많이
											// 해야하므로 어댑터 일반메소드사용

		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);

		}

	}

	class Ourclass extends MouseAdapter { // 내부 클래스

		@Override
		public void mouseClicked(MouseEvent e) { // and 유저가 호출하면
//			int m = e.getX();
//			int n = e.getY();
//			System.out.println("m : " + m);
//			System.out.println("n : " + n);
			
			setTitle("x : " + x + " " + "x : " + y);
			x = e.getX();
			y = e.getY();

//			paint(getGraphics()); // refresh X
			repaint(); // refresh 0
		}

	}

	@Override
	public void paint(Graphics g) { // 페인트 메소드
		g.setFont(new Font("굴림", Font.BOLD, (int) (Math.random() * 50 + 8)));
//		g.drawString("홍길동", x, y); // 홍길동이라는 글씨를 x 150 y 150에
		int ar = (int) (Math.random() * 5); // 난수 발생 5개의수
		g.drawString(str[ar], x, y);
	}

	public static void main(String[] args) {
		new MyFrame5();
	}

}
