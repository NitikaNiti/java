package array;

import java.util.Scanner;

public class RecursiveReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int start = 0;
		// System.out.println(n);

		int arr[] = new int[n];
		int nn = arr.length -1;
		for (int i = 0; i < n; i++) {

			arr[i] = sc.nextInt();
			System.out.print(arr[i] + " ");
		}
		rvereseArray(arr, start, nn);
		System.out.println();
		 printArray(arr, n);
	}
     
	private static void printArray(int[] arr, int n) {
		{
			for (int i = 0; i < n; i++)
				System.out.print(arr[i] + " ");
			System.out.println("");
		}

	}

	private static void rvereseArray(int[] arr, int start, int nn) {

		int temp;
		if (start >= nn)
			return;
		temp = arr[start];
		arr[start] = arr[nn];
		arr[nn] = temp;
		rvereseArray(arr, start + 1, nn - 1);

	}

}
