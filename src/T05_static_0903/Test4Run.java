package T05_static_0903;

//import T04_method.Test5;
//import T04_method_0903.Test6;
import T04_method_0903.*;//*=와일드카드:모든파일을다 참고하겠다

public class Test4Run {
	public static void main(String[] args) {
		Test4_import t4 = new Test4_import();
		t4.mod1();
		//같은 패키지는 상관없으나 다른패키지는 1패키지명 적음 2임포트로 걸음
//		 new T04_method_0903.Test6();//패키지 불러옴
		 new Test6();//임포트로 불러오면 상단에 임포트문이 생기고 그냐 사용가능
//		 new Test5(5);
		 new T04_method.Test4();//가장 가까운 위치를 찾음
	}
}
