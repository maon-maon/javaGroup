package T11_interface.t01;
//인터페이스의 모든 메소드=추상메소드// 인터페이스에서의 일반적 쓰는 방법
public interface Test1 {
//	 int max = 100000;//final static 더는 못바꿈=상수=대문자작성
//	 final static int MAX = 100000;//상수=대문자작성
//	 public final static int MAX = 100000;//접근제한자는 기본설정 공공개방형=퍼블릭
	 int MAX = 100000;//final static 생략가능// !!대부분 양식으로 씀
	 int MIN = 0;

//	public void date();
//	public abstract void date();//당연히 추상메소드이므로 abstract 생략가능
	void date();
	void date1(int su);
	
	//인터페이스에서 추상클래스가 아닌 일반메소드를 쓰고 싶을때 사용 자바8부터 적용
	default void date2() {
		//실행항 내용을 포함/생략
		System.out.println("Test1의 date2 default");
	}//일반메소드를 사용하고 샆은경우 자바8부터
	static void date3() {
		System.out.println("Test1의 date3 static");
	}
}
