package T19_DataBase.t03_Hoewon;

public class HoewonVO {
	//SQL의 필드명과 동일해야 함
	//만들어야 할 것들을 리스트화
	private int idx;
	private String name;
	private int age;
	private String gender;
	private String joinday;
	
	
	private String address;
	
	int getIdx() {
		return idx;
	}
	void setIdx(int idx) {
		this.idx = idx;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getAge() {
		return age;
	}
	void setAge(int age) {
		this.age = age;
	}
	String getGender() {
		return gender;
	}
	void setGender(String gender) {
		this.gender = gender;
	}
	String getJoinday() {
		return joinday;
	}
	void setJoinday(String joinday) {
		this.joinday = joinday;
	}
	String getAddress() {
		return address;
	}
	void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "HoewonVO [idx=" + idx + ", name=" + name + ", age=" + age + ", gender=" + gender + ", joinday=" + joinday
				+ ", address=" + address + "]";
	}
}
