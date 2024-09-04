package t50_Exercise;

public class T2VO {
 private String name;
 private int age;
 private String address;
 private String gender;
 //
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public boolean setAge(int age) {
	if(age<20 || age>=90 ) {
		System.out.println("나이의 범위를 벗어났습니다.");
		return false;
	}
	else {
		this.age = age;
		return true;
	}
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	if(address.equals("0"))this.address ="외국인";
	else this.address = address;
}
public String getGender() {
	return gender;
}
public void setGender(int sex) {//받은값은 int라도
	if(sex == 1 ||sex == 3) this.gender = "남자";//지금 페이지젠더가 string으로 되어 있으니 스트링임 
	else this.gender = "여자";
}
 
 
}
