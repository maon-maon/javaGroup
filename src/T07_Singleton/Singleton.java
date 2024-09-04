package T07_Singleton;

public class Singleton {
	//2.정적필드(자신의 객체타입)를선언하고, 초기값으로 객체를 생성.: Singleton
	private static Singleton atom = new Singleton();//싱글톤객체를 생성해서 atom에 보내주고 메소드에 보내고 프라이빗잠금
	
	//1.객체를 외부에서 생성하지 못하도록 생성자 앞에 접근제한자로 private 를 붙여준다.
	private Singleton() {	}//싱글톤 기본생성자로 생성하고 프라이빗으로 잠금
	
	//3.외부에서 호출하여 사용할 수 있는 정적메소드(getter)를 만든다.
	static Singleton getInstance() {//객체 싱글톤을 스테이틱선언해서 메소드에 있는걸 인스턴스화(복제)
		return atom;//복제한 아톰을 돌려줌. 복제한건 2.에 있는 뉴 싱글을 담은 atom임
	} //2번에 스테이틱이라 3번도 스테이틱이 붙음
}
