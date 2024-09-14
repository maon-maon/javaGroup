package T19_DataBase.t03_Hoewon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

//데이터베이스 연결 객체
//DB에 관한 내용만 전담처리
//작업이 돌아가야 하는 부분의 구현
public class HoewonDAO {
	//2.필드선언
	private Connection conn =null;//이 객체로 데이터베이스 연동 //2.1
//	Statement stmt =null; //초창기 객체 =최근 사용 안함
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	HoewonVO vo =null;
			
	String sql = "";
	
	//1.생성자 :DB연동
	public HoewonDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");//1.1
			
			String url = "jdbc:mysql://localhost:3306/javagroup";//1.2
//			String url = "jdbc:mysql://127.0.0.1:3306/javagroup";
			String user = "root";
			String password = "1234";
			conn = DriverManager.getConnection(url, user, password);//2.2
		} catch (ClassNotFoundException e) {//1.1
			System.out.println("드라이버 검색 실패 "+e.getMessage());
		} catch (SQLException e) {//1.1.1
			System.out.println("데이터베이스 연동 실패 "+e.getMessage());
			System.out.println();
		}
	}
	
	//conn닫기
	public void connClose() {//3.1 드라이버 연동이 끝나면 닫아줘야 함
		try {
			if(conn != null) conn.close();; //null이 아님=열려있음=>닫아야함. 닫는게 목적임
		} catch (SQLException e) {
			System.out.println("SQL 오류 "+e.getMessage());
		}
	}
	//pstmt닫기
	public void pstmtClose() {
		try {
			if(pstmt != null) pstmt.close();; //null이 아님=열려있음=>닫아야함. 닫는게 목적임
		} catch (SQLException e) {
			System.out.println("SQL 오류 "+e.getMessage());
		}
	}
	
	//rs(리절트셋)닫기 //rs는 pstmt에서 자료가 넘어옴. rs사용 안함=pstmt사용안함. 무조건 select에서만 사용. but 프리스테를 닫는건 안미
	public void rsClose() {
		try {//rs를 닫으면 무조건pstmt를 닫음 하지만 pstmt를 닫는다고 rs를 닫는건 아님
			if(rs != null) rs.close();; //null이 아님=열려있음=>닫아야함. 닫는게 목적임
		} catch (SQLException e) {
			System.out.println("SQL 오류 "+e.getMessage());
		}finally {
			pstmtClose();//re가 pstmt를 사용했으니까 닫음
		}
	}

	// 회원 자료 등록 처리
	public int setInput(HoewonVO vo) {
		int res=0;
		
		try {
			/*statement객체 사용시
			sql = "insert into hoewon values (default,'"+vo.getName()+"',"+vo.getAge()+","
					+ "'"+vo.getGender()+"','"+vo.getJoinday()+"','"+vo.getAddress()+"' )";
			//statement는 에러 발생시 값이 그대로 노출됨=보안이 떨어짐=사용안함
			stmt = conn.createStatement();
			res = stmt.executeUpdate(sql); //insert라서 update를 사용함. 1번 업데이트에1 또하번하면2 한번도업데이트안하면0
			*/
			//프리페어스테이트먼드=값 노출 안 함 에러발생시 ?가 나옴
			sql = "insert into hoewon values (default,?,?,?,?,?)";//자리에?넣음
			pstmt = conn.prepareStatement(sql);//객체 생성시 sql을 바로 넣음  프리페어스테이트먼드도 conn임 
			pstmt.setString(1, vo.getName());//물음표의 위치만 값을 넣음. 1번쨰 물음표=1
			pstmt.setInt(2, vo.getAge());
			pstmt.setString(3, vo.getGender());
			pstmt.setString(4, vo.getJoinday());
			pstmt.setString(5, vo.getAddress());
			res = pstmt.executeUpdate();//차이점 : ()에 안 넣음. 값이 들어가면 1이 res로 리턴값 줌
		} catch (SQLException e) {
			System.out.println("SQL 오류 "+e.getMessage());
		}finally {
			pstmtClose();//pstmt만 닫음
		}
		return res;
	}

	//전체 회원 검색
	public ArrayList<HoewonVO> getList() {
		ArrayList<HoewonVO> vos = new ArrayList<HoewonVO>();
		try {
			sql= "select * from hoewon order by name";
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {//한 줄 내리기 BOF에서 한 줄 내려가서 레코드 포인트에 위치함
				vo= new HoewonVO();//매번 새로운vo가 생겨야함 = 한줄이 생기지 않으면 덮어쓰기 되어 버림//위에 선언만 했으니 여기서 생성
				vo.setIdx(rs.getInt("idx"));
				vo.setName(rs.getString("name"));
				vo.setAge(rs.getInt("age"));
				vo.setGender(rs.getString("gender"));
				vo.setJoinday(rs.getString("joinday"));
				vo.setAddress(rs.getString("address"));
				
				vos.add(vo);// vo를 vos에 넣음
			}
		} catch (SQLException e) {
			System.out.println("SQL 오류 "+e.getMessage());
		} finally {
			rsClose();
		}
		return vos;
	}

	//3.개별자료 검색
	public HoewonVO getSearch(String name) {
		HoewonVO vo = new HoewonVO();
		try {
			sql= "select * from hoewon where name = ?";
			pstmt = conn.prepareStatement(sql);//sql을 conndml pstmt를 활용하여 변수에 담음
			pstmt.setString(1, name);//변수의 데이터에 타입을 부여 //물음표 자리에 ㄱ밧설정
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				vo.setIdx(rs.getInt("idx"));
				vo.setName(rs.getString("name"));
				vo.setAge(rs.getInt("age"));
				vo.setGender(rs.getString("gender"));
				vo.setJoinday(rs.getString("joinday"));
				vo.setAddress(rs.getString("address"));
			}
		} catch (SQLException e) {
			System.out.println("SQL 오류 "+e.getMessage());
		} finally {
			rsClose();//셀렉트에서만 사용
		}
		return vo;//vo가 없으면 null
	}
	
	//4.DB에서 삭제처리
	public int setDelete(String name) {
		int res = 0;
		try {
			sql ="delete from hoewon where name = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			res = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("SQL 오류 "+e.getMessage());
		} finally {
			pstmtClose();
		}	
		return res;
	}

	//회원 자료 수정
	public int setUpdate(int idx, int choice, String content) {
		 int res = 0;
		 try {
			 if(choice == 1) sql= "update hoewon set name = ? where idx = ?";
			 else if(choice == 2) sql= "update hoewon set age = ? where idx = ?";
			 else if(choice == 3) sql= "update hoewon set gender = ? where idx = ?";
			 else if(choice == 4) sql= "update hoewon set joinday = ? where idx = ?";
			 else  sql= "update hoewon set address = ? where idx = ?";
			 pstmt =conn.prepareStatement(sql);
			 
			 if (choice == 2) pstmt.setInt(1, Integer.parseInt(content));
			 else pstmt.setString(1, content);
			 
			 pstmt.setInt(2, idx);
			 res= pstmt.executeUpdate();
		 } catch (SQLException e) {
				System.out.println("SQL 오류 "+e.getMessage());
			} finally {
				pstmtClose();
			}	
		return res;
	}
}
	













