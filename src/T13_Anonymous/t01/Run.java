package T13_Anonymous.t01;

public class Run {
	public static void main(String[] args) {
		Car car = new Car(); 
		car.roll();
		car.roll2();
		System.out.println();
		car.mod1();
		car.mod2();
		System.out.println();
		
		car.mod3();//실행을 위해 moㅇ3을 만들고 그안에 만들어둔 롤과롤2가 나옴
	}
}
