package T10_abstract.Bunsik;

public class SeoulBunsik_ extends Bonsa_{

	
	public SeoulBunsik_() {
		super("김치찌개", "부대찌개", "비빔밥", "순대국밥", "공기밥");
		// 생성자 통해서 접근하기 때문에 메뉴 수정 불가능.
	}

	@Override
	public void kimchi() {
		System.out.println(" : 5,000원");
//		System.out.println(getKimchi()+" : 5,000원");
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
