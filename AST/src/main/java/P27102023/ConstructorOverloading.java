package P27102023;

public class ConstructorOverloading {
	{
		System.out.println("nb1");
	}
	{
		System.out.println("nb2");
	}
	
	public ConstructorOverloading(int d) {
		System.out.println("double");
	}
	public ConstructorOverloading(float f) {
		System.out.println("float");
	}
	public static void main(String[] args) {
		ConstructorOverloading c = new ConstructorOverloading(6);
		ConstructorOverloading d = new ConstructorOverloading(6.6f);
		
	}

}
