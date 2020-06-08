package pack1_200206_Ex;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class SwingEx extends JFrame implements ActionListener {

	JTextField num1, num2;
	ButtonGroup group = new ButtonGroup();
	JRadioButton plus, minus, gop, na;;;
	JButton lbl1, lbl2, lbl3;
	JLabel result;

	public SwingEx() {

		super("미니 계산기");
		layoutInit();

		setBounds(400, 400, 400, 400);
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void layoutInit() {
		setLayout(new GridLayout(5, 1));

		// 1행
		JLabel su1 = new JLabel("숫자 1 :");
		num1 = new JTextField("", 20);
		JPanel pan1 = new JPanel();
		pan1.add(su1);
		pan1.add(num1);
		add(pan1);

		// 2행
		JLabel su2 = new JLabel("숫자 2 :");
		num2 = new JTextField("", 20);
		JPanel pan2 = new JPanel();
		pan2.add(su2);
		pan2.add(num2);
		add(pan2);

		// 3행
		JLabel su3 = new JLabel("연산선택");
		plus = new JRadioButton("+");
		minus = new JRadioButton("-");
		gop = new JRadioButton("*");
		na = new JRadioButton("/");
		group.add(plus);
		group.add(minus);
		group.add(gop);
		group.add(na);
		JPanel pan3 = new JPanel();
		pan3.add(su3);
		pan3.add(plus);
		pan3.add(minus);
		pan3.add(gop);
		pan3.add(na);
		add(pan3);

		// 4행
		result = new JLabel("결과 :", JLabel.CENTER);
		add(result);

		// 5행

		lbl1 = new JButton("계산");
		lbl1.addActionListener(this);
		lbl2 = new JButton("초기화");
		lbl2.addActionListener(this);
		lbl3 = new JButton("종료");
		lbl3.addActionListener(this);
		JPanel pan4 = new JPanel();
		pan4.add(lbl1);
		pan4.add(lbl2);
		pan4.add(lbl3);
		add(pan4);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 계산눌렀을때
		if (e.getSource() == lbl1) {
			if (num1.getText().equals("")) {
				result.setText("숫자1 미입력");
				num1.requestFocus();

				return;
			} else if (num2.getText().equals("")) {
				result.setText("숫자2 미입력");
				num2.requestFocus();
				return;
			}
			double soo = 0;

			if (plus.isSelected()) {
				soo = Double.parseDouble((num1.getText())) + Double.parseDouble((num2.getText()));
			} else if (minus.isSelected()) {
				soo = Double.parseDouble((num1.getText())) - Double.parseDouble((num2.getText()));
			} else if (gop.isSelected()) {
				soo = Double.parseDouble((num1.getText())) * Double.parseDouble((num2.getText()));
			} else if (na.isSelected()) {
				if (Double.parseDouble((num2.getText())) == 0) {
					System.out.println("되냐");
					result.setText("0 no");
				} else {
					soo = Double.parseDouble((num1.getText())) / Double.parseDouble((num2.getText()));

				}

			}

			String msg = "결과 : " + soo;
			result.setText(msg);
			if (Double.parseDouble((num2.getText())) == 0)
				result.setText("넌 쓰레기야");

			num1.setText(null);
			num2.setText(null);
			num1.requestFocus();
			num2.requestFocus();

		}

		if (e.getSource() == lbl2) {
			num1.setText(null);
			num2.setText(null);
			result.setText(null);
		}

		if (e.getSource() == lbl3) {
			num1.setText(null);
			num2.setText(null);
			result.setText(null);
			int re = JOptionPane.showConfirmDialog(this, "정말종료할까요?", "종료할까요?", JOptionPane.YES_NO_OPTION);

			if (re == JOptionPane.YES_NO_OPTION) {

				System.exit(0);
			}
		}

	}

}
