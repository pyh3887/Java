package pack1_200206;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class SwingPart2 extends JPanel implements ActionListener {

	JButton btnR, btnG, btnB;
	JTextArea txtArea = new JTextArea("", 10, 50);
	JMenuBar mBar;
	JMenuItem mnuMes, MnuOk, mnuInput;

	public SwingPart2() {
		setLayout(new BorderLayout()); // FLOW > BORDER레이아웃으로 바꿈
		btnR = new JButton("빨강");
		btnG = new JButton("초록");
		btnB = new JButton("파랑");
		btnR.addActionListener(this);
		btnG.addActionListener(this);
		btnB.addActionListener(this);

		JPanel panel = new JPanel();
		panel.add(btnR);
		panel.add(btnG);
		panel.add(btnB);

		add("South", panel);
		add("Center", txtArea);

		menuProcess();
	}

	private void menuProcess() {
		mBar = new JMenuBar();

		JMenu menu = new JMenu("대화상자"); // 1.메뉴 생성
		mnuInput = new JMenuItem("메세지"); // 2.메뉴에 넣을 아이템들을 만듥
		MnuOk = new JMenuItem("확인");
		mnuMes = new JMenuItem("입력");
		menu.add(mnuInput); // 3.메뉴에 메뉴아이템을넣고
		menu.add(mnuMes);
		menu.add(MnuOk);

		mBar.add(menu); // 4. 메뉴바에 메뉴 등록

		mnuMes.addActionListener(this);
		MnuOk.addActionListener(this);
		mnuInput.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getSource());
		if (e.getSource() == btnR) {
			txtArea.setBackground(Color.red);
		} else if (e.getSource() == btnG) {
			txtArea.setBackground(Color.BLACK);

		} else if (e.getSource() == btnB) {
			txtArea.setBackground(Color.CYAN);
		} else if (e.getSource() == mnuMes) {
			JOptionPane.showMessageDialog(this, "메세지", "알림", JOptionPane.INFORMATION_MESSAGE);
			System.out.println("Model DialogBox가 닫히면 수행");
		} else if (e.getSource() == mnuInput) {
			int re = JOptionPane.showConfirmDialog(this, "버튼 선택", "골라", JOptionPane.YES_NO_CANCEL_OPTION);

			// System.out.println(re);
			// JOptionPane.showMessageDialog(this, "메세지 : " + re);
			switch (re) {
			case JOptionPane.YES_OPTION:
				txtArea.append("예 선택\n");
				break;
			case JOptionPane.NO_OPTION:
				txtArea.append("아니오 선택\n");

				break;
			case JOptionPane.CANCEL_OPTION:
				txtArea.append("취소 선택\n");
				break;

			}
		} else if (e.getSource() == MnuOk) {
			String str = JOptionPane.showInputDialog(this, "자료입력");
			txtArea.append(str + "\n");
		}

	}

}
