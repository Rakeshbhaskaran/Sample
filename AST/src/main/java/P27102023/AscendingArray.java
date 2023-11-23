package P27102023;

public class AscendingArray {
	public static void main(String[] args) {
		int a[] = {4,67,2,9,78,6};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int k=0;k<a.length;k++) {
			System.out.print(a[k]+" ");
		}
	}

}
