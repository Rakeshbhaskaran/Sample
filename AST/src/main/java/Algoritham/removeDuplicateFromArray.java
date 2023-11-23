package Algoritham;

import java.util.Arrays;

public class removeDuplicateFromArray {
	
	public static void main(String[] args) {
		int a[]= {34,5,6,4,5,6,7,34,1,2,83,3,34};
		
		//first arrange array in ascending order
		Arrays.sort(a);
		
		//Remove duplicates
		int k=0;// new indexing number
		for(int i=0;i<a.length-1;i++) {
				if(a[i]!=a[i+1]) {
					a[k++]=a[i];
				}
		}
		
		//last value will be missed so add that too
		a[k++]=a[a.length-1];
		
		//create a new unique array
		int uniqueArr[] = new int[k];
		
		//add values to new unique array
		for(int i=0;i<k;i++) {
			uniqueArr[i]=a[i];
	}
		//printing unique array
		for(int i=0;i<uniqueArr.length;i++) {
			System.out.print(uniqueArr[i]+" ");
		}

}}
