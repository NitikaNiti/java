package LoveBabberArrayVideos;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n = 8;
		fib(n);
       System.out.println("answer is " + fib(n));
	}

	private static int fib(int n) {
		//base case
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		int answer = fib(n-1) + fib(n-2);
		return answer;
	}

}
