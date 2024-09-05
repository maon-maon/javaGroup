package T10_abstract.Bunsik;

public class SeoulBunsik_ extends Bonsa_{

	
	public SeoulBunsik_(int kimchi, int budea, int bibim, int sundea, int bab) {
		super(kimchi, budea, bibim, sundea, bab);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void kimchi() {
		System.out.println(getKimchi()+" : 5,000원");
	}

	@Override
	public void budea() {
		System.out.println(getBudea()+" : 5,000원");
	}

	@Override
	public void bibim() {
		System.out.println(getBibim()+" : 5,000원");
	}

	@Override
	public void sundea() {
		System.out.println(getSundea()+" : 4,000원");
	}

	@Override
	public void bab() {
		System.out.println(getBab()+" : 무료");
	}
}
