package T10_abstract;

public class Run {
	public static void main(String[] args) {
//		new Animal();//추상클래스는 생성할 수 없다.
		
		Dog dog = new Dog("웡웡");
		dog.sound();
		System.out.println();
		
		Cat cat = new Cat();
		cat.sound();
	}
}
