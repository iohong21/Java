package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 *  JDBC (Java Database Connectivity) 
 *  
 *  - java 에서의 DataBase 연동 프로그래밍 연습
 *  - Oracle Database 를 연동하려면 ojdbc6.jar 파일이 사용가능한
 *    위치에 있어야 한다. DB 연동하기 위한 드라이버 클래스가 
 *    ojdbc6.jar 파일에 들어 있다. 
 */
public class MainClass03 {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			// 오라클 드라이버 로딩 (ojdbc6.jar 있어야 함)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// @접속ip주소:port번호:db이름
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			
			// .getConnection(url, 계정, 비밀번호)
			conn = DriverManager.getConnection(url,"scott","tiger");
			System.out.println("Oracle DB 접속 성공!");
		} catch(ClassNotFoundException cne) {
			cne.printStackTrace();
		} catch(SQLException se) {
			se.printStackTrace();
		}
		
		// [ member 테이블에  update 수행하기 ]
		
		int num = 1;
		String name = "이정호";
		String addr = "아현동";
		
		//필요한 객체를 담을 변수 만들기
		PreparedStatement pstmt = null;
		try {
			String sql = "Update member set name = ?, addr = ? where num = ?";
			pstmt = conn.prepareStatement(sql);
			
			// ? 에 값 바인딩 하기
			pstmt.setString(1,  name);
			pstmt.setString(2,  addr);
			pstmt.setInt(3,  num);
			
			// sql 문 수행하기
			pstmt.executeUpdate();
			System.out.println("회원 정보를 수정 했습니다.");
			
		} catch(SQLException se) {
			se.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch(Exception e) {}
		}
		System.out.println("main 메소드가 종료 됩니다.");
	}
}