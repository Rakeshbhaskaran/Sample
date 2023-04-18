package JAVAPractice;

public class staticMethodOR2 extends staticMethodOR1 {
	
	int a=100;
	int b=200;
	int c=300;
	 void dummy() {
		System.out.println("dumm2");
	}
	 void add(int a) {
		 
	 }
	 public static void main(String[] args) {
		 staticMethodOR2 b= new staticMethodOR2();
		 b.dummy();
		
		 staticMethodOR1 a= new staticMethodOR1();
		 a.dummy();
		 a=b;
		 a.dummy();
		staticMethodOR1 a1 = new staticMethodOR2();//upcasting
		a1.dummy();
		 
	}

}
