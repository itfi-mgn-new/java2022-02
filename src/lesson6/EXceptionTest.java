package lesson6;

public class EXceptionTest {
	public static void error(int code) throws RuntimeException, Exception, Throwable {
		switch (code) {
			case 0 :	throw new RuntimeException("Runtime!!!");
			case 1 :	throw new Exception("Exception!!!");
			case 2 :	throw new Throwable("Throwable!!!");
			default:
		}
	}
	
	public static void nestedError(int code) throws Throwable {
		try {
			error(code);
		} catch (Exception e) {
			System.err.println("Nested exception: "+e.getMessage());
			throw new RuntimeException(e);
		} finally {
			System.err.println("Nested finally");
		}
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		new Throwable();
//		throw new Throwable("AAAAAA!");
//		System.err.println("X/y="+(x/y));
//		try {
//			int	x = 10, y = 0;
//			System.err.println("X/y="+(x/y));			
//		} catch (ArithmeticException exc) {
//			System.err.println("Error processing");
//		} finally {
//			System.err.println("FInal");
//		}
		
		for (int index = 0; index <= 3; index++) {
			try {
				nestedError(index);
				System.err.println("Success");
			} catch (RuntimeException e) {
				System.err.println("Runtime: "+e.getMessage());
			} catch (Exception e) {
				System.err.println("EXception: "+e.getMessage());
			} catch (Throwable e) {
				e.printStackTrace();
				System.err.println("Throwable: "+e.getMessage());
			} finally {
				System.err.println("FINALLY");
			}
		}
	}
}
