package LoveBabberArrayVideos;

import java.util.Scanner;

public class SwapAlternate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			System.out.print(arr[i] + " ");
		}
		int sizen = arr.length;
			swap(arr, n);
			printArray(arr, n);
		

	}

	private static void swap(int[] arr, int sizen) {
		
		for (int i = 0; i < sizen; i=+2) {
			int temp = 0;
			if(i+1<sizen) {
			temp = arr[i+1];
			arr[i+1] = arr[i];
			arr[i] = temp;
			}

		}

	}

	private static void printArray(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

}
