package test.frame;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class TestFrame04 extends JFrame implements ActionListener {
	
	// 버튼의 참조값을 저장할 필드
	JButton btn1, btn2, btn3;
	public TestFrame04() {
		// 프레임의 레이아웃 설정
		setLayout(new FlowLayout());
		
		// 버튼
		btn1 = new JButton("저장");
		btn2 = new JButton("수정");
		btn3 = new JButton("삭제");
		
		// 버튼에 리스너 등록하기
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
		// 프레임에 버튼 추가
		add(btn1);
		add(btn2);
		add(btn3);
		
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TestFrame04();
	}

	// 버튼을 누르면 호출되는 메소드
	@Override
	public void actionPerformed(ActionEvent e) {
		Object which = e.getSource();
		
		if(which == btn1) {
			JOptionPane.showMessageDialog(this, "저장 합니다.");
		} else if(which == btn2) {
			JOptionPane.showMessageDialog(this, "수정 합니다.");
		} else if(which == btn3) {
			JOptionPane.showMessageDialog(this, "삭제 합니다.");
		}
	}
}
