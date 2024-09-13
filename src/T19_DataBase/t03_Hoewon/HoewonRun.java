package T19_DataBase.t03_Hoewon;
//이걸 메뉴 라고 부름
import java.util.Scanner;
//실제 작업 수행을 명령 유저의 값을 받음
public class HoewonRun {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HoewonDAO dao = new HoewonDAO();//3.3 서비스의 문제점해결 객체를 생성 싱글톤의 개념임 객체를 드들고 다녀야함
		HoewonService service = new HoewonService();//회원등록 입력 받아줄 서비스객체 필요함

		boolean run = true;//트루여야 무한반복함
		String name ="";
		
		while (run) {
			System.out.print("\n1.회원등록 2.전체조회 3.개별조회 4.수정 5.삭제 6.종료==> ");
			int choice = scanner.nextInt();
			
			switch (choice) {
				case 1:
					service.setInput(dao); //회원 자료 등록 //3.5 dao객체를 들고 움직임
					break;
				case 2:
					service.getListt(dao);	//회원 전체조회
					break;
				case 3:
					System.out.print("검색할 성명 입력  ");
					name = scanner.next();//이름을 입력받아
					service.getSearch(dao, name); // 회원 개별조회
					break;
				case 4:
					System.out.print("수정할 성명 입력  ");
					name = scanner.next();
					service.setUpdate(dao,name); // 회원 자료 수정
					break;
				case 5:
					System.out.print("삭제할 성명 입력  ");
					name = scanner.next();
					service.setDelete(dao, name); // 회원 자료 삭제
					break;
				default:
					run = false;
			}
		}
		System.out.println("작업 종료 ");
		dao.connClose();//3.4 여기서 닫음
		scanner.close();
	}
}
