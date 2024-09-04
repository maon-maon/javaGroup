package T04_method;

public class Test1 {
	int su1;
	double su2;
	String name = "홍길동";
	
//기본생성자
	public Test1() {}
	
//사용자정의생성자
	Test1(int su1){
		this.su1=su1;
		System.out.println("this.su1 :"+this.su1);
	}
	
	void mod1(){//리턴타잆없음.여기서만 출력하고 끝 run으로 안 넘김
		
	}
	
	int mod2(){//리턴이 있으니 값의 타입을 적어줌 숫자 100이라서 int
		return 100;
	}
	
	 void mod3(int su1) {//실행라이브러리에서 입력받은 500을 필드변수로 보낸다음 필스변수를 출력함
		this.su1 += su1;//실행에서 입력받은 값을 필드변수로 보냄
		System.out.println("this.su1 :"+this.su1);
	}
	 
	 void mod4() {
		 System.out.println(name+"님 안녕하세요");
	 }
	 
	 void mod5(String name) {
		 this.name = name;//필드에 저장
		 System.out.println(this.name+"님 안녕하세요");//필드에 저장시킨걸 불러옴
	 }
}
