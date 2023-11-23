package Strings;

public class RemoveDuplicatesString {
	
	public static void main(String[] args) {
		String s ="Javavav";
		String n="";
		for(int i=0;i<s.length();i++) {
			if(!n.contains(s.charAt(i)+"")) {
				n=n+s.charAt(i);
			}
			
			}
			System.out.println(n);
		}
	

}
