package JAVAPractice;

public class methodOverlodding {
	int d=20;
	public static void sub() {
		System.out.println("sub");
		
	}
	public void add() {
		System.out.println("add");
		sub();
	}
	public static void main(String[] args) {
		
		methodOverlodding m= new methodOverlodding();
		m.add();
	}

}
