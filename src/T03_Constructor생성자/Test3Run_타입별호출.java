package T03_Constructor생성자;
//객체는 서로간에 영향을 주지 않음
public class Test3Run_타입별호출 {
	public static void main(String[] args) {
		new Test3_타입별호출();//매개변수가 없는걸 찾음
		System.out.println();
		
		new Test3_타입별호출(500);//넘겨줄 값을 적어줌/ 넘겨줄곳의타입이 같아야함 같은//매개변수가 있는걸 찾아서 건내줌
		System.out.println();
		
		new Test3_타입별호출(3.14);//같은 타입을 찾아서 넘겨준
		System.out.println("===============");
		
		Test3_타입별호출 t31 = new Test3_타입별호출();//새로운 저장소를 만드는데 Test3의 값을 복사해서 저장
		System.out.println("1 : "+t31.atom1);
		
		Test3_타입별호출 t32 = new Test3_타입별호출();//
		System.out.println("2 : "+t32.atom1);
		
		t31.atom1=-100;
		System.out.println("3 : "+t31.atom1);
		System.out.println("4 : "+t32.atom1);
		System.out.println();
		
		Test3_타입별호출 t33= new Test3_타입별호출(1234);
		t33.atom1=4321;
		System.out.println("5 : "+t33.atom1);
		System.out.println("6 : "+t31.atom1);
		System.out.println("7 : "+t32.atom1);
	}
}
