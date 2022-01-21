package KunalKushwa;

public class MaxElement {

	public static void main(String[] args) {
		int arr[] = {1,3,23,9,18};
		System.out.println(max(arr));

	}

	static int max(int[] arr) {
		int MAX = Integer.MIN_VALUE;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>MAX) {
				MAX = arr[i];
			}
		}
		
		return MAX;
	}

}
