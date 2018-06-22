package test.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class TestFrame05 extends JFrame implements ActionListener {
	public TestFrame05() {
		// 프레임의 레이아웃 설정
		setLayout(new BorderLayout());
		
		// 버튼
		JButton btn1 = new JButton("저장");
		JButton btn2 = new JButton("수정");
		JButton btn3 = new JButton("삭제");
		
		// 버튼의 액션 command 설정 하기
		btn1.setActionCommand("save");
		btn2.setActionCommand("update");
		btn3.setActionCommand("delete");
		
		// 버튼에 리스너 등록하기
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
		// 패널 객체
		JPanel pane1 = new JPanel();
		pane1.add(btn1);
		pane1.add(btn2);
		pane1.add(btn3);
		
		// 패널을 프레임 남쪽에 추가
		add(pane1, BorderLayout.SOUTH);
		
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	JButton MakeButton(String caption, String cmd) {
		JButton btn = new JButton(caption);
		btn.setActionCommand(cmd);
		btn.addActionListener(this);
		
		return btn;
	}
	
	public static void main(String[] args) {
		new TestFrame05();
	}

	// 버튼을 누르면 호출되는 메소드
	@Override
	public void actionPerformed(ActionEvent e) {
		// 눌러진 버튼의 액션 command 읽어오기
		String command = e.getActionCommand();
		
		switch(command) {
		case "save":
			JOptionPane.showMessageDialog(this, "저장 합니다.");
			break;
			
		case "update":
			JOptionPane.showMessageDialog(this, "수정 합니다.");
			break;
			
		case "delete":
			JOptionPane.showMessageDialog(this, "삭제 합니다.");
			break;
		}
	}
}
