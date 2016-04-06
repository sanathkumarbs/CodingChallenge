
/*
 
Given an integer array and a number k, print the maximum sum subarray of size k.

Maximum average subarray of size k is a subarray (sequence of contiguous elements in the array) 
for which the average is maximum among all subarrays of size k in the array.

Average of k elements = (sum of k elements)/k

Since k > 0, the maximum sum subarray of size k will also be maximum average subarray of size k.
So, the problem reduces to finding maximum sum subarray of size k in the array.

*/

public class MaxAvgSubArrayOfSizeK {
	
	public static void main(String[] args) {
	        int[] input = {11, -8, 16, -7, 24, -2, 3};
	        int[] ip = new int[10];
	        int k = 3;
	        MaxAvgSubarray(input, k);
	    }
	
	public static void MaxAvgSubarray(int[] input, int k){
		
		if(k<input.length){
			
			int maxSum = 0;
			int sum; 
			
			for(int i=0;i<k;i++){
				maxSum += input[i];
			}
			
			sum = maxSum;
			int node = 0;
			
			for(int i = 1; i<input.length-k;i++){
				sum = sum - input[i-1] + input [i];
				
				if(sum>maxSum){
					maxSum = sum;
					node = i;
				}
			}
			
			System.out.println("Max Subarray is : " +maxSum);
			
			System.out.print("[");
			
			for(int i=node;i<node+k;i++){
				System.out.print(+input[i] +" ");
			}
			
			System.out.print("]");
		}else{
			System.out.println("Invalid");
		}
		
		
		
	}
	
	

}


