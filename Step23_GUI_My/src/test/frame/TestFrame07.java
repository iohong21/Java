package test.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class TestFrame07 extends JFrame implements ActionListener, FocusListener {
	JTextField tf1, tf2, tf3;
	JButton btn1, btn2, btn3, btn4;
	public TestFrame07() {
		final int tsize = 10;

		// 프레임의 레이아웃 설정
		setLayout(new BorderLayout());
		
		tf1 = MakeTextField(tsize);
		tf2 = MakeTextField(tsize);
		tf3 = MakeTextField(tsize);
		
		JLabel lbl = new JLabel("=");
		
		JPanel panel = new JPanel();
		panel.add(tf1);
		panel.add(MakeButton("+", "add"));
		panel.add(MakeButton("-", "sub"));
		panel.add(MakeButton("*", "mul"));
		panel.add(MakeButton("/", "div"));
		panel.add(tf2);
		panel.add(lbl);
		panel.add(tf3);
		
		add(panel, BorderLayout.WEST);
		
		setBounds(100, 100, 800, 500);
		setTitle("MyJava");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	JTextField MakeTextField(int size) {
		JTextField tf = new JTextField(size);
		tf.addFocusListener(this);
		
		return tf;
	}
	
	JButton MakeButton(String caption, String cmd) {
		JButton btn = new JButton(caption);
		btn.setActionCommand(cmd);
		btn.addActionListener(this);
		
		return btn;
	}
	
	
	public static void main(String[] args) {
		new TestFrame07();
	}

	boolean isError = false;
	// 버튼을 누르면 호출되는 메소드
	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();

		String s1 = tf1.getText();
		String s2 = tf2.getText();
		
		if(s1.length() == 0) {
			JOptionPane.showMessageDialog(this, "첫 번째 값을 입력하세요");
			return;
		}

		if(s2.length() == 0) {
			JOptionPane.showMessageDialog(this, "두 번째 값을 입력하세요");
			return;
		}

		isError = false;
		Double d1 = pharingData(tf1);
		if(isError) return;
		
		Double d2 = pharingData(tf2);
		if(isError) return;
		
		try {
			switch(cmd) {
			case "add":
				tf3.setText(Double.toString(d1 + d2));
				break;

			case "sub":
				tf3.setText(Double.toString(d1 - d2));
				break;

			case "mul":
				tf3.setText(Double.toString(d1 * d2));
				break;

			case "div":
				tf3.setText(Double.toString(d1 / d2));
				break;
			}
		} catch(Exception ex) {
			JOptionPane.showMessageDialog(this, "계산 오류 입니다");
		}
	}
	
	Double pharingData(JTextField tf) {
		Double d = 0.0;
		try {
			d = Double.parseDouble(tf.getText());
		} catch(Exception ex) {
			JOptionPane.showMessageDialog(this,  "정수를 입력해주세요");
			tf.setText("");
			isError = true;
		}
		
		return d;
	}

	@Override
	public void focusGained(FocusEvent e) {
		Object obj = e.getSource();
		((JTextField)obj).setText("");
	}

	@Override
	public void focusLost(FocusEvent e) {
	}
}
