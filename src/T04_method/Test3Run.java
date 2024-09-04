package T04_method;
//기본값= t31.~~ 실행시켜라
public class Test3Run {
	public static void main(String[] args) {
		Test3 t31 = new Test3();
		
		t31.su=10;//필드에 값을 주입한 방법
		t31.mod2();//mod2를 실행시켜라

		t31.mod1(20);//메소드를 통해 주입하는 방법
		t31.mod2();
	}
}
