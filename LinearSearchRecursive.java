package LoveBabberArrayVideos;

public class LinearSearchRecursive {

	public static void main(String[] args) {
		int arr[] = { 3, 5, 1, 2, 6 };
		int startindex=0;
		int lastindex = arr.length-1;
		int key = 6;

		boolean ans = Search(arr, startindex,lastindex, key);
		if (ans) {
			System.out.println("found");
		} else {
			System.out.println("not found");
		}

	}

	private static boolean Search(int[] arr,int startindex, int lastindex, int key) {

		print(arr,lastindex);
		
		if(lastindex < startindex)
			return false;
		if (arr[startindex] == key) {
			return true;
		}

		else {
			return Search(arr, startindex+1,lastindex, key);
			
		}

	}

	private static void print(int[] arr, int lastindex) {
		System.out.println("lastindex" + lastindex);
		
		for(int i=0;i<lastindex;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		
	}
}
