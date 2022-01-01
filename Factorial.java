package array;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int answer = factorial(n);
		System.out.println(answer);

	}

	private static int factorial(int n) {
		if(n == 0)
			return 1;
		
		int smallerProblem = factorial(n-1);
		int biggerProblem = n*smallerProblem;
		
		return n*smallerProblem;
		
	}

}
