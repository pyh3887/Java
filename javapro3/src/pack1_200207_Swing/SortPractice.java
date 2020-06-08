package pack1_200207_Swing;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SortPractice extends JFrame implements ActionListener {
	JTextField num1, num2;
	JLabel label1, label2, title;
	JButton but1, but2, but3;

	public SortPractice() {
		super("정렬 연습");
		layoutInit();
		setBounds(300, 300, 400, 400);
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void layoutInit() {
		setLayout(new GridLayout(5, 1));

		// 1
		title = new JLabel("정렬연습(숫자는 10개 이하)");
		JPanel pan1 = new JPanel();
		pan1.add(title);
		add(pan1);

		// 2

		label1 = new JLabel("대상");
		num1 = new JTextField("", 10);
		JPanel pan2 = new JPanel();
		pan2.add(label1);
		pan2.add(num1);
		add(pan2);

		// 3

		label2 = new JLabel("결과");
		num2 = new JTextField("", 10);
		JPanel pan3 = new JPanel();
		pan3.add(label2);
		pan3.add(num2);
		add(pan3);

		// 4

		but1 = new JButton("Selection");
		but1.addActionListener(this);
		but2 = new JButton("Buble");
		but2.addActionListener(this);
		but3 = new JButton("Clear");
		but3.addActionListener(this);
		JPanel pan4 = new JPanel();
		pan4.add(but1);
		pan4.add(but2);
		pan4.add(but3);
		add(pan4);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == but1) {
			String sort = num1.getText();
			String ar[] = sort.split("");
			String aa = null;

			String temp;
			for (int i = 0; i < ar.length; i++) {
				for (int j = i + 1; j < ar.length; j++) {

					if (Integer.parseInt(ar[i]) > Integer.parseInt(ar[j])) {

						temp = ar[i];
						ar[i] = ar[j];
						ar[j] = temp;

					}

				}

			}

			num2.setText(Arrays.toString(ar));

		}

		if (e.getSource() == but2) {
			String sort = num1.getText();
			String ar[] = sort.split("");
			String temp;

			for (int i = 0; i < ar.length - 1; i++) {
				for (int j = 0; j < ar.length - i - 1; j++) {
					if (Integer.parseInt(ar[j]) > Integer.parseInt(ar[j + 1])) {
						temp = ar[j];
						ar[j] = ar[j + 1];
						ar[j + 1] = temp;

					}
				}
				System.out.println(ar[i]);

			}
			num2.setText(Arrays.toString(ar));
		}
		if (e.getSource() == but3) {
			num1.setText("");
			num2.setText("");
		}

	}

	public static void main(String[] args) {
		new SortPractice();

	}

}
