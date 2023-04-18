package JAVAPractice;

public class ascii {
	public static void main(String[] args) {
		String s="Abhi";
		int sum=0;
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
			sum=sum+s.charAt(i);
			
		}
		System.out.println("sum of "+s+" is:"+sum);
	}

}
