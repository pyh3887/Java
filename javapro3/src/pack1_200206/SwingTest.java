package pack1_200206;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SwingTest extends JFrame implements ActionListener {

	JLabel lblshow;
	int count = 0;

	public SwingTest() { // 생성자

		setTitle("스윙연습");
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2, 1));	// layout 을 2행 1 열로
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30)); //~Factory 혼자 new 함
		JButton btn = new JButton("클릭");
		btn.addActionListener(this);
		panel.add(btn);	//0행
		
		lblshow = new JLabel("버튼 클릭수 : 0");
		panel.add(lblshow);
		
		
		//add("Center",panel1);
		add(panel , BorderLayout.CENTER);
		
		
		setBounds(300, 300, 400, 400);
		setVisible(true);
		
		
		/*
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);

			}

		});
		*/
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//위의 내부클래스로 종료한걸 한줄로 해결가능
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		count++;
		lblshow.setText("버튼 클릭수 : " + count);

	}

	public static void main(String[] args) {
		new SwingTest();

	}

}
