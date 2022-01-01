package array;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
      //  System.out.println(n);
        
        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
        	
        	arr[i] = sc.nextInt();
        	System.out.print(arr[i] +" ");
        }
        printArray(arr,n);
        printingArray(arr, n);
  
       
        
        
	}

	private static void printingArray(int[] arr, int n) {
		 System.out.println();
	        for(int i=0;i<arr.length;i++) {
	        	System.out.print(arr[i] + " ");
	        }
	        
		
	}

	private static void printArray(int[] arr, int n) {
	      int temp=0;
	        for(int i=0;i<n;i++,n--) {
	        	temp = arr[i];
	        	arr[i] = arr[n-1];
	        	arr[n-1] = temp;   	
	        }
		
	}

}
