package leetCode;

public class p3 {
	public static void main(String[] args) {
		String s ="abcdabcbbefhji";
		String dummy=s.charAt(0)+"";
		int count=0;
		int max=0;
		int n=1;
		for(int i=1;i<s.length();i++) {
			if(!dummy.contains(s.charAt(i)+"")) {
				dummy=dummy+s.charAt(i);
				System.out.println(n+++"\\");
			}
			else {
				System.out.println(dummy);
				System.out.println(n+++"//");
				count=dummy.length();
				dummy="";
				if(count>max) {
					max=count;
				}
			}
		}
		count=dummy.length();
		if(count>max) {
			max=count;
		}
		System.out.println(max);
		
	}

}
