package T10_abstract;
//dog 에러줄 확인 언임플~~로 오버라이드 불러옴
public class Dog extends Animal {
	public String talk;
//	talk = "멍멍";//이렇게 사용할 수 없음(필드로사용) 부모의 메소드만 사용가능

	public Dog(String talk) {
		this.talk= talk;
	}
	
	void cry() {
		
	}

	@Override
	public void sound() {
		System.out.println("강아지 울음소리는 "+talk);
	}
	
//	public void sound() {//구현객체는 추상객체와 접근제한자가 같아야 한다? 구현객체는 퍼블릭이어야한다.
//	}
}
