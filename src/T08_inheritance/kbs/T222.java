package T08_inheritance.kbs;

import T08_inheritance.mbc.T111;

public class T222 extends T111 {
  public	int a2 =10;
	protected int b2 =20;
	int c2 =30;
	private int d2 =40;
	
	public void modA2() {
		System.out.println("T222_modA2메소드");
	}
	protected void modB2() {
		System.out.println("T222_modB2메소드");
	}
	void modC2() {
		System.out.println("T222_modC2메소드");
	}
	private void modD2() {
		System.out.println("T222_modD2메소드");
	}
	@Override//부모위치의 것 오버라이드함
	public void mul(int su1, int su2) {
		int res = su1 *su2;
//		System.out.println("두 수의 곱은 "+(res+a1+b1+c1+d1));
		System.out.println("두 수의 곱은 "+(res+a1+b1));//b1은 패키지가 달라도 부모객체를 상속받음=protect 선언되어 사용가능.
	}
}
