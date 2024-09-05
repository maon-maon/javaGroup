package T09_Polymor_0905.t1;
//자동타입변환
public class T1Run {
	public static void main(String[] args) {
	 Aa	aa= new Aa();
	 System.out.println();
	 
	 Bb	bb= new Bb();
//	 Ff ff =bb;//상속이 아난 관계를 끌어올 수 없음
	 Aa a1 = bb;//상속관계된 타입으로 변경 가능 bb가 Aa타입 상속 받음//bb가 아닌 aa의 ㅏㅈ료만 받을 수 잇음
	 System.out.println("su :"+a1.su);//Aa로 타입이 바뀌었으니 Aa에 있는 su값을 받음
	 System.out.println();
	 
	 Cc cc = new Cc();
	 System.out.println();
	 
	 Aa a2 = new Cc();//A타입을 가진 c라서 A클래스창에 있는 su를 불러옴
	 System.out.println("su :"+a2.su);
	 System.out.println();
	 
	 Dd dd = new Dd();
	 System.out.println();
	 
	 Bb b1 = new Dd();
	 System.out.println("su :"+b1.su);
	 System.out.println();
	 
	 Aa a3 = new Dd();//d위치에서 상속b상송a의 기본생성자 실행되고 그 다음에 a타입의 su가 실행됨
	 System.out.println("su :"+a3.su);
	 System.out.println();
	 

	 
	}
}
