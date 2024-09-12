package T19_DataBase.t02_DBTest;

public class TestRun {
	public static void main(String[] args) {
		TestDAO dao = new TestDAO();
		
		dao.getList();	//회원 test테이블의 전체 자료 조회
		
		dao.dbClose();
		
		System.out.println();
		System.out.println("작업 끝");
	}
}
