package org.nbk.algorithms.searching.problems;

public class MissingNumber {

	public static void main(String[] args) {
		 int a[] = {1,2,3,5,6}; 
		 
		 int missingNumber = missingNumber(a, a.length);
		 System.out.println(missingNumber);
	}

	private static int missingNumber(int[] a, int length) {
		int total = 0;
		total = (length+1)*(length+2)/2;
		for(int i=0; i <length; i++) {
			total-=a[i];
		}
		return total;
	}
	
}
