package T04_method_0903;

public class Test6 {
	int su;//클래스에 선언한건 필드
	
	public Test6() {}//생성자(이건 기본)

	void mod1() {//()안에 타입 변수두가지가 나와야함
		System.out.println("이곳은 test6클래스의 mod1메소드입니다.");
		
		//mod2()메소드 호출
		mod2(su);
	}

	void mod2(int su) {
		System.out.println("이곳은 test6클래스의 mod2메소드입니다.su = "+su);
	}

	String integerCheck(int su) {
		String check="0"; //타입은 해당하는 메소드의 타입과 같아야 함// 초기값을 반드시 부여해야함
		if(su>0)check="양수";
		else if(su<0)check="음수";
		
		return check;//생성된 생성자는 null자동 생성
	}
	
}
