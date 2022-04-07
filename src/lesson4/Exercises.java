package lesson4;

import java.lang.reflect.Field;

public class Exercises {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		System.err.println("Sum="+calculate(new MyChildClass()));
		callPrint(new MyChildClass());
	}

	public static void callPrint(final Object something) {
//		value=10
//		value=20
		// find print(int) method and call it with all the int fields of class
	}
	
	public static int calculate(final Object something) throws IllegalArgumentException, IllegalAccessException {
		// find all int fields and calculate sum of their content
		int	sum = 0;
		Class	c = something.getClass();
		
		do {
			for (Field f : c.getDeclaredFields()) {
				if (f.getType() == int.class) {
					sum += f.getInt(something);
				}
			}
			c = c.getSuperclass();
		} while (c != null);
		
		return sum;
	}
}

class MyClass {
	static int x = 10;
	static int y = 20;
	
	public static void print(int value) {
		System.err.println("value="+value);
	}
}

class MyChildClass extends MyClass {
}