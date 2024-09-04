package T04_method;

public class Test5 {
	int volume;
	
	public Test5(int volume) {
		this.volume=volume;
	}
	
	void volumeUp() {
		if(volume<10) volume++;
		volumePrint();
	}
	void volumeDw() {
		if(volume>0) volume--;
		volumePrint();
	}
	
	void volumePrint() {
		System.out.println("현재 volume"+this.volume);
	}
}