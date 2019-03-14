package org.nbk.algorithms.searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearching {

	
	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 10, 40 }; 
		int key = 10;
		int indexRecursive = binarySearchRecursive(arr,0, arr.length-1, key);
		int indexLoop = binarySearchLoop(arr, 0, arr.length-1, key);
		int indexCollection = binarySearchCollection(arr, key);
		int indexArrays = binarySearchArray(arr, key);
		
		printIndex(indexRecursive);
		printIndex(indexLoop);
		printIndex(indexCollection);
		printIndex(indexArrays);
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
	
	private static int binarySearchCollection(int[] arr, int key) {
		List<Integer> intCollection = new ArrayList<>();
		for(int i=0; i<=arr.length-1;i++) {
			intCollection.add(arr[i]);
		}
		Collections.sort(intCollection);
		return Collections.binarySearch(intCollection, key);
	}
	
	private static int binarySearchArray(int[] arr, int key) {
		Arrays.sort(arr);
		return Arrays.binarySearch(arr, key);
	}
	
	private static void printIndex(int index) {
		if(index==-1) {
			System.out.println("not found");
		}else {
			System.out.println("found in index "+index);
		}
	}
}
