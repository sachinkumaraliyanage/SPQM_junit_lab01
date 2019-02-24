package lab02;

public class Checkmax {
	public int chmax(int a, int b) {
		int max;
		if(a<b) {
			max=b;
		}
		else {
			max=a;
		}
		
		return max;
	}
	
	
	public int minno(int a, int b) {
		int max;
		if(a>b) {
			max=b;
		}
		else {
			max=a;
		}
		
		return max;
	}
}
