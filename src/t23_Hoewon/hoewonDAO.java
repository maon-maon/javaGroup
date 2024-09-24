package t23_Hoewon;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

@SuppressWarnings({"rawtypes","unchecked"})
public class hoewonDAO extends DBConn {
	hoewonVO vo = null;
	String sql = "";
	
	
	//회원 전체 조회
	public Vector getHoewonList(){
//		ArrayList<hoewonVO> vos = new ArrayList<hoewonVO>(); //스윙에선 사용 못 함 스윙이 옛날거임
		Vector vDate = new Vector(); 
		try {
			sql ="select * from hoewon";  //DBConn을 상속받았으니 변수 필드에 안 올리고 바로 사용 가능함
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
//				Vector vo = new Vector<>(); //부모타입이 없으므로 vector이 부모타입으로 들어감= 제네럴이 없어서
				Vector vo = new Vector();
				vo.add(rs.getInt("idx"));
				vo.add(rs.getString("name"));
				vo.add(rs.getInt("age"));
				vo.add(rs.getString("gender"));
				vo.add(rs.getString("joinday"));
				vo.add(rs.getString("address"));
				
				vDate.add(vo);
			}
		} catch (SQLException e) {
			System.out.println("SQL 오류 "+e.getMessage());
		}
		finally {
			rsClose();
		}
		return vDate;
	}

//회원 가입처리
	public int sethoewonInput(hoewonVO vo) {
		int res = 0;
		try {
			sql ="insert into hoewon values(default,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setInt(2, vo.getAge());
			pstmt.setString(3, vo.getGender());
			pstmt.setString(4, vo.getJoinday());
			pstmt.setString(5, vo.getAddress());
			res = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("SQL 오류 "+e.getMessage());
		}
		finally {
			pstmtClose();
		}
		return res;
	}
	
	
//오름차순
	public Vector gethoewonAlign(String str, String order){
		Vector vDate = new Vector(); 
		try {
			if(order.equals("a")) {
				sql ="select * from hoewon order by joinday";
			}
			else if(order.equals("d")){
				sql ="select * from hoewon order by joinday desc";
			}
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Vector vo = new Vector();
				vo.add(rs.getInt("idx"));
				vo.add(rs.getString("name"));
				vo.add(rs.getInt("age"));
				vo.add(rs.getString("gender"));
				vo.add(rs.getString("joinday"));
				vo.add(rs.getString("address"));
				
				vDate.add(vo);
			}
		} catch (SQLException e) {
			System.out.println("SQL 오류 "+e.getMessage());
		}
		finally {
			rsClose();
		}
		return vDate;
	}
	
//조건검색처리
	public Vector getConditionSearch(String str, String txtCondi) {
		Vector vDate = new Vector(); 
		try {
			sql ="select * from hoewon where "+ str +" like ?  order by name";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%"+txtCondi+"%");
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Vector vo = new Vector();
				vo.add(rs.getInt("idx"));
				vo.add(rs.getString("name"));
				vo.add(rs.getInt("age"));
				vo.add(rs.getString("gender"));
				vo.add(rs.getString("joinday").substring(0, 10));
				vo.add(rs.getString("address"));
				
				vDate.add(vo);
			}
		} catch (SQLException e) {
			System.out.println("SQL 오류 "+e.getMessage());
		}
		finally {
			rsClose();
		}
		return vDate;
	}
	
	
}
