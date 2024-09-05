package T10_abstract;

public class Cat extends Animal {
	public String talk = "야옹";
	
		void sori() {
			
		}

		@Override
		public void sound() {
			System.out.println("고양이 울음소리는 "+talk);
		}
		
		public void work() {
//			sound();//추상메소드 선언한것: 내용 아무것도 없음=의미없음 내용 자식이 넣어서 쓰라는것
			move();
		}
}
