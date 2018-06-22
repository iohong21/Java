package test.UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JOptionPaneTest extends JFrame implements ActionListener {
	public JOptionPaneTest() {
		JButton alertBtn = new JButton("알림버튼");
		JButton inputBtn = new JButton("입력버튼");
		JButton confirmBtn = new JButton("확인버튼");
		
		// 버튼의 액션명 지정
		alertBtn.setActionCommand("alert");
		inputBtn.setActionCommand("input");
		confirmBtn.setActionCommand("confirm");
		
		alertBtn.addActionListener(this);
		inputBtn.addActionListener(this);
		confirmBtn.addActionListener(this);
		
		// 패널을 만들어서
		JPanel panel = new JPanel();
		
		// 패널에 버튼 추가하고
		panel.add(alertBtn);
		panel.add(inputBtn);
		panel.add(confirmBtn);
		
		// 프레임에 패널 추가
		add(panel);
		
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JOptionPaneTest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		switch(command) {
		case "alert": // 알림 띄우기
			JOptionPane.showMessageDialog(this, "알림!!");
			break;
			
		case "input": // 입력창 띄우기
			String msg = JOptionPane.showInputDialog(this, "이름 입력");
			System.out.println("이름은: " + msg);
			break;
			
		case "confirm": // 확인창 띄우기
			int which = JOptionPane.showConfirmDialog(this, "삭제 할까요?");
			switch(which) {
			case JOptionPane.YES_OPTION:
				System.out.println("삭제 했습니다.");
				break;
				
			case JOptionPane.NO_OPTION:
				System.out.println("삭제 안합니다.");
				break;
				
			case JOptionPane.CANCEL_OPTION:
				System.out.println("취소했습니다.");
				break;
			}
			break;
		}
	}
}
