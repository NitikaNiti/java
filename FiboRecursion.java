package KunalKushwa;

public class FiboRecursion {

	public static void main(String[] args) {
		fibo(10);
		System.out.println(""+ fibo(6)) ;

	}
	static int fibo(int n) {
		//base Case
		
		if(n==0) {
			return n;
		}
		if(n==1) {
			return n;
		}
		
		return fibo(n-1) + fibo(n-2);
	}

}
