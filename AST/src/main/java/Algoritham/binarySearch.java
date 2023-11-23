package Algoritham;

public class binarySearch {
	
	public static void main(String[] args) {
		int arr[]= {2,4,6,8,9,10,13,16,18,20,24,30,32,45,56};
		System.out.println("hello");
		int index=binarySearch(arr, 0, arr.length-1, 6);
		System.out.println(index);
	}
	public static int binarySearch(int arr[],int left, int right,int target) {
		
		if(left<=right) {
		int mid=left+(right-left)/2;
		
		if(arr[mid]==target) {
			return mid;
		}
		else if(arr[mid]<target) {
			return binarySearch(arr, mid+1, right, target);
		}
		else if(arr[mid]>target) {
			return binarySearch(arr, left, mid-1, target);
		}
		}
		
		return -1;		
		
	} 

}
