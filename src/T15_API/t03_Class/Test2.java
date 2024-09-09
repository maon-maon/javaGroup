package T15_API.t03_Class;
//Class 존재 확인
//자료식 만들떄 사용
public class Test2 {
	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String");
			
			//객체의 정보(Test1_break.class) 알아내어 출력하기 : Class=클래스를 찾는 명령어
			Class clazz = Test1.class;//Test1_break.class이 파일의 내용을 Class타입으로 변수에 저장
			System.out.println("전체이름(패키지명.파일명) : "+clazz.getName());//getName:현재 존재위치 알려줌
			System.out.println("패키지명 : "+clazz.getPackage());
			System.out.println("타입명 : "+clazz.getTypeName());
			System.out.println("Simple이름 : "+clazz.getSimpleName());
			
			Class imgPath = Test2.class;
			System.out.println("Test2_return_정상종료.class의 경로 : "+clazz.getResource("Test2_return_정상종료.class").getPath());
			System.out.println("Test2_return_정상종료.class의 경로 : "+imgPath.getResource("Test2_return_정상종료.class").getPath());
			//자기자신으로 만들어도 됨 변수명(clazz, imgpath)으로 불러옴
			System.out.println("그림파일의 경로(1.jpg) : "+imgPath.getResource("1.jpg").getPath());
			System.out.println("그림파일의 경로(11.jpg) : "+imgPath.getResource("./image/11.jpg").getPath());
			//나를 .(점)으로 표시  .=자기자신 /=아래(하위폴더)
			System.out.println("현재 작업경로의 루트(/) : "+imgPath.getResource("/").getPath());
			System.out.println();
			System.out.println("패키지를 통한 경로 : "+imgPath.getResource("/T15_API/t03_Class/image/12.jpg"));
			// /(=루트 의미. src루트)T15_API/(=경로의미)t03_Class/image/12.jpg
			
		} catch (ClassNotFoundException e) {
			System.out.println("String클래스가 존재하지 않습니다."+e.getMessage());
		}
		System.out.println("작업 끝");
		
	}
}
