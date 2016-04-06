

import java.util.Arrays;

/*

Given an array of size n, find the element which occurs more than n/2 times. This element is called Majority Element.

For example: 

Array 1: {2 6 2 2 6 2 2 8 2 1}
Majority Element: 2

Array 2: {1 7 8 2 6 8 1 3 2 8}
Majority Element: none
 
 */

public class FindMajorityElement {
	
	public static void main(String[] args) {
	
	        int[] array = { 2, 6, 2, 2, 6, 2, 2, 8, 2, 1 };
	        System.out.println(Arrays.toString(array) + " \nMajority Element: "  + getMajorityElement(array));
	
	    }
	
	public static Integer getMajorityElement(int[] array){
		
		if (array == null || array.length == 0) {
	            return null;
	        }
		
		// find the 'candidate' 
		int count = 0;
		Integer candidate = null;
		
		for(int a:array){
			if (count == 0) {
	                candidate = a;
	                count = 1;
	                continue;
	            } else {
	                if (candidate == a) {
	                    count++;
	                } else {
	                    count--;
	                }
	            }
		}
		
		// no number found
		
		if(count==0) return null;
		
		// check if candidate is the max
		
		count = 0;
		
		for(int a:array){
			if(a==candidate) count++;
		}
		
		return (count > array.length / 2) ? candidate : null;
	}
	

}