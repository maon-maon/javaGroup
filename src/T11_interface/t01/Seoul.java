package T11_interface.t01;
//Test1_break(정의객체)의 구현(실체)객체 : implements 걸고있음
public class Seoul implements Test1 {

	@Override
	public void date() {
		System.out.println("Seoul 클래스의 date메소드");
	}

	@Override
	public void date1(int su) {}
//	@Override//추상메소드 변경시 지우고 새로받는게 좋음
//	public void date1() {}//본인 할당없무 아닐시 처리법. 안 받는건 불가능
}
