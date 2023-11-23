package Methods;

public class Method1 {
	int a =20;
	
	public static void add() {
		System.out.println("adding");
	}
	public  static int add(int a, int b) {
		return a+b;
	}
	public  static int add(int a, int b,int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		add();
		
		System.out.println(add(10,20));
		
		System.out.println(add(10, 20, 30));
		
	}
	
	
}
