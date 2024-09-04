package T07_Singleton;

public class TestRun {
	public static void main(String[] args) {
//		new Singleton();//프라이빗이라 못 만듦 1.
//		Singleton.atom;//2.필드명(=클래스이름)에 접근 못함. 프라이빗이라
		
		Singleton mbc = Singleton.getInstance();//mbc가 생성한건 아니지만 get으로 호출해서 불러 쓴것
		Singleton kbs = Singleton.getInstance();
		Singleton sbs = Singleton.getInstance();
		
		if(mbc == kbs)System.out.println("mbc와 kbs는 같은 객체를 가리킵니다.");
		else System.out.println("mbc와 kbs는 다른 객체를 가리킵니다.");
		if(mbc == sbs)System.out.println("mbc와 kbs는 같은 객체를 가리킵니다.");
		else System.out.println("mbc와 sbs는 다른 객체를 가리킵니다.");
		
	}
}
