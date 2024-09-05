package T10_abstract.t1111;
//여기필드는 여기서 사용
public abstract class Phone {
	private String name;
	
	public Phone(String name) {
		this.name = name;
	}
	
	//추상메소드 //:폰을 상속받는 클래스는 무조건 추상메소드를 사용해라
	public abstract void function();
	public abstract void sound();

	//일반메소드 
	public void powerOn() {
		System.out.println(name+"님의 전화기 전원을 켭니다.");
	}
	public void powerOff() {
		System.out.println(name+"님의 전화기 전원을 끕니다.");
	}
	
	public String getName() {
		return name;
	}
	
	public void functionSamsung() {}
	public void functionLg() {}
}
