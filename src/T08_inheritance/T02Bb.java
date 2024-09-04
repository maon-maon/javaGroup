package T08_inheritance;
//원의 면적 /둘레
public class T02Bb extends T02Aa{
	double pi=3.14;
	int r;
	
	double areaCircle(int r) {
		return r*r*Math.PI;}
		
	double lenCircle(int r) {
		return 2*Math.PI;
	}
}
