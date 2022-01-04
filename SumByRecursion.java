package LoveBabberArrayVideos;

public class SumByRecursion {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int n = arr.length;
		
		Sum(arr,n);

	}

	private static int Sum(int[] arr, int n) {
		
		//base case
		if(n == 0)
			return 0;
		if(n == 1)
			return arr[0];
		
		//recursive call
		int remaining = Sum(arr,n-1);
		int osum = arr[0]+remaining;
		return osum;
		
		
	}

}
