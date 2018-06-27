package test.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import test.dao.MemberDao;
import test.dto.MemberDto;

@SuppressWarnings("serial")
public class JTableTest extends JFrame implements ActionListener, MouseListener {
	// 필드
	DefaultTableModel model = null;
	JTable table = null;
	int selectedRow = -1;
	final String INSERT = "insert";
	final String UPDATE = "update";
	final String DELETE = "delete";
	final String QUERY = "query";
	final String CANCEL = "cancel";
	final String CONFIRM = "confirm";
	boolean isEdit = false;
	JButton btnInsert = null;
	JButton btnUpdate = null;
	JButton btnDelete = null;
	JButton btnQuery = null;
	JButton btnCancel = null;
	JButton btnConfirm = null;
	
	// 생성자
	public JTableTest() {
		
		// 레이아웃 법칙을 BorderLayout 으로 설정
		setLayout(new BorderLayout());
		
		// 테이블의 칼럼명
		String[] colNames = {"번호", "이름", "주소"};
		// 테이블에 연결할 모델 객체
		model = new DefaultTableModel(colNames, 0) {
			@Override
			public boolean isCellEditable(int row, int column) {
				if(column == 0) {
					if(!isEdit) return false;
				}
				return super.isCellEditable(row, column);
			}
		};
		
		// 테이블 객체를 생성하고
		table = new JTable();
		// 모델을 연결하기
		table.setModel(model);
		table.addMouseListener(this);

		// 테이블을 스크롤 패널에 붙이고
		JScrollPane scPane = new JScrollPane(table);
		
		// 스크롤 패널을 프레임의 가운데에 배치
		add(scPane, BorderLayout.CENTER);

		// 가운데 패널을 만들고
		JPanel northPanel = new JPanel();
		
		btnInsert = MakeButton("삽입", INSERT);
		btnUpdate = MakeButton("수정", UPDATE);
		btnDelete = MakeButton("삭제", DELETE);
		btnQuery = MakeButton("검색", QUERY);
		northPanel.add(btnInsert);
		northPanel.add(btnUpdate);
		northPanel.add(btnDelete);
		northPanel.add(btnQuery);
		// 버튼이 붙은 패널을 프레임의 북쪽에 배치
		add(northPanel, BorderLayout.NORTH);
		
		JPanel southPanel = new JPanel();
		btnCancel = MakeButton("취소", CANCEL);
		btnConfirm = MakeButton("확인", CONFIRM);
		btnCancel.setEnabled(false);
		btnConfirm.setEnabled(false);
		southPanel.add(btnCancel);
		southPanel.add(btnConfirm);
		add(southPanel, BorderLayout.SOUTH);
		
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	JButton MakeButton(String caption, String cmdName) {
		JButton btn = new JButton(caption);
		btn.addActionListener(this);
		btn.setActionCommand(cmdName);
		
		return btn;
	}
	
	public static void main(String[] args) {
		new JTableTest();
	}

	void doCancel() {
		setState(false);
		model.removeRow(model.getRowCount()-1);
	}
	void doConfirm() {
		int row = model.getRowCount()-1;
		int num= Integer.parseInt(model.getValueAt(row, 0).toString());
		String name= model.getValueAt(row, 1).toString();
		String addr= model.getValueAt(row, 1).toString();
		
		MemberDto dto = new MemberDto(num, name, addr);
		MemberDao.getInstance().insert(dto);
		setState(false);
	}
	void doInsert() {
		setState(true);
		model.addRow(new Object[]{null,null,null,null});
	}
	
	void doUpdate() {
		setState(false);
		int cnt = model.getRowCount();
		for(int i=0; i<cnt; i++) {
			int num = Integer.parseInt(model.getValueAt(i, 0).toString());
			String name = model.getValueAt(i, 1).toString();
			String addr = model.getValueAt(i, 2).toString();
			MemberDto dto = new MemberDto(num, name, addr);
			MemberDao.getInstance().update(dto);
		}
		JOptionPane.showMessageDialog(this, "수정되었습니다");
	}
	
	void doDelete() {
		setState(false);

		if(selectedRow == -1) {
			JOptionPane.showMessageDialog(this, "자료를 선택하세요");
		} else {
			int empno = Integer.parseInt(model.getValueAt(selectedRow, 0).toString());
			MemberDao.getInstance().delete(empno);
			JOptionPane.showMessageDialog(this, "삭제되었습니다");
			doQuery();
		}
	}
	
	void doQuery() {
		setState(false);
		selectedRow = -1;
		model.setNumRows(0);
		MemberDao dao = MemberDao.getInstance();
		List<MemberDto> list = dao.getList();
		for(MemberDto dto : list) {
			model.addRow(dto.toArray());
		}
	}
	
	void setState(boolean tf) {
		isEdit = tf;
		btnCancel.setEnabled(tf);
		btnConfirm.setEnabled(tf);
		btnInsert.setEnabled(!tf);
		btnUpdate.setEnabled(!tf);
		btnDelete.setEnabled(!tf);
		btnQuery.setEnabled(!tf);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		switch(cmd) {
		case INSERT: doInsert(); break;
		case UPDATE: doUpdate(); break;
		case DELETE: doDelete(); break;
		case QUERY: doQuery(); break;
		case CANCEL: doCancel(); break;
		case CONFIRM: doConfirm(); break;
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		selectedRow = table.getSelectedRow();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
