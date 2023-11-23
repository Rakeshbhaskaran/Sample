package est2;

public class Maths {
	public static void main(String[] args) throws CustomException {
	try{
		int a =1/0;
	}
	catch(ArithmeticException e) {
		throw new CustomException("Rakesh exception "+e);
	}
}
}
