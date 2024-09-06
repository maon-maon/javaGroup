package T10_abstract.Bunsik;

public class WoojuBunsik_ extends Bonsa_{

	

	public WoojuBunsik_() {
		super("김치찌개", "부대찌개", "비빔밥", "순대국밥", "공기밥");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void kimchi() {
		System.out.println(getKimchi()+" : 6,000원");
	}

	@Override
	public void budea() {
		System.out.println(getBudea()+" : 7,000원");
	}

	@Override
	public void bibim() {
		System.out.println(getBibim()+" : 7,000원");
	}

	@Override
	public void sundea() {
		System.out.println(getSundea()+" : 6,000원");
	}

	@Override
	public void bab() {
		System.out.println(getBab()+" : 1,000원");
	}
}
