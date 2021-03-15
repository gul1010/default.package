package ReviewContinue;

public class nestefor {

	public static void main(String[] args) {
		
		for(int i=1; i<3; i++) {
			System.out.println("Outer loop");
			
			for (int j=1; j>=3; j++) {
				System.out.println("Inner loop");
			}
		}
	}

}
