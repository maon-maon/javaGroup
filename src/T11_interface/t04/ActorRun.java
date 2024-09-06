package T11_interface.t04;

public class ActorRun {
	public static void main(String[] args) {
		System.out.println("배우는 다음과 같은 역할을 할 수 있습니다.");
		Actor actor = new Actor();
		System.out.println();
		
		System.out.println("경찰관의 역할");
		actor.catching();
		actor.search();
		System.out.println();
		
		System.out.println("소방관의 역할");
		actor.fire();
		actor.rescue();
		System.out.println();
		
		System.out.println("요리사의 역할");
		actor.pizza();
		actor.spagetti();
		System.out.println();
	}
}
