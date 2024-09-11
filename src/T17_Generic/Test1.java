package T17_Generic;

//하위 타입를 임의로 쓸 수 있게 함
class MyClass<T> {
//	private	String aa;//반드시 스트링으로 써야하지만 aa의 타입을 T로 쓸 수 있음
	private	T t;//반드시 스트링으로 써야하지만 aa의 타입을 T로 쓸 수 있음
	//T타입의 t가 됨
	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}


public class Test1 {
	public static void main(String[] args) {
//		MyClass<String> muc1 = new MyClass<String>();
		MyClass<String> mc1 = new MyClass<>();//T를 스트링으로 슬 수 있음
		mc1.setT("안녕");
		System.out.println(mc1.getT());
		System.out.println();
		
		MyClass<Integer> mc2 = new MyClass<>();//T에 인티저타입으로 넣겠다는 읨
		mc2.setT(100);
		System.out.println(mc2.getT());
		System.out.println();
		
	}
}
