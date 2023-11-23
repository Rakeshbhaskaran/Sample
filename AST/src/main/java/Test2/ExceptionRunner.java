package Test2;

public class ExceptionRunner {
	public static void main(String[] args) {
		try{
			throw new CustomisedException("Rakesh");
		}
		catch (CustomisedException e) {
			e.printStackTrace();
		}
	}

}
