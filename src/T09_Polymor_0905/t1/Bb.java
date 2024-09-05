package T09_Polymor_0905.t1;

public class Bb extends Aa {
	public int su =20;
	public Bb() {
		System.out.println("Bb 기본생성자");
	}		

	public void modBb() {
		System.out.println("Bb의 modBb메소드");
	}
	@Override
	public void modAa() {
		System.out.println("Bb의 modAa메소드");
	}
	
}
