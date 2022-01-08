package LoveBabberArrayVideos;

public class QuickSortRecursion {

	public static void main(String[] args) {
		int arr[] = {2,4,1,6,9};
		int n = 5;
		int s=0;
		int e=arr.length-1;
		
		quicksort(arr,s,e);
		
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		System.out.println();

	}

	private static void quicksort(int[] arr, int s, int e) {
		//base case
		
		if(s>=e) {
			return;
		}
		//parition
		int p = parition(arr,s,e);
		
		//left part sort
		quicksort(arr,s,p-1);
		//right
		quicksort(arr,p+1,e);
		
		
	}

	private static int parition(int[] arr, int s, int e) {
		
		//find pivot
		int pivot = arr[s];
		
		int count=0;
		for(int i=s+1;i<=e;i++) {
			if(arr[i]<=pivot) {
				count++;
		}	
	}
		int temp=0;
	int pivotIndex = s+count;
	temp = arr[s];
	arr[s] = pivotIndex;
	pivotIndex = temp;
	
	//left and right ko right place
	int i = s, j=e;
	
	while(i<pivotIndex && pivotIndex<j) {
		
		while(arr[i]<=pivot) {
			i++;
		}
		while(arr[j]>pivot) {
			j--;
		}
		if(i<pivotIndex && pivotIndex<j) {
			int temp1=0;
			
			temp1 = arr[i];
			arr[i] = arr[j];
			arr[j] = temp1;
			i++;
			j--;
			
			
		}
	}
	return pivotIndex;
	
	
	}
}
