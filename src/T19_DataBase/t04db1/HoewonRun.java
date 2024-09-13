package T19_DataBase.t04db1;

import java.util.Scanner;

public class HoewonRun {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		HoewonDAO dao = new HoewonDAO();//데이터베이스 연결 객체 한 번 열고 dao계속 들고 다니기
		HoewonService service = new HoewonService();
		
		boolean run = true;
		
		while (run) {
			System.out.println("\n 1.회원등록 2. 전체조회 3.개별조회 4.수정 5.삭제 6.종료 ==> ");
			int choice = scanner.nextInt();
			
			switch (choice) {
				case 1:
					service.setInput(dao);   //회원 자료등록
					break;

				default:
					break;
			}
		
		}
		
		
		dao.connClose();
		scanner.close();
	}
}
