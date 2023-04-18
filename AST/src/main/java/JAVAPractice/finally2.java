package JAVAPractice;

public class finally2 {
	public static void main(String[] args) {
	
		try {
			System.out.println(1);
		}
		finally {
			System.out.println(9);
		}
		try {
			System.out.println("hi");
		}
		catch(Exception e) {
			System.out.println("hi");
		}
		finally {
			System.out.println("hi");
		}


	}
}
