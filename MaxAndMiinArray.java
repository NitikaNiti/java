package array;

import java.util.Arrays;
import java.util.Scanner;

public class MaxAndMiinArray {
	static class Pair{
		int min;
		int max;
		
	}


	public static void main(String[] args) {
		
		
		int arr[] = {1000,11,445,1,330,3000};
		int arr_size=6;
		Pair minmax = getMinMx(arr ,arr_size);
		System.out.printf("\nMinimum element is %d", minmax.min);
        System.out.printf("\nMaximum element is %d", minmax.max);
	
	}

	private static Pair getMinMx(int[] arr, int n) {
		Pair minMax = new Pair();
		int i;
		
		if(n%2==0) {
			if(arr[0]>arr[1]) {
				minMax.min = arr[1];
				minMax.max = arr[0];
			}else {
				minMax.min = arr[0];
				minMax.max = arr[1];	}
			i=2;
		}else {
			minMax.min = arr[0];
			minMax.max = arr[0];
			i=1;
		}
		
		while(i<n-1) {
			if(arr[i] > arr[i+1]) {
				if(arr[i] > minMax.max) {
					minMax.max = arr[i];
				}
				if(arr[i+1] > minMax.max) {
					minMax.max = arr[i+1];
				}
				if(arr[i]< minMax.min) {
					minMax.min = arr[i];
				}
			}
			i +=2;
		}
		
		return minMax;
		
		
	}

}
