package LoveBabberArrayVideos;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int start = sc.nextInt();
		int end = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {

			arr[i] = sc.nextInt();
		//	System.out.print(arr[i] + " ");
		}
		
		reverseArray(arr,n,start,end);
		printArray(arr,n);

	}

	private static void printArray(int[] arr, int n) {
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
		
	}

	private static void reverseArray(int[] arr, int n, int start, int end) {
		int temp=0;
		while(start<=end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end]= temp;
			start++;
			end--;
		}
		
	}



}
