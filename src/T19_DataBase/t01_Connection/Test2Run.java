package T19_DataBase.t01_Connection;
// 사용자가 사용하는 뷰
public class Test2Run {
	public static void main(String[] args) {
		Test2DAO dao=new Test2DAO(); //데이터베이스 연동 오픈작업 1.
		
		Test2Service service = new Test2Service();//서비스 작업 2.
		
		service.getDBProcessMethod(); //실행
		
		dao.dbClose();// DB연결종료
		
		System.out.println("작업 끝!");
	}
}
