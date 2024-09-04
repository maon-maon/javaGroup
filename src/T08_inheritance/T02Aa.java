package T08_inheritance;

public class T02Aa {
	int w,h, res1, res2;
	
	int areaRec(int w, int h) {
		res1 = w*h;
		return res1;
		
	}
	int lenRec(int w, int h) {
		res2 = (w*2)+(h*2);
		return res2;
	}
}
