package T10_abstract.Bunsik;

public abstract class Bonsa_ {
	private int kimchi, budea,bibim, sundea, bab;
//	private String[] menu= {kimchi, budea,bibim, sundea, bab};
	 
	public abstract void kimchi();
	public Bonsa_(int kimchi, int budea, int bibim, int sundea, int bab) {
		super();
		this.kimchi = kimchi;
		this.budea = budea;
		this.bibim = bibim;
		this.sundea = sundea;
		this.bab = bab;
	}
	
	 //추상메소드=메뉴
	public abstract void budea();
	public abstract void bibim();
	public abstract void sundea();
	public abstract void bab();
	
	public int getKimchi() {
		return kimchi;
	}
	public int getBudea() {
		return budea;
	}
	public int getBibim() {
		return bibim;
	}
	public int getSundea() {
		return sundea;
	}
	public int getBab() {
		return bab;
	}
}
