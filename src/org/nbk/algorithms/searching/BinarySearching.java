package org.nbk.algorithms.searching;

public class BinarySearching {

	
	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 10, 40 }; 
		int key = 30;
		int indexRecursive = binarySearchRecursive(arr,0, arr.length-1, key);
		int indexLoop = binarySearchLoop(arr, 0, arr.length-1, key);
		if(indexRecursive==-1) {
			System.out.println("not found Recursive");
		}else {
			System.out.println("found in indexRecursive "+indexRecursive);
		}
		
		if(indexLoop==-1) {
			System.out.println("not found indexLoop");
		}else {
			System.out.println("found in indexLoop "+indexLoop);
		}
	}

	private static int binarySearchRecursive(int[] arr, int low, int high, int key) {
		if(high>=low) {
			int mid = low + (high - low) / 2;
			if(arr[mid]==key) {
			return mid;
		}
		if(key<arr[mid]) {
			return binarySearchRecursive(arr, low, mid-1, key);
		}
		return binarySearchRecursive(arr, mid+1,high, key);
		}
		return -1;
	}
	
	private static int binarySearchLoop(int[] arr, int low, int high, int key) {
		while (high>=low) {
			int mid = low+(high-low)/2;
			if(arr[mid] == key) {
				return mid;
			}
			if(key < arr[mid]) {
				high = mid-1;
				continue;
			}
			low = mid+1;
		}
		return -1;
	}
}
