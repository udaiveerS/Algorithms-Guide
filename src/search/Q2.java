package search;

/**
 * A sorted array has been rotated so that the elements might 
 * appear in the order 3 4 5 6 7 1 2 How would you find
 * the minimum element?
 * 
 * Question from CareerCup.com
 * @author udaiveer
 *
 */
public class Q2 {
	public static void main(String[] args) {
		int[] arr1 = {3,4,5,6,7,1,2}; 
		int[] arr2 = {16,17,18,19,20,21,22,23,24,25,2,3}; 
		int[] arr3 = {10,11,12,1,2,3}; //perfect split
		int[] arr4 = {10,11,12,13,14,15,7}; //single element

		System.out.println(findMin(arr1, 0, arr1.length-1, arr1[0]));
		System.out.println(findMin(arr2, 0, arr2.length-1, arr2[0]));
		System.out.println(findMin(arr3, 0, arr3.length-1, arr3[0]));
		System.out.println(findMin(arr4, 0, arr4.length-1, arr4[0]));

	}
	
	public static int findMin(int[] arr, int start, int end, int left) {
		int mid = (start + end) / 2; 
		//array is always increasing except at the point mid < left 
		if(start == end || arr[mid] < arr[mid-1]) {
			return arr[mid];
		}		
		
		// not in valid index range yet -> drop all stuff on the right
		if(arr[mid] > left) {
			return findMin(arr, mid+1, end, left);
		}
		
		// in valid index range now -> drop stuff on left
		// mid is already checked for bing a solution and can
		// be safely dropped 
		if(arr[mid] < left) {
			return findMin(arr, start, mid-1, left);
		}
		
		return -1;
	}
}
