package T17_Generic;

public class Test2Run {
	public static void main(String[] args) {
		Test2VO t2VO = new Test2VO();
		
		t2VO.setName("홍길동");
		t2VO.setAge(20);
		t2VO.setGen(true);
		t2VO.setSu(100);
		
		System.out.println(t2VO.getName());
		System.out.println(t2VO.getAge());
		System.out.println(t2VO.isGen() ? "남자":"여자");
		System.out.println(t2VO.getSu());
	}
}
//이렇게 쓴걸 컬렉션 프레임웤에 사용
