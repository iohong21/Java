package test.UI;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class JCheckBoxTest extends JFrame implements ItemListener {
	JCheckBox ck1, ck2;
	public JCheckBoxTest() {
		
		ck1 = new JCheckBox("Java");
		ck1.setBounds(10, 10, 150, 30);
		
		ck2 = new JCheckBox("C++");
		ck2.setBounds(10, 40, 150, 30);
		
		ck1.addItemListener(this);
		ck2.addItemListener(this);
		
		add(ck1);
		add(ck2);
		
		setLayout(null);
		
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JCheckBoxTest();
	}

	// 아이템(JCheckBox)의 상태가 바귀었을떄 호출되는 메소드
	@Override
	public void itemStateChanged(ItemEvent e) {
		Object which = e.getSource();
		boolean isSelected = e.getStateChange()==1;
		if(which == ck1) {
			System.out.println("Java! ");
			System.out.println("체크 여부: " + isSelected);
		} else if(which == ck2) {
			System.out.println("C++ ");
			System.out.println("체크 여부: " + isSelected);
		}
	}
}
