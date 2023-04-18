package JAVAPractice;

public class cc4 extends cc3{
	static {
		System.out.println("cc4 static block 1");
	}
	{
		System.out.println("cc4 non static 1");
	}
	static {
		System.out.println("cc4 static block 2");
	}
	{
		System.out.println("cc4 non static 2");
	}
	cc4(){
		this(10);
		System.out.println("cc4  constructor non-par");
	}
	cc4(int a){
		super(2);
		System.out.println("cc4  constructor par");
	}
	public static void main(String[] args) {
		cc4 a= new cc4();
	}

}
