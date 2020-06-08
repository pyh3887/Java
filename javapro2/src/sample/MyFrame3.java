package sample;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyFrame3 extends Frame implements WindowListener, MouseListener {

	public MyFrame3() { // 가능하면 생성자안에서 값을 넣지않을것 비슷한 성격끼리 메소드를만듬
//		tilte(String )
		super("name");
//		super("인터페이스 연습");
		setSize(300, 200);
		setLocation(200, 200);
		setVisible(true);
		
		

		// 이벤트 리스너를 해당 오브젝트에 장착
		addWindowListener(this);
		addMouseListener(this);
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("HI");
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("굿바이");

	}

	@Override
	public void windowClosing(WindowEvent e) {
		//this.setTitle("반가워");
		System.exit(0);

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("OH MY");

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("불금");

	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("자바만세");

	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("뭘까.");
	}
	
	int aa = 0;
	@Override
	public void mouseClicked(MouseEvent e) {
//			aa ++;
//			System.out.println("aa : " + aa);
//			setBackground(new Color(255,255,0));
//			System.out.println((int)Math.random() * 255);
			int r = ((int)Math.random() * 255);
			int g = ((int)Math.random() * 255);
			int b = ((int)Math.random() * 255);
			setBackground(new Color(r,g,b));
			
			
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}@Override
	public void mousePressed(MouseEvent e) {
		
		
	}@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	

	public static void main(String[] args) {

		new MyFrame3();

	}
	
}
