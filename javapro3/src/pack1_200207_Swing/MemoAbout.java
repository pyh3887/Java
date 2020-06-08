package pack1_200207_Swing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MemoAbout extends JDialog implements ActionListener {

	public MemoAbout(JFrame frame) {
//		super(frame);
//		setTitle("메모장 정보");
//		setModal(true);	//모달 실행시 모달이 끝나기전까지 화면 빠져나오지못함 true: Modal . false: Modaless

		super(frame,"메모장정보",true);
		
		
		JLabel label = new JLabel("미니 메모장 ver 0.9");
		JButton btn = new JButton("확인");
		btn.addActionListener(this);
		add("Center", label);
		add("South", btn);

		setBackground(Color.LIGHT_GRAY);
		setBounds(350, 350, 350, 350);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		dispose(); // jdialog 닫기

	}

}
