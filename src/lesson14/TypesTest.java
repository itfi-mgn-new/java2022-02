package lesson14;

import java.util.Arrays;
import java.util.List;

public class TypesTest<T extends Number, T2> {
//	public static T statVal;
	public T	value;
	public T2   zzz;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class	cl = TypesTest.class;
		TypesTest<Integer,String>	tt1 = new TypesTest<>();
		TypesTest<Float,List<String>>	tt2 = new TypesTest<>();
		
		System.err.println("Fields: "+Arrays.toString(cl.getFields()));
		String[] s = concat(String.class, new String[0], new String[0]);
		Integer[] s1 = concat(Integer.class, new Integer[0], new Integer[0]);
	}
	
	public static <T> T[] concat(Class<T> cl, T[]... values) {
		return null;
	}

	public static Object[] concat1(Object[]... values) {
		return null;
	}
	
	public static <TT> void print(TT value) {
		TT value2 = value;
	}
}
