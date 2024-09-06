package T11_interface.t03;

public class Chef implements Action {

	@Override
	public void catching() {}

	@Override
	public void search() {}

	@Override
	public void fire() {}

	@Override
	public void rescue() {}

	@Override
	public void pizza() {
		System.out.println("피자를 굽습니다.");
	}

	@Override
	public void spagetti() {
		System.out.println("스파게티를 조리합니다.");
	}

}
