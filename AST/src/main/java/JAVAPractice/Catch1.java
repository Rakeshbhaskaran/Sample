package JAVAPractice;

public class Catch1 {
	public static void main(String[] args) {
		try {
			System.out.println(1);
			System.out.println(2/0);
		} catch (NullPointerException e) {
			System.out.println(3);
		}
	}

}
