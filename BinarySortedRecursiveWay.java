package LoveBabberArrayVideos;

public class BinarySortedRecursiveWay {

	public static void main(String[] args) {
		int arr[] = {3,2,4,9,9,9};
		int n = arr.length;
		
		boolean answer = binary(arr,n);
		
		if(answer) {
			System.out.println("array is sorted");
		}
		else
		{
			System.out.println("array is not sorted");
		}
	}

	private static boolean binary(int[] arr, int n) {
		if(n==0 || n==1) {
			return true;
		}
		if(arr[0]>arr[1])
			return false;
		else {
			boolean remaininghalf = binary(arr , n-1);
			return remaininghalf;
		}
		
		
		
	}

}
