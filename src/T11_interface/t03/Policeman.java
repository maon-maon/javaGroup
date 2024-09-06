package T11_interface.t03;

public class Policeman implements Action{

	@Override
	public void catching() {
		System.out.println("범인을 잡습니다.");
	}

	@Override
	public void search() {
		System.out.println("물건을 찾습니다.");
	}

	@Override
	public void fire() {}

	@Override
	public void rescue() {}

	@Override
	public void pizza() {}

	@Override
	public void spagetti() {}

//	@Override//동일내용 구현객체 나머지 2곳에 반복됨
//	public void person(String actor) {
//		System.out.println(actor + "의 역할 ");		
//	}//액션에서 디폴트로 처리

}
