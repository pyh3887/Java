package pack1_200206;

import java.awt.Panel;

import javax.swing.JFrame;

public class SwingTest2 {

	
	public static void main(String[] args) {
		JFrame frame = new JFrame("대화상자 연습");
		SwingPart2 part = new SwingPart2();
		// .....
//		SwingPart3 part = new SwingPart3();

		frame.getContentPane().add(part
				, "Center"); // Jframe 컨테이너 부를때
		
		
		frame.setJMenuBar(part.mBar);
		
		frame.setBounds(300, 300, 400, 300);
		frame.setVisible(true);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

