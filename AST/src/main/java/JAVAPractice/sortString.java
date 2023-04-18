package JAVAPractice;

import java.util.Arrays;

public class sortString {
	public static void main(String[] args) {
		String s[]= {"8","4","3","17","16","18","23","41"};
		Arrays.sort(s);
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
	}

}
