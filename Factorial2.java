package array;

import java.util.Scanner;

public class Factorial2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int ans = power(n);
		System.out.println(ans);
		

	}

	private static int power(int n) {
		//base case
		if(n==0)
			return 1;
		//recursive relation
		int sp = power(n-1);
		int bp = 2*sp;
		
		
		return bp;
	}

}
