package lab02;



public class MainCl {

	public static void main(String[] args) {
		
		
		Checkmax a= new Checkmax();
		
		int b=a.chmax(2, 3);
		
		if(b==3) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}

	}

}
