package test.UI;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class JRadioButtonTest extends JFrame implements ActionListener {
	// 필드
	private JRadioButton ra_man, ra_woman; 
	
	// 생성자
	public JRadioButtonTest() {
		ra_man = new JRadioButton("남성");
		ra_woman = new JRadioButton("여성");
		
		// 라디오 버튼을 그룹으로 만들기 
		ButtonGroup group = new ButtonGroup();
		group.add(ra_man);
		group.add(ra_woman);

		// 라디오 버튼의 위치와 크기
		ra_man.setBounds(10, 10, 100, 30);
		ra_woman.setBounds(10, 40, 100, 30);

		ra_man.setActionCommand("man");
		ra_woman.setActionCommand("woman");
		
		ra_man.addActionListener(this);
		ra_woman.addActionListener(this);
		
		// 라디오 버튼을 프레임에 추가
		add(ra_man);
		add(ra_woman);
		
		// 첫 번째 라디오 버튼이 선택된 상태로
		ra_man.setSelected(true);
		
		// 레이아수 메니져 사용하지 않기
		setLayout(null);
		
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
	}
	
	public static void main(String[] args) {
		new JRadioButtonTest();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String command = arg0.getActionCommand();
		if(command.equals("man")) {
			JOptionPane.showMessageDialog(this, "남성");
		} else if(command.equals("woman")) {
			JOptionPane.showMessageDialog(this, "여성");
		}
//		if(ra_man.isSelected()) {
//			JOptionPane.showMessageDialog(this, "남성");
//		} else if(ra_woman.isSelected()) {
//			JOptionPane.showMessageDialog(this, "여성");
//		}
	}
}
