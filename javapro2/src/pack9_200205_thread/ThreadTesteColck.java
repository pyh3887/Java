package pack9_200205_thread;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Calendar;

public class ThreadTesteColck extends Frame implements ActionListener, Runnable {

	private Label lblMessange;
	private Boolean b = false;
	private Thread thread;

	public ThreadTesteColck() {
		lblMessange = new Label("Display date and time", Label.CENTER);
		add("Center", lblMessange);
		lblMessange.setFont(new Font("궁서", Font.BOLD, 24));

		Button button = new Button("click"); // 밑쪽에 버튼
		add("South", button);
		button.addActionListener(this);

		setTitle("스레드 연습");
		// setSize(300,300);
		// setLocation(300,400);
		setBounds(300, 400, 500, 300);

		setVisible(true);

		addWindowListener(new WindowAdapter() { // 무명클래스로 addWindowListener의 어댑터로 closing메소드만 가져옴
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				b = true;
				System.exit(0);
			}
		});
		thread = new Thread(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// calshow();
		if (thread.isAlive())
			return;
		thread.start();

	}

	private void calshow() {

		Calendar calendar = Calendar.getInstance();
		int y = calendar.get(Calendar.YEAR);
		int m = calendar.get(Calendar.MONTH) + 1;
		int d = calendar.get(Calendar.DATE);
		int h = calendar.get(Calendar.HOUR);
		int mi = calendar.get(Calendar.MINUTE);
		int s = calendar.get(Calendar.SECOND);
		lblMessange.setText(y + "-" + m + "-" + d + "\n" + h + ":" + mi + ":" + s);

	}

	@Override
	public void run() {
		while (true) {
			if (b == true)
				break;
			calshow();
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

	public static void main(String[] args) {
		new ThreadTesteColck();
	}
}
