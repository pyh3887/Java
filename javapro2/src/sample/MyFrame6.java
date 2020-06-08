package sample;

import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyFrame6 extends Frame {

	public MyFrame6() {

		setTitle("내부 익명 클래스 사용");
		setSize(600, 400);
		setLocation(200, 200);
		setVisible(true);

		addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}

		});

	}

	public static void main(String[] args) {
		new MyFrame6();
	}

}
