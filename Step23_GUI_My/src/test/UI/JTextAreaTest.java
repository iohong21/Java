package test.UI;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class JTextAreaTest extends JFrame implements ActionListener {
	JTextArea ta = null;
	// 생성자
	public JTextAreaTest() {
		// 여러줄의 문자열을 입력할 수 있는 JTextArea 객체
		ta = new JTextArea("Welcome!");
		
		// 위치와 크기 정하기
		ta.setBounds(10, 10, 300, 300);
		
		// 배경색 지정
		ta.setBackground(Color.YELLOW);
		
		// 프레임에 JTextArea 추가
		add(ta);
		
		JButton sendBtn = new JButton("전송");
		sendBtn.setBounds(10, 310, 300, 50);
		sendBtn.addActionListener(this);
		
		add(sendBtn);
		
		
		// 레이아웃 메니져 없이 배치 하기 위해
		setLayout(null);
		
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JTextAreaTest();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String msg = ta.getText();
		System.out.println(msg);
		ta.setText("");
	}
}
