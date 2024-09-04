package T05_static_0903;

public class Test1Run {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		System.out.println("t1.su "+t1.su);//힙에 저장된걸 불러옴
		//위 아래 같은 값을 다른 저장소에 하나씩 만드는건 좋지않음 공간낭비
		t1.add(50, 100);//바람직하지 못한 사용의 예
		
		System.out.println("su : "+Test1.su);//객체 없이 사용됨 생성하지 않음//공통 사용함 메소드메모리에 올라감 메소드메모리에서 불러옴
		Test1.add(100,200);
	}
}
