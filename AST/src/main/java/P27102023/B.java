package P27102023;

public class B implements A{

	@Override
	
	public void add() {
		
		System.out.println("sub add");
	}
	
	public static void main(String[] args) {
		A a1 = new B();
		System.out.println(A.a);
		
	}

}
