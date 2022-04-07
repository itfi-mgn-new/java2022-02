package lesson7;

public class SpecialClassesTest5 {
	static int x1 = 10;
	
	int	x2 = 20;
	
	{
		callPrint((x)->System.err.println("oior8947"+x1+x2));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		callPrint(new TestLambda() {
			@Override
			public void print(int x) {
				System.err.println("URA!!!!");
			}
		});
		TestLambda t = SpecialClassesTest5::mamamia; 
		// print t = mamamia;
		// (*t)(120);
		callPrint(t);
		// invokedynamic
	}

	static void callPrint(TestLambda tl) {
		tl.print(123);
	}
	
	static void mamamia(int x) {
		System.err.println("slkdfjlkdflkjsdlkfj");
	}
}

@FunctionalInterface
interface TestLambda {	// typedef void (*print)(int);
	void print(int x);
	default void aaa() {}
}
