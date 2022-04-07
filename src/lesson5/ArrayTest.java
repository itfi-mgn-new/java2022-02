package lesson5;

import java.lang.reflect.Array;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class c = ArrayTest.class;
		Object	s = new int[] {10,20,30};
		
		System.err.println("CLass: "+s.getClass());
		System.err.println("Length: "+Array.getLength(s));
		System.err.println("s[2]:"+Array.get(s, 2));
		Array.set(s, 2, 45);
		System.err.println("s[2] after:"+Array.get(s, 2));
		
		s = Array.newInstance(int.class, 5);
		//Array.get(c, 0);
		System.err.println("Sum: "+sum(new int[] {2,4,6}));
	}

	public static int sum(Object x) {
		// TODO
	}
}
