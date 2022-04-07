package lesson4;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionTest {
	public static int x = 10;
	private static final double y = 100;

	public int z = 1000;

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
		// TODO Auto-generated method stub
		final ReflectionTest	rt = new ReflectionTest();
		
//		print(rt);
//		print(5);
		Class	cc = InterfaceTest.class;

		final Field	fy = cc.getDeclaredField("a");
		
		fy.setAccessible(true);
		System.err.println("A Type: "+fy.getType());
		System.err.println("A Value: "+fy.get(null));
	
		InterfaceTest.printA();
		fy.set(null, 12);
		InterfaceTest.printA();
//		System.err.println("Y==="+InterfaceTest.a);
		Method m = cc.getMethod("printA", int.class);
		
		m.invoke(null, 1234);
		Constructor c = cc.getConstructor();
		
		InterfaceTest it = (InterfaceTest)cc.newInstance();
		
		it.printA();
	}

	public static void print(final Object something) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		final Class		cl = something.getClass();
		
		System.err.println("Name="+cl.getName());
		System.err.println("Fields: "+Arrays.toString(cl.getFields()));
		System.err.println("Declared Fields: "+Arrays.toString(cl.getDeclaredFields()));
		System.err.println("Methods: "+Arrays.toString(cl.getMethods()));
		System.err.println("Contructors: "+Arrays.toString(cl.getConstructors()));
	
		System.err.println("Parent: "+cl.getSuperclass());
		
		System.err.println("INterfaces: "+Arrays.toString(cl.getInterfaces()));
	
		final Field	f = cl.getField("z");
		
		System.err.println("Type: "+f.getType());
		System.err.println("Value: "+f.get(something));

		f.set(something, 123456);
		
		System.err.println("Z==="+((ReflectionTest)something).z);
		
		final Field	fy = cl.getDeclaredField("y");
		
		System.err.println("Y Type: "+fy.getType());
		System.err.println("Y Value: "+fy.get(something));
	
		fy.set(something, 123098.0);
		System.err.println("Y==="+((ReflectionTest)something).y);
		
		
	}
}
