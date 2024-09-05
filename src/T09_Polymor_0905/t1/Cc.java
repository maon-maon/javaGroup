package T09_Polymor_0905.t1;

public class Cc extends Aa {
	public int su =30;//필드 변수에서 접근제한자 안 쓰면 default로 인식됨
	public Cc () {
		System.out.println("Cc 기본생성자");
	}		

	private void modCc() {
		System.out.println("Cc의 modCc메소드");
	}
}
