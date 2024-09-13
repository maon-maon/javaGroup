package T19_DataBase.t04db1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HoewonDAO {
	Connection conn = null; //연결
	PreparedStatement pstmt =null;//테이블 관리
	ResultSet rs =null;  //결과받기
	
	HoewonVO vo = null; //생성은 사용하는곳에서
	String sql = "";
	
	public HoewonDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/javagroup";
			String user = "root";
			String password = "1234";
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 검색 실패" + e.getMessage());
		} catch (SQLException e) {
			System.out.println("DB 연동 실패" + e.getMessage());
		}
	}
	
	public void connClose() {
		try {
			if(conn !=null) conn.close();
		} catch (SQLException e) {}
	}
	
	public void pstmtClose() {
		try {
			if(pstmt !=null) pstmt.close();
		} catch (SQLException e) {}
	}
	
	public void reClose() {
		try {
			if(pstmt !=null) pstmt.close();
		} catch (SQLException e) {}
		pstmtClose();
//------------------여기까지 만드는게 DAO		
	}
}
