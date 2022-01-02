package LoveBabberArrayVideos;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {

			arr[i] = sc.nextInt();
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		Boolean found =	search(arr,n,k);
		if(found) {
			System.out.println("key is present");
		}
		else {
			System.out.println("key is not present");
		}

	}

	private static Boolean search(int[] arr, int n, int k) {
		for(int i=0;i<n;i++) {
			if(arr[i] == k) {
				return true;
			}
		}
		return false;
		
		
		
	}

}
