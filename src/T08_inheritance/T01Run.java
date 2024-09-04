package T08_inheritance;

public class T01Run {
		public static void main(String[] args) {
			T01_C	t01 =new T01_C();
			
			t01.mod2();//t01의 mod2를 실행시켜라
			
			int res =t01.absMod(-5);//-05를 넣어 absMod를 res값에 보내서 res출력
			System.out.println("1.res = "+res);
			
			res = t01.add(10, 20);//t01의 
			System.out.println("2.res = "+res);
			
		}
}
