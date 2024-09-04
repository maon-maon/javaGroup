package T03_Constructor생성자;

public class Test3_타입별호출 {//클래스블럭:선언
//  기본생성자
	Test3_타입별호출(){}
	
	int atom1 = 30;
//아래부분이 생성자 : 생성자역할=값을 받아주는것
//	public Test3_타입별호출() {//실행블럭=생성자블럭//이게 기본생성자
//		System.out.println("atom1 : "+atom1);
//	}
	
	public Test3_타입별호출(int atom1) {//사용자정의생성자=생성자오버로딩함//run의 값을 넘겨받음
		this.atom1= atom1;//넘겨받은값을 필드의(위에 선언된)atom에 넘겨줌
		System.out.println("atom1 : "+atom1);//매개변수값찍음 이 클래스에서선언한
		System.out.println("this.atom1 : "+this.atom1);//필드를찍
		
		this.atom1+=atom1;
		System.out.println("this.atom1 : "+this.atom1);
	}
	
	//필드: 클래스영역에 저장한 변수만 필드=속성이 필드
//	int atom1 = 30;//동일변수는 1번만 지정 가능
	int atom2;//네임이 다르므로 사용가능
	double atom3;//타입이 다르므로 사용가능
	
	Test3_타입별호출(double aa3){
		this.atom3 = atom3;//atom3(필드변수) = aa3(매개변수)
		System.out.println("this.atom3 : "+this.atom3);
	}
	
	
}
