package shivparvatialgortithm;

/*
 * Maximum of three products elements in an array
 * 
 * 
 * source reference for question:Codility practise problem
 */

import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

public class ThreeProduct {
	public int solution(int[] A) {

		Arrays.sort(A);
		int middle = 0;

		for (int i = 0; i < A.length; i++) {
			if (A[i] >= 0) {
				middle = i;
			}

		}

		int max = 0;
		int max1 = 0;
		
		
		//most important point
		//we have to choose from only two option

		max1 = A[0] * A[1] * A[A.length - 1];

		int max2 = 0;
		max2 = A[A.length - 1] * A[A.length - 2] * A[A.length - 3];
		if (max1 > max2) {
			max = max1;
		} else {
			max = max2;
		}
		return max;

	}
}
