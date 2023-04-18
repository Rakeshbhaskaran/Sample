package JAVAPractice;

public class Exception1 {
	
	public static void main(String[] args) {
		System.out.println(2);
		try {
			System.out.println(2/0);
		} catch ( ArithmeticException e) {
			System.out.println("Handled");
		}
		System.out.println(2);
	}

}
