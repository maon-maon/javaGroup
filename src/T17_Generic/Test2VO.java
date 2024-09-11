package T17_Generic;


public class Test2VO {
	private String name;
	private	int age;
	private	boolean gen;
	private	int su;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isGen() {
		return gen;
	}
	public void setGen(boolean gen) {
		this.gen = gen;
	}
	public int getSu() {
		return su;
	}
	public void setSu(int su) {
		this.su = su;
	}
	//단축키 alt+s+ent+s+s++ent+ent
	@Override
	public String toString() {
		return "Test2VO [name=" + name + ", age=" + age + ", gen=" + gen + ", su=" + su + "]";
	}
	
	
}
