package LoveBabberArrayVideos;

import java.util.Scanner;

public class SumOfAllElementsInArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {

			arr[i] = sc.nextInt();
			System.out.print(arr[i] + " ");
			
		}
		System.out.println();
		System.out.println("sum is " + printSum(arr,n));
	}

	private static int printSum(int[] arr, int n) {
		int sum=0;
		for(int i=0;i<n;i++) {
			sum +=arr[i];
			
		}
		return sum;
		
	}

}
