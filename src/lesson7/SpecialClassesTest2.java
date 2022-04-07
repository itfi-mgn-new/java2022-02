package lesson7;

import java.util.Arrays;

public class SpecialClassesTest2 {
	static int x = 10;
	
	int	y = 20;

	{	// /*this*/
		int[]	z = new int[2];
		
		MyInterface	mi = new MyInterface(/*z*/) {
						// int val$z;
						{	// val$z = z;
							System.err.println("Created inside!!!!");
						}
						@Override
						public void print() {
							System.err.println("Sum:"+(x+y+z[0]));
							z[0] = 20;
						}
					};
//		z = 200;
		Class	cl = mi.getClass();

		System.err.println("Name: "+cl.getName());
		System.err.println("Superclass: "+cl.getSuperclass());
		System.err.println("Constr: "+Arrays.toString(cl.getDeclaredConstructors()));
		System.err.println("Fields: "+Arrays.toString(cl.getDeclaredFields()));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]	z = new int[2];
		
		MyInterface	mi = new MyInterface(/*z*/) {
						// int val$z;
						{	// val$z = z;
							System.err.println("Created!!!!");
						}
						@Override
						public void print() {
							System.err.println("Sum:"+(x/*+y*/+z[0]));
							z[0] = 20;
						}
					};
//		z = 200;
		Class	cl = mi.getClass();

		System.err.println("Name: "+cl.getName());
		System.err.println("Superclass: "+cl.getSuperclass());
		System.err.println("Constr: "+Arrays.toString(cl.getDeclaredConstructors()));
		System.err.println("Fields: "+Arrays.toString(cl.getDeclaredFields()));
		
		
		Object	obj = new Object() 
						{{System.err.println("sdhjkshfdkjashdjkh");}};
		
		class LocalClass {
			
		};
						
		LocalClass lc = new LocalClass();
		
		SpecialClassesTest2	scp2 = new SpecialClassesTest2();
		
//		MyInterface	mi2 = new MyInterface() {
//						@Override
//						public void print() {
//						}
//					};
//		Class	cl2 = mi2.getClass();
//	
//		System.err.println("Name2: "+cl2.getName());
	}
}

interface MyInterface {
	void print();
}
