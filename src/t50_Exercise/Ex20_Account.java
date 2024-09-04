package t50_Exercise;

public class Ex20_Account {
	private String ano;		//계좌번호
	private String owner; //계좌주
	private int balnce;//입출금 금액
	
	public Ex20_Account(String ano, String owner, int balnce) {
		this.ano = ano;
		this.owner = owner;
		this.balnce = balnce;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalnce() {
		return balnce;
	}

	public void setBalnce(int balnce) {
		this.balnce = balnce;
	}
	
}
