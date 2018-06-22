package test.frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class TestFrame01 extends JFrame {
	public TestFrame01() {
		// 버튼 객체 생성해서
		JButton button = new JButton("Click Me");
		
		// 버튼에 액션 리스너 틍록하기
		button.addActionListener(listener);
		
		// 이 프레임에 추가하기
		add(button);
		
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	// ActionListener type 객체
	ActionListener listener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(TestFrame01.this, "버튼을 눌렀네");
		};
	};
	
	public static void main(String[] args) {
		new TestFrame01();
	}
}
