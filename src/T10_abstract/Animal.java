package T10_abstract;
//추상클래스 키워드 abstract
/*추상클래스(팀프로젝트 작얼을 위한 작업지시서 역할을 하는 클래스)
 -만드는 방법 : 클래스면 앞에 'abstract'를 붙임
 -의미 : 작업지시서로서의 역할을 한다. 따라서 작업에 필요한 공통적인사항()필드,메소드를 정의만 한다.
 	즉, 추상메서드만 정의할 뿐 실체 내용(구현내용)은 기술하지 않는다.-실제로 사용할 코드를 적어주는 중괄호{}가 없다.
 -추상클래스는 생성(new)해서 사용할 수 없다. 즉, 실제로 사용하려면 추상클래스를 상속(extends)받아서만 사용할수 있다.(이렇게 상속받은 클래스를 실체(구현)클래스라고 한다.) 
  */
public abstract class Animal {
//	public abstract String talk;//추상필드는 없다.//필드는 실행블록이 없어서 사용 불가
	public String talk;//추상클래스의 필드 정의는 사용할 수 없다.
	
	public Animal() {}
	
	public abstract void sound();
//	public abstract void sound() {};//중괄호 있으면 안 됨 중괄호=사용 이란 의미
	
	public void move() {
		System.out.println("걸어갑니다.");
	}//실행블록이 있는 일반메소드// 추상메소드안에 일반메소드 써도 됨
	public void moveing() {
		System.out.println("계속 걸어갑니다.");
	}
}
