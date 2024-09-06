package T11_interface.t02;

public class Tank implements Toy {
	private int age=13;
	
	@Override
	public void age() {
		System.out.println(age+"세 이상만 사용가능합니다.");
	}

	@Override
	public void moving() {}

	@Override
	public void fire() { 
		System.out.println("레이저빔을 발사 기능이 있습니다.");
	}

	@Override
	public void misaile() {
		System.out.println("미사일 발사 기능이 있습니다.");
	}

	@Override
	public int possibleAge() {
		return age;
	}
	@Override
	public void product(String name) {
		System.out.println("장난감 이름 "+ name );
	}
}
