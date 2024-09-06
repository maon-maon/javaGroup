package T11_interface.t02;

public class Bear implements Toy {
	private int age=0;
	
	@Override
	public void age() {
		System.out.println("전연령대 사용가능합니다.");
	}

	@Override
	public void moving() {
		System.out.println("팔/다리 모두 움직일 수 있습니다.");
	}

	@Override
	public void fire() {}

	@Override
	public void misaile() {}

	@Override
	public int possibleAge() {
		return age;
	}
	@Override
	public void product(String name) {
		System.out.println("장난감 이름 "+ name );
	}

}
