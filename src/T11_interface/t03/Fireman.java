package T11_interface.t03;

public class Fireman implements Action{

	@Override
	public void catching() {}

	@Override
	public void search() {}

	@Override
	public void fire() {
		System.out.println("화재를 진압합니다.");
	}

	@Override
	public void rescue() {
		System.out.println("인명구조 활동을 합니다.");
		};

	@Override
	public void pizza() {}

	@Override
	public void spagetti() {}

}
