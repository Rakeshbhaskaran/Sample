package Test;

public class FetchOnlyTheNumbersfromString {
	public static void main(String[] args) {
		String a="avsxjhs kjgsbk456 gjhgsj7v5u89hb dc09";
		a=a.replaceAll("[^0-9]", "");
		System.out.println(a);
	}

}
