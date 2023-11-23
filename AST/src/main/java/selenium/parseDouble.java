package selenium;

public class parseDouble {
	public static void main(String[] args) {
		
      String s1="16,770.00";
      String s2="300";
      String v1=s1.replace(",", "");
      String v2=s2.replace(",","");
      Double d1=Double.parseDouble(v1);
      Double d2=Double.parseDouble(v2);
      Double o=d1+d2;
      System.out.println(o);
      
	}

}
