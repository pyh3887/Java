package pack1_200207_Swing;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Memojang extends JFrame implements ActionListener {

	private JButton btnCopy = new JButton("copy");
	private JButton btnPaste = new JButton("paste");
	private JButton btnCut = new JButton("cut");
	private JButton btnDel = new JButton("del");
	private JPanel pn = new JPanel();
	private JTextArea txtMemo = new JTextArea("", 10, 30);
	private String copyText;

	// 메뉴
	private JMenuItem mnuNew, mnuSave, mnuOpen, mnuExit;
	private JMenuItem mnuCopy, mnuPaste, mnuCut, mnuDel;
	private JMenuItem mnuAbout, mnuEtc1, mnuEtc2;

	// POPup 메뉴
	JPopupMenu popup;
	JMenuItem m_white, m_blue, m_red;

	public Memojang() {
		super("간단 메모장");
		initLayout();
		menuLayout();
		setBounds(300, 300, 500, 400);
		setVisible(true);

		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {

				int re = JOptionPane.showConfirmDialog(Memojang.this, "정말 종료할까요?", "종료", JOptionPane.YES_NO_OPTION);
				if (re == JOptionPane.YES_OPTION) {
					setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				} else {
					setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

				}
			}

		});

	}

	private void menuLayout() {

		JMenuBar menuBar = new JMenuBar();

		JMenu mnuFile = new JMenu("파일"); // 주메뉴 1
		mnuNew = new JMenuItem("새문서"); // 부메뉴
		mnuOpen = new JMenuItem("열기...");
		mnuSave = new JMenuItem("저장...");
		mnuExit = new JMenuItem("끝내기");
		mnuFile.add(mnuNew);
		mnuFile.add(mnuOpen);
		mnuFile.add(mnuSave);
		mnuFile.addSeparator(); // 성격이 다르기 때문에 구분선
		mnuFile.add(mnuExit);

		JMenu mnuEdit = new JMenu("편집"); // 주메뉴 2
		mnuCopy = new JMenuItem("복사");
		mnuPaste = new JMenuItem("붙여넣기");
		mnuCut = new JMenuItem("잘라내기");
		mnuDel = new JMenuItem("삭제");
		mnuEdit.add(mnuCopy);
		mnuEdit.add(mnuPaste);
		mnuEdit.add(mnuCut);
		mnuFile.addSeparator();
		mnuEdit.add(mnuDel);

		JMenu mnuHelp = new JMenu("도움말"); // 주메뉴
		mnuAbout = new JMenuItem("메모장이란...");
		JMenu mnuEtc = new JMenu("기타");
		mnuEtc1 = new JMenuItem("계산기");
		mnuEtc2 = new JMenuItem("프리챌");
		mnuEtc.add(mnuEtc1); // 부메뉴아래 부메뉴
		mnuEtc.add(mnuEtc2);
		mnuHelp.add(mnuAbout);
		mnuHelp.add(mnuEtc);

		menuBar.add(mnuFile); // 메뉴바에 메뉴 등록
		menuBar.add(mnuEdit);
		menuBar.add(mnuHelp);
		setJMenuBar(menuBar); // 프레임에 메뉴바등록

		mnuNew.addActionListener(this);
		mnuOpen.addActionListener(this);
		mnuSave.addActionListener(this);
		mnuExit.addActionListener(this);

		mnuCopy.addActionListener(this);
		mnuPaste.addActionListener(this);
		mnuCut.addActionListener(this);
		mnuDel.addActionListener(this);

		mnuAbout.addActionListener(this);
		mnuEtc1.addActionListener(this);
		mnuEtc2.addActionListener(this);

		// popup menu
		popup = new JPopupMenu();
		JMenu m_color = new JMenu("배경색 선택");
		m_white = new JMenuItem("하양");
		m_blue = new JMenuItem("파랑");
		m_red = new JMenuItem("빨강");

		m_color.add(m_white);
		m_color.add(m_blue);
		m_color.add(m_red);
		popup.add(m_color);
		txtMemo.add(popup);

		m_white.addActionListener(this);
		m_blue.addActionListener(this);
		m_red.addActionListener(this);

		txtMemo.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {

				if (e.getModifiers() == MouseEvent.BUTTON3_MASK) {
					popup.show(txtMemo, e.getX(), e.getY());
				}

			}
		});

	}

	private void initLayout() {

		pn.add(btnCopy);
		pn.add(btnPaste);
		pn.add(btnCut);
		pn.add(btnDel);
		add("South", pn);
		JScrollPane sc = new JScrollPane(txtMemo);
		add("Center", sc);

		btnCopy.addActionListener(this);
		btnPaste.addActionListener(this);
		btnCut.addActionListener(this);
		btnDel.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCopy || e.getSource() == mnuCopy) {
			copyText = txtMemo.getSelectedText();

		} else if (e.getSource() == btnPaste || e.getSource() == mnuPaste) {
			int position = txtMemo.getCaretPosition();

			txtMemo.insert(copyText, position);

		} else if (e.getSource() == btnCut || e.getSource() == mnuCut) {
			copyText = txtMemo.getSelectedText();

			int start = txtMemo.getSelectionStart();
			int end = txtMemo.getSelectionEnd();
			txtMemo.replaceRange("", start, end);

		} else if (e.getSource() == btnDel || e.getSource() == mnuDel) {
			int start = txtMemo.getSelectionStart();
			int end = txtMemo.getSelectionEnd();
			txtMemo.replaceRange("", start, end);

		} else if (e.getSource() == mnuNew) {
			txtMemo.setText("");
			setTitle("제목없음");

		} else if (e.getSource() == mnuOpen) {
			FileDialog dialog = new FileDialog(this, "열기", FileDialog.LOAD);
			dialog.setDirectory(".");
			dialog.setVisible(true);
			if (dialog.getFile() == null)
				return;
			String dfName = dialog.getDirectory() + dialog.getFile();

			try {
				BufferedReader reader = new BufferedReader(new FileReader(dfName));
				txtMemo.setText("");
				String line;

				while ((line = reader.readLine()) != null) {
					txtMemo.append(line + "\n");

				}
				reader.close();
				this.setTitle(dialog.getFile());

			} catch (Exception e2) {
				System.out.println("open err: " + e2.getMessage());
			}

		} else if (e.getSource() == mnuSave) {

			// 저장을 위한 경로명 및 파일명 등을 얻기 위한 운영체제의 대화상자

			FileDialog dialog = new FileDialog(this, "저장", FileDialog.SAVE);
			dialog.setDirectory(".");
			dialog.setVisible(true);
			if (dialog.getFile() == null)
				return;
			String dfName = dialog.getDirectory() + dialog.getFile();

			try {
				BufferedWriter writer = new BufferedWriter(new FileWriter(dfName));
				writer.write(txtMemo.getText());
				writer.close();
				this.setTitle(dialog.getFile());

			} catch (Exception e2) {
				System.out.println("save err" + e2);
			}

		} else if (e.getSource() == mnuExit) {
			// ....
			System.exit(0);

		} else if (e.getSource() == mnuAbout) {
			new MemoAbout(this);

		} else if (e.getSource() == mnuEtc1) {
			try {
				Runtime runtime = Runtime.getRuntime();
				runtime.exec("calc.exe");

			} catch (Exception e2) {

			}

		} else if (e.getSource() == mnuEtc2) {
			try {
				Runtime.getRuntime().exec("calc.exe");

			} catch (Exception e2) {

			}
		} else if (e.getSource() == m_white) {
			txtMemo.setBackground(Color.white);
		} else if (e.getSource() == m_blue) {
			txtMemo.setBackground(Color.blue);
		} else if (e.getSource() == m_red) {
			txtMemo.setBackground(Color.red);
		}

		txtMemo.requestFocus();

	}

	public static void main(String[] args) {
		new Memojang();
		/*
		String ss = "1;2;3;4;5";
		String ar[] = ss.split(";");
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		*/

	}

}
