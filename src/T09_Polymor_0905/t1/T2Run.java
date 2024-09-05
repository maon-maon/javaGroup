package T09_Polymor_0905.t1;
//강제 타입변환
public class T2Run {
	public static void main(String[] args) {
		Aa aa = new Aa();
		
//		Cc cc = a1;//처음부터 부모객체가 자식객체로 타입변환될수는 없다.
		// 부모객체가 자식객체로 타입변환을 하기 위해서는 무조건 자식객체가 부모 타입으로 변환했을떄만 가능하다(강제 casting)
		Bb bb = new Bb();
		System.out.println("su : "+bb.su);//b의 su인쇄
		Aa a1= bb;
		System.out.println("su : "+a1.su);//타입변환된Aa의su인쇄
		System.out.println();
		
		Bb b1 = (Bb)a1;//자식이 부모로 올라갔다가 부모가 자식으로 내려옴=자식인b가 찍혀야함
		System.out.println("su : "+b1.su);
		System.out.println();
		//Bb로 생성했던 bb를 Aa타입으로 변환하고 다시 Bb타입으로 변환 (Bb)로 캐스팅
		Aa a2 = new Dd();
		System.out.println("1.su : "+a2.su);
		System.out.println();//Dd가 생성된걸 Aa타입 변수a2에 담았으니 d기준으로 실행해서 abd su 순으로 출력
		
		Dd d1 = (Dd) a2;
		System.out.println("2.su : "+d1.su);
		System.out.println();
		
		Bb b2=(Bb) a2;
		System.out.println("3.su : "+b2.su);
		b2.modAa();
		System.out.println();//Aa를 오버라이딩했기 떄문에 Bb가 실행됨
				
		//Cc객체가 Aa로 타입변환된 적이 없기에, a2객체는 Cc객체로 타입변환불가이다.(컴파일상에서 에러가 발생하지 않음. 실행시 오류가 남)
//	  Cc c1= (Cc)a2;
//	  System.out.println("su :"+c1.su);//출력시 오류가 발생
//	  System.out.println();
		 
		//Override 적용시
		Aa a3 =new Bb();//Up Casting
		System.out.println("4.su : "+a3.su);
		a3.modAa();//타입 A로 변한 B상태에서 B에 a메소드를 오버라이드하면 타입a 상태에서 b의 메소드 하나가 사용 가능해
		System.out.println();
		//왜냐면 변수는 바꿔도 문제가 발생하지 않음. b에 있는 기능을 뽑아쓰려는 목적
		Bb b3=(Bb) a3;//Down casting
		System.out.println("5.su : "+b3.su);
		b3.modBb();
		b3.modAa();//오바라이딩 된 Aa
	}
}
