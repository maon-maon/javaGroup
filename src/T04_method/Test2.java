package T04_method;
//라이브러리 클래스
public class Test2 {
	void mod1 () {
		System.out.println("안녕1");
	}
	//매개변수의 타입이 다름
	void mod1 (String name) {//타입이 추가됨
		System.out.println(name+"안녕1");
	}
	
	void mod1 (String name,int age) {//타입 종류가 다르고 갯수가 늘어남
		System.out.println(name+"안녕1, 나이는"+age);
	}
	
	void mod1 (int age,String name) {//타입 순서가 다름
		System.out.println(name+"안녕1, 나이는"+age);
	}

//	void mod1 (String name,int nai) {//변수 이름이 다르더라도 같은 변수를 사용했으면 오류발생
//		System.out.println(name+"안녕1, 나이는"+nai);
//	}
//	String mod1 (int age,String name) {
//		return (name+"안녕1, 나이는"+age);//출력 앞에 리턴이 앞에 붙으면 바로 리턴되기 떄문에 출력 안 됨
//	}
}