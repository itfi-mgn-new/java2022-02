package lesson2;

public class LifeCycleTest {
	static final int	x = 10;				// ConstValue x<-10
	static final double	y = Math.random();
	
	final int		z = 100;
	final double	t = 1234567;
	
	{
		System.err.println("LifeCycle instance");
	}
	/*	void <init>(){
	 * 		java.lang.Object.<init>();
	 * 		z = 100;
	 * 		t = 1234567;
	 * 		System.err.println("LifeCycle instance");
	 * }
	 * */
	LifeCycleTest(int aaa) {
//		 * 		java.lang.Object.<init>();
//		 * 		z = 100;
//		 * 		t = 1234567;
//		 * 		System.err.println("LifeCycle instance");
		System.err.println("My constructor");
	}
	
	public static void main(String[] args) {
		System.err.println("Hello world");
		LifeCycleTest	lct = new LifeCycleTest(123);
		
	}

	/* static void <clinit>(){
	 *   y = Math.random();
	 *   System.err.println("Lifecycle init");
	 * }
	 * */
	
	static {
		System.err.println("Lifecycle init");
	}

}
