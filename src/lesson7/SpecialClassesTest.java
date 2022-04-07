package lesson7;

import java.util.Arrays;

public class SpecialClassesTest {
	static int	x = 10;
	
	int	y = 100;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println("Name: "+InnerClass.class.getName());
		System.err.println("Canonical Name: "+InnerClass.class.getCanonicalName());
		System.err.println("Constructors:"+Arrays.toString(InnerClass.class.getDeclaredConstructors()));
		System.err.println("Fields:"+Arrays.toString(InnerClass.class.getDeclaredFields()));
		
		SpecialClassesTest	t = new SpecialClassesTest();
		
		InnerClass	ic = t.new InnerClass(/*t*/); 
		InnerClass	ic2 = t.new InnerClass(/*t*/); 

		System.err.println("Constructors:"+Arrays.toString(InnerStaticClass.class.getDeclaredConstructors()));
		System.err.println("Fields:"+Arrays.toString(InnerStaticClass.class.getDeclaredFields()));

		InnerStaticClass	icc = new InnerStaticClass();
	}
	
	private class InnerClass {
		static final int qqq = 10;
		// SpecialClassesTest this$0;
		// InnerClass(SpecialClassesTest owner) {
		// 	this$0 = owner;
		// }
		int	z = 300;
		void print() {
			int	t = 400;
			System.err.println("Sum="+(x+/*this$0.*/y+/*this.*/z+t));
		}
	}

	private static class InnerStaticClass {
		// SpecialClassesTest this$0;
		// InnerClass(SpecialClassesTest owner) {
		// 	this$0 = owner;
		// }
		static int www = 10;
		int	z = 300;
		void print() {
			int	t = 400;
			System.err.println("Sum="+(x+/*this.*/z+t));
		}
	}

}
