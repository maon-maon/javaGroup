package T15_API.t01_Object;

public class Test2VORun {
	public static void main(String[] args) {
		Test2VO vo = new Test2VO();//VO객체는 생성해서 사용
		
		String name = "김말숙";
		int age=25;
		boolean gender = false;
		String job ="";
		String address = "청주";
		
		vo.setName(name);
		vo.setAge(age);
		vo.setGender(gender);
		vo.setJob(job);
		vo.setAddress(address);
		
		System.out.println("성명 "+vo.getName());
		System.out.println("성명 "+vo.getName().toString());
		System.out.println("나이 "+vo.getAge());
		System.out.println("성별 "+vo.isGender());
		System.out.println("직업 "+vo.getJob());
		System.out.println("주소 "+vo.getAddress());
		System.out.println();
		
		//만약 tostring이 따로 정의 되지 않으면 주소값이 나옴
		//VO객체에 오브젝트로 정의된 toString이 자동으로 필드(데이터값)를 전송해줌 
		//변수의 값을 찍는 용도 = 값이 제대로 옮겨졌는지 확인
		System.out.println("vo.toString() : "+vo.toString());
		System.out.println("vo :            "+vo);//toString 생략가능
		
	}
}
