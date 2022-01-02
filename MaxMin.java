package LoveBabberArrayVideos;

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {

			arr[i] = sc.nextInt();
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		// getMax(arr, n);
		System.out.println("max value " + getMax(arr, n));
		// getMin(arr,n);
		System.out.println("min value " + getMin(arr, n));
	}

	private static int getMin(int[] arr, int n) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			if (arr[i] < min)
				min = arr[i];
		}
		return min;

	}

	private static int getMax(int[] arr, int n) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		return max;

	}

}
