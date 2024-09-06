package T11_interface.t02;

public class ToyRun {
	public static void main(String[] args) {
		System.out.println("연령대별 장난감 기능 현황");
		
		Toy bear = new Bear();
		Toy robot = new Robot();
		Toy tank = new Tank();
		Toy airplain = new Airplain();
		
		Toy[] toy = {bear, robot, tank , airplain};
		String[] title= {"곰돌이","로보트","탱 크","비행기"};
		
		for(int i=0; i<toy.length;i++) {
			toy[i].product(title[i]);
			toy[i].age();
			toy[i].moving();
			toy[i].fire();
			toy[i].misaile();
			System.out.println();
		}
	}
}
