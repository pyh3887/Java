package pack1_200206;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test extends JFrame {

	public Test() {

		setTitle("시작");
		setBounds(400, 300, 200, 400);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void ddFrame() {
		
		
		setLayout(new GridLayout(2,1));
		JLabel jlabel = new JLabel();
		
		
		

	}
	
	public static void main(String[] args) {
		
		new Test();
		
		
		
	}

}
