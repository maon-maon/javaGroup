package T03_Constructor생성자;

public class Test1Run {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		
		System.out.println("t1 :"+t1);
		System.out.println("t1 :"+t1.toString());//주소도 문자로 적어야 에러가 안남
	}
}
