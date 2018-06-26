package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dto.EmpDto;
import test.util.DBConnect;

public class EmpDao {
	// single tone 으로 사용할 수 있도록 구조를 잡으세요
	private static EmpDao dao = null;
	
	private EmpDao() {}
	public static EmpDao getInstance() {
		if(dao == null) {
			dao = new EmpDao();
		}
		return dao;
	}
	
	// 사원 1 명의 정보를 얻어오기
	public EmpDto getData(int empno) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		EmpDto list = null;
		
		try {
			// Connection 객체의 참조값 얻어오기
			conn = new DBConnect().getConn();
			String sql = "Select empno, ename, sal, dname, to_char(hiredate, 'YYYY\"년\" MM\"월\" DD\"일\"') as hiredate"
					   + "  from emp inner join dept on emp.deptno = dept.deptno"
					   + " where empno = ?"
					   + " order by empno";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empno);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				list = new EmpDto();
				list.setEmpno(rs.getInt("empno"));
				list.setEname(rs.getString("ename"));
				list.setSal(rs.getDouble("sal"));
				list.setDname(rs.getString("dname"));
				list.setHiredate(rs.getString("hiredate"));
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch(Exception ex) {}
		}
		
		return list;
	}
	
	// 사원 목록을 리턴해주는 메소드
	public List<EmpDto> getList() {
		Connection conn = null;
		ResultSet rs = null;
		List<EmpDto> listDto = new ArrayList<>();
		
		try {
			// Connection 객체의 참조값 얻어오기
			conn = new DBConnect().getConn();
			String sql = "Select empno, ename, sal, dname, to_char(hiredate, 'YYYY\"년\" MM\"월\" DD\"일\"') as hiredate"
					   + "  from emp inner join dept on emp.deptno = dept.deptno"
					   + " order by empno";
			rs = conn.prepareStatement(sql).executeQuery();
			while(rs.next()) {
				EmpDto emp = new EmpDto();
				emp.setEmpno(rs.getInt("empno"));
				emp.setEname(rs.getString("ename"));
				emp.setSal(rs.getDouble("sal"));
				emp.setDname(rs.getString("dname"));
				emp.setHiredate(rs.getString("hiredate"));
				listDto.add(emp);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(conn != null) conn.close();
			} catch(Exception ex) {}
		}
		return listDto;
	}
}
