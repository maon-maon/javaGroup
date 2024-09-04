package T08_inheritance;

public class T04_C extends T04_P{
	public T04_C(int su) {//사용자가 넘긴 값
		super(su);//부모에게 값을 여기서 넘김
		System.out.println("T04_C클래스");
	}
}
