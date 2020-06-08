package pack1_200207_Swing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class PackMan extends JFrame implements KeyListener {

	Image image;
	int x, y, sel = 1;

	public PackMan() {
		super("상하좌우 화살표를 사용하세요");
		setIconImage(Toolkit.getDefaultToolkit().getImage("c:/work/pack/pack1.jpg"));
		setLayout(null); // 좌표에 의해서 움직임
		setBackground(Color.white);
		setResizable(false); // 창크기는고정
		setBounds(300, 300, 400, 400);
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		addKeyListener(this);
		x = (int) getWidth() / 2;
		y = (int) getHeight() / 2;
	}

	@Override
	public void paint(Graphics g) {
		switch (sel) {
		case 1:
			image = Toolkit.getDefaultToolkit().getImage("c:/work/pack/pack1.jpg");
			break;

		case 2:
			image = Toolkit.getDefaultToolkit().getImage("c:/work/pack/pack2.jpg");
			break;
		case 3:
			image = Toolkit.getDefaultToolkit().getImage("c:/work/pack/pack3.jpg");
			break;
		case 4:
			image = Toolkit.getDefaultToolkit().getImage("c:/work/pack/pack4.jpg");
			break;
		case 5:
			image = Toolkit.getDefaultToolkit().getImage("c:/work/pack/pack5.jpg");
			break;
		case 6:
			image = Toolkit.getDefaultToolkit().getImage("c:/work/pack/pack6.jpg");
			break;
		case 7:
			image = Toolkit.getDefaultToolkit().getImage("c:/work/pack/pack7.jpg");
			break;
		case 8:
			image = Toolkit.getDefaultToolkit().getImage("c:/work/pack/pack8.jpg");
			break;
		}
		g.clearRect(0, 0, getWidth(), getHeight()); // 잔상 제거
		g.drawImage(image, x - image.getWidth(this) / 2, y - image.getWidth(this) / 2, this);

	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		;

		if (key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_NUMPAD6) {
//			if(sel == 1) sel=2; else sel = 1;

			sel = (sel == 1) ? 2 : 1; // 삼항 연산자
			x = (x < 400) ? x + 10 : image.getWidth(this) - 400; // 프레임의 너비보다 낮을경우는 10씩증가
		}
		if (key == KeyEvent.VK_LEFT || key == KeyEvent.VK_NUMPAD4) {
			sel = (sel == 3) ? 4 : 3; // 삼항 연산자
			x = (x > 0) ? x - 10 : 400 + image.getWidth(this);

		}
		if (key == KeyEvent.VK_DOWN || key == KeyEvent.VK_NUMPAD5) {
			sel = (sel == 5) ? 6 : 5; // 삼항 연산자
			y = (y < getHeight()) ? y + 10 : -image.getHeight(this);
		}
		if (key == KeyEvent.VK_UP || key == KeyEvent.VK_NUMPAD8) {
			sel = (sel == 7) ? 8 : 7; // 삼항 연산자
			y = (y > 0) ? y - 10 : 400 + image.getWidth(this);

		}
		repaint();

	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	public void keyTyped(KeyEvent e) {
	}

	public static void main(String[] args) {

		new PackMan();

	}

}
