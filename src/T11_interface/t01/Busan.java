package T11_interface.t01;

public class Busan implements Test1 {

	@Override
	public void date() {
		System.out.println("Busan 클래스의 date메소드");
	}

	@Override
	public void date1(int su) {
//		System.out.println("Busan 클래스의 date1메소드");
		int sori=0;
		if(su>MAX) sori = MAX;
		else if(su<MIN) sori = MIN;
		System.out.println("sori : "+sori);
	}

//	@Override
//	public void date1() {
//		System.out.println("Busan 클래스의 date1메소드");
//	}

}
