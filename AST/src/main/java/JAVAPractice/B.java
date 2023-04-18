package JAVAPractice;

public class B extends A{
	public void add() {
		System.out.println("Second");
		super.add();
	}
	public static void main(String[] args) {
		B b = new B();
		b.add();
	
		
	}

}
