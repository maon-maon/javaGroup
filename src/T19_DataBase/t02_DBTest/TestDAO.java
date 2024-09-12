package T19_DataBase.t02_DBTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// 
public class TestDAO {
	Connection conn=null;
	
	String sql ="";
	
	public TestDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/javagroup";
			String user = "root";
			String password = "1234";
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 검색 실패 "+e.getMessage());
		} catch (SQLException e) {
			System.out.println("데이터베이스 연동 실패 "+e.getMessage());
			
		}
	}

	//DB연결 종료 : 컨넥션 객체 닫기
	public void dbClose() {
		try {
			if(conn !=null)conn.close();
		} catch (SQLException e) {}
	}

	//test테이블의 전체자료 조회 //원래는 서비스에서 해야함
	//예전 프로그램은 이렇게 만들어져 있음 아라둬야 함
	public void getList() {
		 try {
			// DB검색
			Statement stmt = conn.createStatement();
			sql ="select * from test";
			ResultSet rs = stmt.executeQuery(sql);//executeQuery검색에서 사용
			
			// 출력
			System.out.println("========================================");
			System.out.println("번호\t성명\t나이\t성별\t주소");
			System.out.println("========================================");
			while(rs.next()) {
				System.out.print(rs.getInt("idx")+"\t");
				System.out.print(rs.getString("name")+"\t");
				System.out.print(rs.getInt("age")+"\t");
				System.out.print(rs.getString("gender")+"\t");
				System.out.print(rs.getString("address")+"\n");
			}
			System.out.println("========================================");
		} catch (SQLException e) {
			System.out.println("SQL오류 " +e.getMessage());
		}
	}
}
