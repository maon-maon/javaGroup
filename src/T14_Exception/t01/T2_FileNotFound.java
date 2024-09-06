package T14_Exception.t01;

public class T2_FileNotFound {
	public static void main(String[] args) {
		//java.lang.Object : 내장객체
		
	//꼭있어야하지만 없을수도 있음 오류빨간줄나오면 트라이/캐치로 자동 생성
		try {
			Class.forName("java.lang.Object2");
			System.out.println("찾는 파일이 존재합니다.");
		} catch (ClassNotFoundException e) {//오류가 뭔지 알수있음. 나올 수 있는 경우의 오류를 다 적어줘야함
//		} catch (Exception e) {//상세 예외 정보를 안보여줌. 최종 검수용으로 사용
//			System.out.println("찾는 파일이 없습니다.");
			// 오류를 여기서 처리하겠음
//			e.printStackTrace();//오류난걸 보여주는 기능 어떤 오류가 났는지 보여줌
//			System.out.println(e.getMessage());//오류난 부분을 축약해서 알려줌
			System.out.println("파일검색실패 "+ e.getMessage());
		}finally {
			System.out.println("실행완료 작업 끝");
		}
		
		
	}
}
