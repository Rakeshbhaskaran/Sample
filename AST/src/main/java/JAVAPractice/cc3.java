package JAVAPractice;

public class cc3 {
	static {
		System.out.println("cc3 static block 1");
	}
	{
		System.out.println("cc3 non static 1");
	}
	static {
		System.out.println(" cc3 static block 2");
	}
	{
		System.out.println("cc3 non static 2");
	}
	cc3(){
		System.out.println("cc3 constructor non-par");
	}
	cc3(int a){
		System.out.println("cc3 constructor par");
	}
}
