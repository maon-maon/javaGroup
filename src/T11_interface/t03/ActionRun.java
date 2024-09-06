package T11_interface.t03;

public class ActionRun {
	public static void main(String[] args) {
		Action[] actions = {new Policeman(), new Fireman(), new Chef()};
		String[] title = {"경찰관", "소방관", "요리사"};
		//향상된 포문 for(부모타입 변수명 : 객체) {}
		int cnt = 0;
		for(Action action : actions) {
			action.person(title[cnt]);
			action.catching();
			action.search();
			action.fire();
			action.rescue();
			action.pizza();
			action.spagetti();
			System.out.println();
			cnt++;
		}
		
	}
}
