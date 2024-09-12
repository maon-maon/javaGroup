package T19_DataBase.t01_Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

//데이터배이스와 연동
public class Test1DAO {
	public Test1DAO() {
		//여기에(기본생성자에) DB연결
		try {
			//1.JDBC 드라이버 검색 // 프로젝트당 1개씩 있어야 함
			Class.forName("com.mysql.jdbc.Driver");//예외처리 필수 ()안에 드라이버 적어줌 제작사 제공//Drivers는 클래스이름
			System.out.println("드라이버 검색 성공");
			
			//2.DB서버에 연결(연동)후 데이터베이스 사용준비 작업 (인증:1.서버주소2.계정3.계정비번)
			String url ="jdbc:mysql://localhost:3306/javagroup";//url=위치
			//						이름: 통신://웹서버주소or로컬서버주소:3306/데이터베이스이름
			String user ="root";
			String password ="1234";
			DriverManager.getConnection(url, user, password); //서라운딩트라이 =멀티 예외처리
			System.out.println("데이터베이스 연결 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 검색 실패 " +e.getMessage());
		} catch (SQLException e) {
			System.out.println("데이터베이스 연동 실패 "+e.getMessage());
		}
	}
}
