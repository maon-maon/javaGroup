package T11_interface.t04;

public class Actor implements Policeman, Fireman, Chef {

	@Override
	public void pizza() {
		System.out.println("피자를 구울 수 있습니다.");
	}

	@Override
	public void spagetti() {
		System.out.println("스파게티를 조리할수있습니다.");
	}

	@Override
	public void fire() {
		System.out.println("화재진압 할 수 있습니다.");
	}

	@Override
	public void rescue() {
		System.out.println("구조활동을 할 수 있습니다.");
	}

	@Override
	public void catching() {
		System.out.println("법인을 잡을 수 있습니다.");
	}

	@Override
	public void search() {
		System.out.println("분실물을 찾아줄 수 있습니다.");
	}
	
}
