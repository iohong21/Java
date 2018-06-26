package test.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import test.dao.EmpDao;
import test.dto.EmpDto;

@SuppressWarnings("serial")
public class EmpFrame extends JFrame implements ActionListener {
	// 필드
	DefaultTableModel model = null;
	JLabel count = null;
	// 생성자
	public EmpFrame() {
		
		// 레이아웃 법칙을 BorderLayout 으로 설정
		setLayout(new BorderLayout());
		
		// 테이블의 칼럼명
		String[] colNames = {"사원번호", "이름", "급여", "부서명", "입사일"};
		// 테이블에 연결할 모델 객체
		model = new DefaultTableModel(colNames, 0);
		
		// 테이블 객체를 생성하고
		JTable table = new JTable();
		// 모델을 연결하기
		table.setModel(model);

		// 테이블을 스크롤 패널에 붙이고
		JScrollPane scPane = new JScrollPane(table);
		
		// 스크롤 패널을 프레임의 가운데에 배치
		add(scPane, BorderLayout.CENTER);

		// 가운데 패널을 만들고
		JPanel northPanel = new JPanel();
		// 버튼을 만들어서
		JButton testBtn = new JButton("테스트");
		// 패널에 붙이고
		testBtn.addActionListener(this);
		northPanel.add(testBtn);
		
		// 버튼이 붙은 패널을 프레임의 북쪽에 배치
		add(northPanel, BorderLayout.NORTH);
		
		
		JPanel eastPanel = new JPanel();
		JLabel countMsg = new JLabel("검색 건수: ");
		count = new JLabel("");
		eastPanel.add(countMsg);
		eastPanel.add(count);
		add(eastPanel, BorderLayout.SOUTH);
		
		setBounds(100, 100, 800, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new EmpFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		EmpDao dao = EmpDao.getInstance();
		List<EmpDto> list = dao.getList();
		int cnt = 0;
		if(list.size() > 0) {
			for(EmpDto dto : list) {
				model.addRow(dto.toArray());
				cnt++;
			}
			count.setText(Integer.toString(cnt));
		} else {
			JOptionPane.showMessageDialog(this, "자료가 존재하지 않습니다.");
		}
	}
}
