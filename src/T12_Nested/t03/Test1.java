package T12_Nested.t03;

//중첩클래스 : 로컬클래스(메소드 안에 생성되는 클래스)
public class Test1 {
	public int su = 100;
	
	public Test1(){
		System.out.println("Test1클래스");
	}
	
	public void modTest1(){//일반메소드
		System.out.println("Test1클래스의 modTest1메소드");
	}
	
	public void modClass(){//이 안에서 
		int atom = 900;
		System.out.println("Test1클래스의 modClass메소드, atom =" +atom);
		
		class Aa{//이 선언부를 사용하려면 생성해야하는데 메서드 블럭안에서만 가능함
			int suA = 550;//필드
			
			public Aa() {//생성자
				System.out.println("Test1클래스 안의 modClass()메소드 안의 Aa클래스");
			}
			
			public void modTest1A() {
				System.out.println("Test1클래스 안의 modClass()메소드 안의 modTest1A메소드");
			}
		}
		//로컬클래스는 메서드 안에서 생성되기에, 메서드 안에서만 사용가능함. 메소드를 벗어나면 클래스는 소멸된다.
		System.out.println("!!!!!!!!!!!!!!!!!!!!");
		System.out.println();
		
		Aa aa=new Aa();
		System.out.println("중첩클래스(로컬클래스)안의 suA : "+aa.suA);
		aa.modTest1A();//modClass수행될때 Aa가 사용됨
		
		
	}
}
//메소드 안에서 클래스 정의하고 메소드 만들어서 사용함. 전체클래스생성>그안의 메소드사용>그안의클래스>그안의 메소드 사용