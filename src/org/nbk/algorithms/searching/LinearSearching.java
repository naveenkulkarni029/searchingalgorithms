package org.nbk.algorithms.searching;

public class LinearSearching {
	
	public static void main(String[] args) {
		 int arr[] = { 2, 3, 4, 10, 40 };
		 int x = 10;
		 int index = searchIndex(arr, x);
		 if(index !=-1) {
			 System.out.println("Number is present in the index "+index);
		 }else {
			 System.out.println("Number not found");
		 }
	}
	
	private static int searchIndex(int arr[], int x) {
		for(int i=0; i<=arr.length-1; i++) {
			if(arr[i]==x) {
				return i;
			}
		}
		
		return -1;
	}

}
