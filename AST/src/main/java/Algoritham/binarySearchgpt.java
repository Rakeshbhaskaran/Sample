package Algoritham;
public class binarySearchgpt {

	// Recursive binary search method
	public static int binarySearch(int[] arr, int target, int left, int right) {
		if (left <= right) {
			int mid = left + (right - left) / 2;

			if (arr[mid] == target) {
				return mid; // Target element found
			} else if (arr[mid] < target) {
				return binarySearch(arr, target, mid + 1, right); // Search the right half
			} else {
				return binarySearch(arr, target, left, mid - 1); // Search the left half
			}
		}

		return -1; // Target element not found
	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
		int target = 12;

		int result = binarySearch(arr, target, 0, arr.length - 1);

		if (result != -1) {
			System.out.println("Element found at index " + result);
		} else {
			System.out.println("Element not found in the array.");
		}
	}
}
