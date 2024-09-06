package T10_abstract.Bunsik;

public class WangjaBunsik_ extends Bonsa_ {

	

	public WangjaBunsik_() {
		super("김치찌개", "부대찌개", "비빔밥", "순대국밥", "공기밥");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void kimchi() {
		System.out.println(getKimchi()+" : 4,500원");
	}

	@Override
	public void budea() {
		System.out.println(getBudea()+" : 5000원");
	}

	@Override
	public void bibim() {
		System.out.println(getBibim()+" : 6000원");
	}

	@Override
	public void sundea() {
		System.out.println(getSundea()+" 미판매");
	}

	@Override
	public void bab() {
		System.out.println(getBab()+" : 1000원");
	}
}
