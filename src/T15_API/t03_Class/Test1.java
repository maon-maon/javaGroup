package T15_API.t03_Class;
//Class.forName : 1.동일이름존재 확인 2.그림파일 존재확인
public class Test1 {
	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String2");//java.lang.String2라는 이름이 존재라는지 확인
			System.out.println("String클래스가 존재합니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("String클래스가 존재하지 않습니다."+e.getMessage());
//			e.printStackTrace();
		}
		System.out.println("작업 끝");
		
	}
}
