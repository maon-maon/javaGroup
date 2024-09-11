package T15_API.t01_Object;
// VO / DTO 객체 : 구현객체를 정의해 놓은 객체
//toString
public class Test2VO_공부용 {
 private String name;
 private int age;
 private boolean gender;
 private String job;
 private String address;
 
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public boolean getGender() {
//		return gender;
//	}
//	public void setGender(boolean gender) {
//		this.gender = gender;
//	}
//	public String getJob() {
//		return job;
//	}
//	public void setJob(String job) {
//		this.job = job;
//	}
//	public String getAddress() {
//		return address;
//	}
//	public void setAddress(String address) {
//		this.address = address;
//	}
//	
//	@Override//Source-제네레이터toString-
//	public String toString() {
//		return "Test2VO [name=" + name + ", age=" + age + ", gender=" + gender + ", job=" + job + ", address=" + address
//				+ "]";
//	}
	
	//모든 VO뒤에는 toString이 붙어야 함. 이게 없으면 필드가 아닌 주소값이 찍힘. 이게 있으면 필드가 출력됨 
	//변수의 값을 찍는 용도 = 값이 제대로 옮겨졌는지 확인
	//겟/셋은 무조건 만들어야 함
//	@Override
//		public String toString() {
//			return "T02TreeMap [name= "+name+";, age = "+age+",gender= "+gender+",job = "+job+",address =,"+address+"]";
//		}
	
}
