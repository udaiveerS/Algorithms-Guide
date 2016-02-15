package search;

/**
 * My implementation of Binary search on a general Array and also 
 * prints number of comparison done. Assumes the array is 
 * sorted in acceding order 
 * return -1 if number is not found
 * @author udaiveer
 *
 */
public class Q1 {

	public static void main(String[] args) {
		int[] x = {1,2,3,4,5,6,7,8,9};
		int[] y = {9,8,7,6,5,4,3,2,1};
		
		//simple tests 
		System.out.println("element index " + binarySearch(x, 0, x.length-1, 999, 0));
		System.out.println("----------");
		System.out.println("element index " + binarySearch(x, 0, x.length-1, 3, 0));
		System.out.println("----------");
		System.out.println("Using reverse sorted list");
		System.out.println("element index " + binarySearch(x, 0, y.length-1, 999, 0));

	}

	public static int binarySearch(int[] arr,int start, int end, int target, int comparisons) {
		int middle = (start + end)/2; 
		
		/**
		 * Make sure to never allow out of bounds index 
		 * without this if statement if user asks for a unfound integer
		 * the program will stack overflow. 
		 */
		if(end < 0 || start >= arr.length) {
			System.out.println(comparisons + " comparisions made");
			return -1;
		}
		
		if(arr[middle] == target) {
			comparisons++;
			System.out.println(comparisons + " comparisions made");
			return middle;
		}
		if(target < arr[middle]) {
			return binarySearch(arr, start, middle-1, target, comparisons+1);
		}
		
		if(target > arr[middle]) {
			return binarySearch(arr, middle+1, end, target, comparisons+1);
		}
		
		System.out.println(comparisons + " comparisions made");
		return -1;
	}


}
