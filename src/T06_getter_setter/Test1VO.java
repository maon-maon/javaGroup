package T06_getter_setter;

public class Test1VO {
//	String name;// 디폴트
//	int age;
	private String name;//프라이빗 처리
	private int age;
	private boolean gender;
	private String job;

	public Test1VO(String name, int age, boolean gender, String job) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.job = job;
	}
	//겟/셋 자동 생성 단축키
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
		if(age<1)age=1;//유효성검사방법
		else if(age>=100) age=100;//
		this.age = age-1;//
	}
	public String getGender() {
		if(gender) return"남자";
		return "여자";//if가 거짓일때의 리턴
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}

}
