package LoveBabberArrayVideos;

import java.util.Scanner;

public class findUnique {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {

			arr[i] = sc.nextInt();
			System.out.print(arr[i] + " ");
		}
		
      System.out.println("unique element " + findUnique(arr));
	}

	private static int findUnique(int[] arr) {
		int answer =0;
        int n =arr.length;
        for(int i=0;i<n;i++){
            answer = answer^arr[i];
        }
		return answer;
    }
}
