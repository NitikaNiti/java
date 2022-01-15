package KunalKushwa;

public class NumberExampleRecursion {

	public static void main(String[] args) {
		printl(1);	

	}

	static void printl(int n) {
		
		//Base Case
		if(n==5) {
			System.out.println(5);
			return;
		}
		
		
			System.out.println(n);
			printl(n+1);
	}
}
