package selenium;

public class substring {
	public static void main(String[] args) {
		String s="Document No:- 3037\\27\\SMPORD/67";
		String pattern= "[0-9a-z]";
		s=s.replaceAll(pattern,"");
		System.out.println(s);
		
//		System.out.println(s.length());
//		System.out.println(s.substring(14, 31));
	}

}
