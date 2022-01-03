package LoveBabberArrayVideos;

import java.util.Scanner;

public class SayDigit {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	
	String arr[] = {"zero", "one", "two", "three",  "four","five"
			, "six", "seven", "eight", "nine"};
	
	sayDigit(num, arr);

	}

	private static void sayDigit(int num, String arr[]) {
		//base case
		if(num == 0)
			return;
		
		//processing
		int digit = num%10;
		num = num/10;
		
		sayDigit(num,arr);
		System.out.print(arr[digit] +" ");
		
	}

}
