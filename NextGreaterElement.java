

import java.util.Stack;

/*

Given an array of integers(positive or negative), print the next greater element of all elements in the array.
If there is no greater element then print null.

Next greater element of an array element array[i], is an integer array[j], such that

1. array[i] < array[j]
2. i < j
3. j - i is minimum

i.e. array[j] is the first element on the right of array[i] which is greater than array[i].

For example:
Input array:  98, 23, 54, 12, 20, 7, 27

Output:
Next greater element for 23     = 54
Next greater element for 12     = 20
Next greater element for 7     = 27
Next greater element for 20     = 27
Next greater element for 27     = null
Next greater element for 54     = null
Next greater element for 98     = null

*/

public class NextGreaterElement {
	
	public static void printNextGreaterElement(int[] input) {
		
		Stack<Integer> newStack = new Stack<Integer>();
		newStack.push(input[0]);
		
		for(int i=1;i<input.length;i++){
			while(!newStack.isEmpty() && newStack.peek() < input[i]){
				System.out.println("Next greater element for " + newStack.pop() + "\t = "  + input[i]);
			}
			newStack.push(input[i]);
		}
		
		while(!newStack.isEmpty()){
			int top = (int) newStack.pop();
			System.out.println("Next greater element for "  + top + "\t = "  + null);
		}
		
	}
	
	public static void main(String[] args) {
        int[] input = { 98, 23, 54, 12, 20, 7, 27 };
        printNextGreaterElement(input);
    }
	
	

}
