package T10_abstract.Bunsik;

public abstract class Bonsa_ {
//	private int kimchi, budea,bibim, sundea, bab;
//	private String[] menu= {kimchi, budea,bibim, sundea, bab};
	private String kimchi, budea,bibim, sundea, bab;
	 
	public Bonsa_(String kimchi, String budea, String bibim, String sundea, String bab) {
		super();
		this.kimchi = kimchi;
		this.budea = budea;
		this.bibim = bibim;
		this.sundea = sundea;
		this.bab = bab;
	}
	
	 //추상메소드=메뉴
	public abstract void kimchi();
	public abstract void budea();
	public abstract void bibim();
	public abstract void sundea();
	public abstract void bab();
	
	
	public String getKimchi() {
		return kimchi;
	}
	public String getBudea() {
		return budea;
	}
	public String getBibim() {
		return bibim;
	}
	public String getSundea() {
		return sundea;
	}
	public String getBab() {
		return bab;
	}
	
	 
	
}
