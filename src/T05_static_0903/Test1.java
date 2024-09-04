package T05_static_0903;

public class Test1 {
	static int su=100;//메소드영역에 저정된 메모리

	static void add(int su1, int su2) {
		int res = su1+su2;
		System.out.println(su1+"+"+su2+"="+res);
	}
}
