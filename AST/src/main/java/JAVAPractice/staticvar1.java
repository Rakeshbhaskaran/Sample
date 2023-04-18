package JAVAPractice;

public class staticvar1 {
	static int a=0;
	int b=0;
	public static void main(String[] args) {
		
		staticvar1 gun = new staticvar1();
		gun.a=20;
		gun.b=20;
		
		staticvar1 bun = new staticvar1();
		System.out.println(bun.a);
		System.out.println(bun.b);
		
		
	}

}
