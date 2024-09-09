package T15_API.t06_Math;

import java.util.Random;

public class Test2 {
	public static void main(String[] args) {
		Random random = new Random();
		System.out.println(random.nextInt());//기본적으로 2의32승 범위의 정수형난수
		System.out.println(random.nextLong());// 2의64승 범위의 정수형난수
		System.out.println(random.nextDouble());// 실수형난수
		System.out.println(random.nextFloat());// 실수형난수
		System.out.println(random.nextBoolean());// 논리형난수
		System.out.println();
		
		
		System.out.println("0~10미만의 정수: "+random.nextInt(10));
		System.out.println("1~10까지의 정수: "+(random.nextInt(10)+1));
		System.out.println("5~10까지의 정수: "+(random.nextInt(10+1-5)+5));
		System.out.println("20~30까지의 정수: "+(random.nextInt(30+1-20)+20));
		
		Random rnd =new Random(100);
		for(int i=1;i<=6;i++) {
//			System.out.print(rnd.nextInt(45+1-1)+1+" " );
			System.out.print(rnd.nextInt(45)+1+" " );
		}
		
	}
}
