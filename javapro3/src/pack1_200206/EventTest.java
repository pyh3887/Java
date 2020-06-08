package pack1_200206;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class EventTest extends Frame implements ActionListener {
	
	private Button btn1 = new Button("button1");	
	private Button btn2 = new Button("button2");
	private Button btn3 = new Button("button3");
	private Button btn4 = new Button("button4");
	private Button btn5 = new Button("button5");

	
	public EventTest() {
		super("이벤트 처리 연습");
		addLayout();
		setBounds(300, 300, 400, 400);
		setVisible(true);

		// 윈도우 종료 이벤트 : 내부 무명 클래스 스ㅏ용

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);

			}
		});

	}

	private void addLayout() {
		add("East", btn1);
		add("West", btn2);
		add("Center", btn3);
		add("South", btn4);
		add("North", btn5);

		btn1.addActionListener(this);
		btn2.addActionListener(this);

		btn3.addActionListener(new MyEvent());
		btn4.addMouseListener(new YourEvent());

		btn5.addMouseListener(new MouseAdapter() { // 무명클래스로 MouseListener 처리
			@Override
			public void mousePressed(MouseEvent e) {
				System.exit(0);
			}
		});

	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println(e.getActionCommand());
//		System.out.println(e.getSource());
		if (e.getSource() == btn1) {
			this.setTitle("버튼 1 클릭");

		} else if (e.getSource() == btn2) {
			this.setTitle("두번째 클릭");
		}

	}
	// 내부 클래스

	class MyEvent implements ActionListener { // 내부클래스로 MouseListener 처리

		@Override
		public void actionPerformed(ActionEvent e) {
			// setTitle("와우 세번째");
			EventTest.this.setTitle("와우 세번째");

		}

	}

	class YourEvent extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			EventTest.this.setTitle("네번째");
		}

	}

	public static void main(String[] args) {
		new EventTest();

	}

}
