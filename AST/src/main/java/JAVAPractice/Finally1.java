package JAVAPractice;

public class Finally1 {
	public static void main(String[] args) {
		try {
			System.out.println(1/0);
		} catch (ArithmeticException e) {
			System.out.println(2);
		}
		finally {
			System.out.println(3);
		}
	}
}
