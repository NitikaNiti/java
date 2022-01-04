package LoveBabberArrayVideos;

public class binarySearfchCodeStudio {

	public static void main(String[] args) {
		int arr[] = { 1 ,3 ,7 ,9 ,11 ,12, 45};
		int n = arr.length-1;
		int x = 3;
		 
		int ans =  binary(arr, x) ;
		System.out.println(ans);

	}

	private static int binary(int[] arr, int x) {
		int s = 0;
		int e = arr.length - 1;

		if (s > e)
			return -1;
		int mid = s + (e - s) / 2;

		if (arr[mid] == x)
			return mid;

		if (arr[mid] < x) {
			s = mid + 1;
			return binary(arr, x);
		} else {
			e = mid - 1;
			return binary(arr, x);
		}
	}

}
