

/*

Given an array of size n, find a peak element in the array. Peak element is the element which is greater than or equal to its neighbors.

For example - In Array {1,4,3,6,7,5}, 4 and 7 are peak elements. We need to return any one peak element.

 */
public class PeakElement {
	
	 public static void main(String[] args) {
		 int[] array = { 15, 20, 25, 35, 45, 50, 60 };
		 Integer peak = getPeakElement(array);
		 System.out.println(peak != null ? "Peak Element is "  + peak : "No peak element!" );
	}
	
	 public static Integer getPeakElement(int[] array) {
		 
		 int start = 0;
		 int end = array.length-1;
		 
		 while(start<=end){
			 int mid = (start+end)/2;
			 
			 if ((mid == 0 || array[mid - 1] <= array[mid]) && (mid == array.length - 1 || array[mid] >= array[mid + 1])){
				 return mid;
			 }else if(array[mid]<array[mid-1]){
				end = mid - 1;
			 }else if(array[mid]<array[mid+1]){
				 start = mid + 1;
			 }
		 }
		 
		 return null;

	}

}




